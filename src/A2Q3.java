/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A2Q3 {
    
    // create a triangle method 
    public int triangle(int n){
        // return n if it is 0
        if(n == 0){
            return n;
        }
        // return n and add the row above 
        return n + triangle(n-1); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test 
        A2Q3 test = new A2Q3(); 
        // give the answers
        System.out.println("Row 0 has: " + test.triangle(0) + " blocks.");
        System.out.println("Row 1 has: " + test.triangle(1) + " blocks.");
        System.out.println("Row 2 has: " + test.triangle(2) + " blocks.");
        System.out.println("Row 3 has: " + test.triangle(3) + " blocks.");
    }
}
