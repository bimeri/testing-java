package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class TestUsingMock {

	@InjectMocks
	CalculateSumImp calculate;
	
	@Mock
	DataService dataMock;
	
//	@BeforeEach
//	public void before() {
//		calculate.setDataService(dataMock);
//	}

	@Test
	void TestMysumWithDataService() {
		//fail("Not yet implemented");
		when(dataMock.getAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, calculate.sumUsingService());
	}
	
	@Test
	void TestMysum_four_number() {
		//fail("Not yet implemented");
		when(dataMock.getAllData()).thenReturn(new int[] {3,4,7,5});
		assertEquals(19, calculate.sumUsingService());
	}

	@Test
	void TestForZero() {
		when(dataMock.getAllData()).thenReturn(new int[] {});
		assertEquals(0, calculate.sumUsingService());
	}
}
