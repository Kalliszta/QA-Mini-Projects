package rps.task;

import java.util.Random;

public class GameLogic {
	Random rand = new Random(); //random must be here as when it comes InjectMocks the rand variable must be an instance variable not within a method as then it cannot access it
	
	public Outcome play(RPS input) { // camelCase for methods too!!!!!

		if (input == null) {
			return null;
		}
		return getOutcome(input, generateRandom());
	}

	public RPS generateRandom() {
		int i = rand.nextInt(3);
		//to make 1-3 instead of 0-2 would just do i+= 1 on this line (so the next line after random)
		RPS generated = null;
		if (i == 0) {
			generated = RPS.ROCK;
		} else if (i == 1) {
			generated = RPS.PAPER;
		} else {
			generated = RPS.SCISSORS;
		}
		return generated;
	}

	public Outcome getOutcome(RPS input, RPS gen) {
		if (input == gen) {
			return Outcome.DRAW;
		} else if ((input == RPS.ROCK && gen == RPS.SCISSORS) || (input == RPS.PAPER && gen == RPS.ROCK) || (input == RPS.SCISSORS && gen == RPS.PAPER)) {
			return Outcome.WIN;
		} else {
			return Outcome.LOSE;
		}
	}
}
