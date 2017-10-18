package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	 @Test
	 public void addArrivalTest() {
		 AthleticGame ag = new AthleticGame("sportTest");
		 ag.addArrival("partecipanteTest", Instant.now());
		 Assert.assertEquals(1, ag.getArrivals().size());
	 }
	 
	 @Test(expected = IllegalArgumentException.class)
	 public void getPartecipiantTimeTest() {
		 AthleticGame ag = new AthleticGame("sportTest");
		 ag.getParecipiantTime("partecipanteNonPresente");
	 }
}
