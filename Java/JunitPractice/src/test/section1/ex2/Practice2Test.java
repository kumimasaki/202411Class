package test.section1.ex2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import section1.ex2.Practice2;

public class Practice2Test {

	// 3文字以上のテスト
	@Test
	public void testIsLengthThreeOrMore_WithLongString_True() {
		assertTrue(Practice2.isLengthThreeOrMore("Hello"));
	}
	
	// 2文字のテスト
	@Test
	public void testIsLengthThreeOrMore_WithShortString_False() {
		assertFalse(Practice2.isLengthThreeOrMore("ab"));
	}
}
