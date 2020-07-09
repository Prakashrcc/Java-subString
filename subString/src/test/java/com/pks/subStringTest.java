package com.pks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class subStringTest {

	@Test
	void test1() {
		//test case to check numeric string
		assertEquals("abcd", subString.getSubString("12abcd"));
		
	}
	
	@Test
	void test2() {
		//test case to check a  string
		assertEquals("abcd", subString.getSubString("xyabcdgftr"));
		
	}
	
	@Test
	void test3() {
		//test case to check empty string
		assertEquals("", subString.getSubString(""));
		
	}

	@Test
	void test4() {
		//test case to check null string
		assertEquals(null, subString.getSubString(null));
		
	}
	

	@Test
	void test5() {
		//test case to check alphabets circle back string
		assertEquals("xyzabcd", subString.getSubString("abcdxyzabcdtghy"));
		
	}


}
