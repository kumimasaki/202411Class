package net.lighthouseplan.spring.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.lighthouseplan.spring.junit.models.Account;

public class DemoMethodsTest {
	private static DemoMethods demo;
	
	// テストの実行前にインスタンスを作成
	@BeforeEach
	public void prepare() {
		demo = new DemoMethods();
	}
	
	// 奇数を入れた場合、trueになるテスト
	@Test
	public void testIsOdd_OddNumber_True() {
		assertTrue(demo.isOdd(7));
	}
	
	// 偶数を入れた場合、falseになるテスト
	@Test
	public void testIsOdd_OddNumber_False() {
		assertFalse(demo.isOdd(10));
	}
	
	// 名前の長さが4文字以上でパスワードの長さが8文字以上の場合
	// notNullで成功するテスト
	@Test
	public void testBuildAccount_ValidUsernameAndPassword_NotNull() {
		Account account = demo.buildAccount(1L, "Alice", "12345678");
		assertNotNull(account);
		assertEquals(account.getId(), 1L);
	}
	
	// 名前の長さが4文字以上ではない場合、nullになるテスト
	@Test
	public void testBuildAccount_InvalidUsername_Null() {
		Account account = demo.buildAccount(1L, "Ana", "12345678");
		assertNull(account);
	}
	
	// 名前の長さが4文字以上ではない　かつ　パスワードの長さが8文字以上ではない場合、nullになるテスト
	@Test
	public void testBuildAccount_InvalidUsernameAndPassword_Null() {
		Account account = demo.buildAccount(1L, "Ana", "1234567");
		assertNull(account);
	}
	
	// パスワードの長さが8文字以上ではない場合、nullになるテスト
	@Test
	public void testBuildAccount_InvalidPassword_Null() {
		Account account = demo.buildAccount(1L, "Alice", "1234567");
		assertNull(account);
	}
	
	
}
