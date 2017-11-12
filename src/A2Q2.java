/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A2Q2 {
    
    // create a digital root method 
    public int digitalRoot(int n){
        // implement the digitalSum method from question 1 
        if(n >= 0 && n <= 9){
            return n;
        }
        int mod = n % 10;
        int divide = n/10;
        // create a variable as the 'digitalSum' can't be used in the return statement 
        int V = mod + digitalRoot(divide); 
        //return V once it is one digit
        if(V >= 0 && V <= 9){
            return V;
        }else{
            // determine the roots
            int M = V%10; 
            int D = V/10;
            // add the ints 
            int root = M + digitalRoot(D);
            return root;
        }      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test 
        A2Q2 test = new A2Q2();
        // give the answers 
        System.out.println("The digital root of 2019 is: " + test.digitalRoot(2019));
        System.out.println("The digital root of 126 is: " + test.digitalRoot(126));
        System.out.println("The digital root of 49 is: " + test.digitalRoot(49));
        System.out.println("The digital root of 276 is: " + test.digitalRoot(276));
        
        
        
        
    }
}
