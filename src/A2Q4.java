/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A2Q4 {
    
    // create a hailstone method 
    public int hailstone(int n){
        // first print out n 
        System.out.println(n);
        // return n once it is one 
        if(n == 1){
            return n; 
        }
        // if n is even, divide it by 2
        if(n % 2 == 0){
            return hailstone(n / 2); 
        }else{
            // if hailstone is odd, multiply by 3 and add 1 
           return hailstone(3 * n + 1); 
        } 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test
        A2Q4 test = new A2Q4(); 
        // give the answers
        System.out.println("Test 5:");
        test.hailstone(5);
        System.out.println("Test 12:");
        test.hailstone(12);   
    }
}
