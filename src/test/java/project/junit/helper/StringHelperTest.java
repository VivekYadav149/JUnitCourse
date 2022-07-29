package project.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		StringHelper helper = new StringHelper();
		// AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));

	}
}