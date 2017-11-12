/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A2Q6 {
    
    // create a method called covert 
    public String convert(int n, int b) {
        //create new string to store numbers and letters
        String number = new String();
        //insert letters into an array
        String[] Alphabet = {"A", "B", "C", "D", "E", "F"};
        //check n converts into a number that is 10 
        if (n % b >= 10) {
            // add the proper letter from the array to the string
            number = number + Alphabet[n % b - 10];
            //if the number does not convert to a number over 10, then add the converted number to the stiring
        } else if (n % b >= 2 || n % b < 10) {
            number = number + n % b;
        }
        //once the number is 0 return it
        if (n / b == 0) {
            return number;
        }
        //return the divided number, the base integer, and the string
        return convert(n / b, b) + number;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test 
        A2Q6 test = new A2Q6(); 
        // give the answers
        System.out.println("conversion of (1000, 8) is: " + test.convert(1000, 8));
        System.out.println("conversion of (1000, 16) is: " + test.convert(1000, 16));
        System.out.println("conversion of (1000, 2) is: " + test.convert(1000, 2));
    } 
}
