package io.kavya.Fortinet;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SeperateSumTest {

	List<Integer> list = new ArrayList<Integer>();
	@Before
	public void setup(){
		
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(5);
	}
	@Test
	public void test() {
		SeperateSum sum = new SeperateSum();
		assertEquals(true,sum.seperate(list, 5));
	}

}
