package project.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	// AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA
	
	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_DoesntContainA() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinLast2Positions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
}