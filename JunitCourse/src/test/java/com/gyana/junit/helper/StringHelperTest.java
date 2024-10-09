package com.gyana.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.gyana.junit.StringHelper;

public class StringHelperTest {
	//AACD=>CD  ACD=>CD  CDEF=>CDEF  CDAA=>CDAA
	StringHelper helper;
	
	@Before
	public void before() {
		helper=new StringHelper();
	}
	

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		//expected,actual
	}
	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	//ABCD=> false,  ABAB=>true,  AB=>true,   A=>false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertEquals(true,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame2() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCB"));
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("TVTV"));
	}
    
}
