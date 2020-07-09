package com.pks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubStringFileTest {


	@Test
	void test1() {
		//test case to check multiple line  string
		assertEquals("abcdefg", SubStringFile.getSubStringFile("abcd\n  efg  "));
		
	}
	
	
	
	@Test
	void test2() {
		//test case to check a  string
		assertEquals("abcd", SubStringFile.getSubStringFile("xyabcdgftr"));
		
	}
	
	@Test
	void test3() {
		//test case to check empty string
		assertEquals("", SubStringFile.getSubStringFile(""));
		
	}

	@Test
	void test4() {
		//test case to check null string
		assertEquals(null,SubStringFile.getSubStringFile(null));
		
	}
	

	@Test
	void test5() {
		//test case to check alphabets circle back string
		assertEquals("xyzabcd",SubStringFile.getSubStringFile("abcdxyzabcdtghy"));
		
	}
	
	@Test
	void test6() {
		//test case to check alphabets circle back string
		assertEquals("xyzabcd",SubStringFile.getSubStringFile("1234xyzabcdtghy"));
		
	}
	@Test
	void test7() {
		//test case to check numeric string
		assertEquals("", SubString.getSubString("1234567890"));
		
	}
	@Test
	void test8() {
		//test case to check numeric string
		assertEquals("abcdefghijklmnop", SubString.getSubString("abcdefghijklmnop"));
		
	}

	@Test
	void test9() {
		//test case to check multiple line  alphanumeric string
		assertEquals("abcdefg", SubStringFile.getSubStringFile("abcd1234\n  efg  "));
		
	}


}
