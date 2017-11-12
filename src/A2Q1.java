/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A2Q1 {
    
    // create a digital sum method 
    public int digitalSum(int n){
        // create a base case to return n when it is a single digit 
        if(n >= 0 && n <= 9){
            return n; 
        }
        // create an integer of the right most digit of n 
        int mod = n % 10; 
        // create an integer of n without the right most digit 
        int divide = n/10; 
        // return the right most digit added to the new number that will repeat
        return mod + digitalSum(divide); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test 
        A2Q1 test = new A2Q1(); 
        // give the answers 
        System.out.println("The digital sum of 126 is: " + test.digitalSum(126));
        System.out.println("The digital sum of 49 is: " + test.digitalSum(49));
        System.out.println("The digital sum of 12 is: " + test.digitalSum(12)); 
        
        
        
        
        
        
        
    } 
}
