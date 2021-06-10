package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeastOnce;;

class TestMockBasic {
	List mock = Mockito.mock(List.class);
	
	@Test
	void test() {
		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, mock.size());
		assertEquals(10, mock.size());
	}
	
	@Test
	void returWithParameter() {
		when(mock.get(0)).thenReturn("anser zero");
		assertEquals("anser zero", mock.get(0));
		assertEquals(null, mock.get(1));
	}
	
	@Test
	void returnWithGenericParamenter() {
		when(mock.get(anyInt())).thenReturn(4);
		assertEquals(4, mock.get(1));
	}
	
	@Test
	void VerificationBasic() {
		// system under test
		String value1 = (String) mock.get(0);
		String value2 = (String) mock.get(1);
		// verify
		verify(mock).get(0);
		verify(mock, times(2)).get(anyInt());
		verify(mock, atLeast(1)).get(anyInt());
		verify(mock, atLeastOnce()).get(anyInt());
		verify(mock, atMost(2)).get(anyInt());
	}
	
	@Test
	public void argumentCapturing() {
		mock.add("added string");
		
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock).add(captor.capture());
		assertEquals("added string", captor.getValue());
	}
	
	@Test
	public void multipleArgumentCapturing() {
		mock.add("added string");
		mock.add("added another string");
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock, times(2)).add(captor.capture());
		List<String> allValues = captor.getAllValues();
		assertEquals("added string", allValues.get(0));
		assertEquals("added another string", allValues.get(1));
	}
	
	@Test
	public void spying() {
		ArrayList arrayListMock = Mockito.mock(ArrayList.class);
		System.out.println(arrayListMock.get(0));
		System.out.println(arrayListMock.size());
		arrayListMock.add("Test");
		arrayListMock.add("Test2");
		System.out.println(arrayListMock.size());
		when(arrayListMock.size()).thenReturn(5);
		System.out.println(arrayListMock.size());
	}
}
