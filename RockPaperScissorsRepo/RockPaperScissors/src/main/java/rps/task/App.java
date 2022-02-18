package rps.task;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GameLogic playGame = new GameLogic();

		System.out.println("Enter one of the following: ROCK, PAPER, SCISSORS");
		RPS input = RPS.valueOf((scan.nextLine()).toUpperCase()); // converts String to ENUM if can
		System.out.println(playGame.play(input));
	}
}
