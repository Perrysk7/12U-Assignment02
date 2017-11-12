/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A2Q7 {
    
    // create a boolean palindrome method 
    public boolean isPalindrome(String s, int length) {
        //if the length of the word is 0 or 1, return as a palindrome
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        //if the first letter is the same as the last letter, remove both letters from string
        if (s.charAt(0) == s.charAt(length - 1)) {
             
            //return word without the letters, and the length
            return isPalindrome(s.substring(length), length);
        } else {
           //return the word as not a palindrome if the first and last letter arent the same
            return false;
        }
    }    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test 
        A2Q7 test = new A2Q7(); 
        // give the answers 
        System.out.println(test.isPalindrome("racecar", 7));
        System.out.println(test.isPalindrome("radar", 5));
        System.out.println(test.isPalindrome("lamont", 6));
    }  
}
