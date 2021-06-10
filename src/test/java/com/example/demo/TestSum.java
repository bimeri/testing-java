package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSum {

	@Test
	void TestMysum() {
		//fail("Not yet implemented");
		CalculateSumImp calculate = new CalculateSumImp();
		int actualResult = calculate.calculate(new int[] {1,2,3});
		int expectedReult = 6;
		assertEquals(expectedReult, actualResult);
	}
	
	@Test
	void TestMysum_four_number() {
		//fail("Not yet implemented");
		CalculateSumImp calculate = new CalculateSumImp();
		int actualResult = calculate.calculate(new int[] {4,2,6,1});
		int expectedReult = 13;
		assertEquals(expectedReult, actualResult);
	}

}
