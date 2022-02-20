package BigNumber;

import java.math.*;
import java.util.Scanner;

/**
 * <h1>Soal 6 : Big Number</h1>
 * Big Number program implements an applicaton
 * to add and multiply huge numbers use the power of Java's BigInteger class.
 * 
 * Input format	: Two lines containing two numbers, a and b.
 * 				  a and b are non-negative integers and can have maximum 200 digits.
 * Output format: First line contain a+b, second line contain axb
 * 
 * @author Danu Mahesa 
 * @version 1.0
 * @since 2022-02-20
 */

public class BigNumber {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine()); //input a
        BigInteger b = new BigInteger(sc.nextLine()); //input b
        BigInteger sum = a.add(b); // print a+b
        BigInteger prod = a.multiply(b); //print axb
        
        System.out.println(sum+"\n"+prod);
    }
}