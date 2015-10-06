package com.alicankustemur.junittest;

import org.junit.Test;

import junit.framework.Assert;

import com.alicankustemur.main.Process;

public class ProcessTest {

	@Test
	public void testMultipy_true_5_10() {
		final int numberOne = 5;
		final int numberTwo = 10;
		final int trueResult = 50;

		final Process process = new Process(numberOne, numberTwo);
		final int result = process.multiply();

		Assert.assertTrue("Error Results", result == trueResult);

	}

}
