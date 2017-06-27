package org.jacoco.examples.maven.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setup() {
		subject = new HelloWorld();
	}
	
	@Test
	public void testGetMessage() {
		System.out.println("*********New PR");
		assertEquals("Hello World!", subject.getMessage(false));
	}
	
}
