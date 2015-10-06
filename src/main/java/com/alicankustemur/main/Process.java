package com.alicankustemur.main;

public class Process {
	private int numberOne;
	private int numberTwo;

	public Process() {

	}

	public Process(int numberOne, int numberTwo) {
		setNumberOne(numberOne);
		setNumberTwo(numberTwo);
	}

	public int getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}

	public int multiply() {
		return numberOne * numberTwo;
	}

	public int divide() {
		return numberOne / numberTwo;
	}

}
