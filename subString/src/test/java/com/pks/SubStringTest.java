package com.pks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubStringTest {

	@Test
	void test1() {
		//test case to check numeric string
		assertEquals("abcd", SubString.getSubString("12abcd"));
		
	}
	
	@Test
	void test2() {
		//test case to check a  string
		assertEquals("abcd", SubString.getSubString("xyabcdgftr"));
		
	}
	
	@Test
	void test3() {
		//test case to check empty string
		assertEquals("", SubString.getSubString(""));
		
	}

	@Test
	void test4() {
		//test case to check null string
		assertEquals(null, SubString.getSubString(null));
		
	}
	

	@Test
	void test5() {
		//test case to check alphabets circle back string
		assertEquals("xyzabcd", SubString.getSubString("abcdxyzabcdtghy"));
		
	}


}
