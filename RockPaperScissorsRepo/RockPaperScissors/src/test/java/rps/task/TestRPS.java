package rps.task;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestRPS {
	
	@Mock
	private Random rand;
	
	@InjectMocks
	private GameLogic rpsGame;
	
	@Test
	public void testDrawRock() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(0);
		assertEquals(Outcome.DRAW,this.rpsGame.play(RPS.ROCK));
	}
	
	@Test
	public void testDrawPaper() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(1);
		assertEquals(Outcome.DRAW,this.rpsGame.play(RPS.PAPER));
	}
	
	@Test
	public void testDrawScissors() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(2);
		assertEquals(Outcome.DRAW,this.rpsGame.play(RPS.SCISSORS));
	}
	
	@Test
	public void testWinRock() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(2);
		assertEquals(Outcome.WIN,this.rpsGame.play(RPS.ROCK));
	}
	
	@Test
	public void testLoseRock() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(1);
		assertEquals(Outcome.LOSE,this.rpsGame.play(RPS.ROCK));
	}
	
	@Test
	public void testWinPaper() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(0);
		assertEquals(Outcome.WIN,this.rpsGame.play(RPS.PAPER));
	}
	
	@Test
	public void testLosePaper() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(2);
		assertEquals(Outcome.LOSE,this.rpsGame.play(RPS.PAPER));
	}
	
	@Test
	public void testWinScissors() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(1);
		assertEquals(Outcome.WIN,this.rpsGame.play(RPS.SCISSORS));
	}
	
	@Test
	public void testLoseScissors() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(0);
		assertEquals(Outcome.LOSE,this.rpsGame.play(RPS.SCISSORS));
	}
	
	@Test
	public void invalidChoice() {
		assertEquals(null,this.rpsGame.play(null));
	}
	
}
