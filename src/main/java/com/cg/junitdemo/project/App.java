package com.cg.junitdemo.project;

public class App {
	public static void main(String[] args) {
		System.out.println("START");
		
		MyCalc calc = new MyCalc();
		
		System.out.println(calc.getPi());
		System.out.println(calc.addNums(10, 20));
		
		System.out.println("END");
	}
}
