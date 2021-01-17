package edu.brandeis.cs12b.pa3;

import static org.junit.Assert.*;
import org.junit.Test;

public class CaesarCipherTest {
	private CaesarCipher cipher;
	
	@Test
	public void test1() {
		String text = "abc";
		String encrypted = "";
		String decrypted = "";
		
		// This should work after you define the public methods
		//encrypted = cipher.encode(text, 1);
		//decrypted = cipher.decode(encrypted, 1);
		
		assertEquals(text, decrypted);
	}
}
