package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	private static AthleticGame ag;
	
	@BeforeClass
	public static void init() {
		ag = new AthleticGame("sportTest");
	}
	
	@Before
	public void before() {
		ag.start();
	}
	
	@After
	public void after() {
		ag.reset();
	}

	@Test
	public void getWinnerTest() {
		Instant partecipante1Instant = Instant.ofEpochSecond(100);
		ag.addArrival("partecipante1", partecipante1Instant);
		
		Instant partecipante2Instant = Instant.ofEpochSecond(200);
		ag.addArrival("partecipante2", partecipante2Instant);
		
		
		Assert.assertEquals("partecipante1", ag.getWinner());
	}
	
	@Test
	public void getWinnerTest2() {
		Instant partecipante1Instant = Instant.ofEpochSecond(100, 01);
		ag.addArrival("partecipante1", partecipante1Instant);
		
		Instant partecipante2Instant = Instant.ofEpochSecond(200, 02);
		ag.addArrival("partecipante2", partecipante2Instant);
		
		
		Assert.assertEquals("partecipante1", ag.getWinner());
		
	}
	
}
