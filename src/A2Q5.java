/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A2Q5 {
    
    // create a binary convert method 
    public String binaryCovert(int n) {
        //create string to store 0's and 1's
        String binary = new String();

        //if n is even, add a 0 to the binary string
        if (n % 2 == 0) {
            binary = ("0");
            //if n is odd, add a 1 to the binary string
        } else if (n % 2 == 1) {
            binary = ("1");
        }
        //(basecase) if n is 1 then return it
        if (n == 1) {
            return binary;
        }
        //return n without the last int, and the binary string
        return binaryCovert(n / 2) + binary;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test 
        A2Q5 test = new A2Q5(); 
        // give the answers
        System.out.println("The binary convert of 156 is: " + test.binaryCovert(156));
        System.out.println("The binary convert of 13 is: " + test.binaryCovert(13));
        System.out.println("The binary convert of 1000 is: " + test.binaryCovert(1000));
    }
}
