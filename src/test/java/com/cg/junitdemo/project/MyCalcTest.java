package com.cg.junitdemo.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MyCalcTest {
//	JUnit - testing framework for Java 

	@Test
	public void testGetPi() {
		System.out.println("testGetPi");
		MyCalc calc = new MyCalc();
		double expected = 3.142;
		double actual = calc.getPi();
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testGetPi2() {
		System.out.println("testGetPi2");
		MyCalc calc = new MyCalc();
		double unexpected = 1.234;
		double actual = calc.getPi();
		assertNotEquals(unexpected, actual, 0);
	}

	@Test
	public void testAddNums() {
		System.out.println("testAddNums");
		MyCalc calc = new MyCalc();
		assertEquals(30, calc.addNums(10, 20));
	}
}
