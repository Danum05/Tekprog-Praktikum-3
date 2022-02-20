package InputOutput1;

import java.util.Scanner;

/**
 * <h1>Soal 1 : Input & Output</h1>
 * Input & Output program implements an applicaton
 * to split the string into tokens. The token define
 * to be one or more consecutive English alphabetic letters.
 * 
 * Input format: a single string s composed of English alphabetic letters, blank spaces,
 * 				 "!", ",", "?", ".", "_", "'", and "@"
 * Output format: On the first line, there's an integer denoting the number of tokens in string s
 * 				  On the next line, there's each of the n tokens on a new line 
 * 
 * @author Danu Mahesa 
 * @version 1.0
 * @since 2022-02-20
 */

public class InputOutput1 {
    	/**
	 * This is the main method.
	 * Here's where the string is 
	 * split into tokens.
	 */
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         String S = sc.nextLine();                  // Input the string
         String[] tokens = S.split("[^a-zA-Z]");
         int numTokens = 0;
        
         for (int i=0; i<tokens.length; ++i) 
             if (tokens[i].length() > 0) 
                 numTokens++;
             
         System.out.println(numTokens);
        
         for (int i=0; i<tokens.length;++i)
             if (tokens[i].length() > 0)
                 System.out.println(tokens[i]);
    }
}