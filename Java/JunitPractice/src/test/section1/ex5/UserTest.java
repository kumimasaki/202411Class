package test.section1.ex5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import section1.ex5.User;

public class UserTest {

	// ユーザー名が null の場合
	@Test
	public void testGetUsername_WithNull() {
		User user = new User(null);
		assertNull(user.getUsername());
	}
	
	// ユーザー名が設定されている場合
	@Test
	public void testGetUsername_WithNotNull() {
		User user = new User("Alice");
		assertNotNull(user.getUsername());
	}
}
