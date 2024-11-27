package test.section1.ex6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import section1.ex6.Practice6;

public class Practice6Test {

	@Test
	public void tesGetElementAtIndex_WithValidIndex() {
		int[] arr = {1, 2, 3};
		// インデックス 1 の要素を取得
		int result = Practice6.getElementAtIndex(arr, 1);
		// 正しい値が返されることを確認
		assertEquals(2, result);
	}
	
	// 配列の長さを超えるインデックスを指定した場合に 
	// ArrayIndexOutOfBoundsException がスローされることを確認
	@Test
	public void tesGetElementAtIndex_WithOutOfBoundsIndex() {
		// インデックス(要素番号)は 0, 1, 2 まで有効
		int[] arr = {1, 2, 3};
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			Practice6.getElementAtIndex(arr, 5); 
		});
	}
	
	// 負のインデックスを指定した場合に
	// ArrayIndexOutOfBoundsException がスローされることを確認
	@Test
	public void testGetElementAtIndex_WithNegativeIndex() {
		int[] arr = { 1, 2, 3 };
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			Practice6.getElementAtIndex(arr, -1);
		});
	}
}
