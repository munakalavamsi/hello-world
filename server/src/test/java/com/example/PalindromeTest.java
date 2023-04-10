

package com.example;

import static org.junit.Assert.*;

import org.junit.Test;



public class PalindromeTest{


@Test
// Driver code
public void checkstr()
{
    Palindrome palindromeTester = new Palindrome();
    assertTrue(palindromeTester.isWordPresent(" hello world","hello"));
	
	

}
   @Test
    public void testWordInEmptyString() {
        String sentence = "";
        assertFalse(sentence.contains("hello"));
    }
    /* Corner case Test 1 - Empty */

    @Test
    public void testWordInStringCaseInsensitive() {
        String sentence = "hello world";
        assertTrue(sentence.toLowerCase().contains("hello"));
    }
}
