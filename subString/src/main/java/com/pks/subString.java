/*
	 * Given a string, print its largest substring that has all consecutive
	 * alphabets. Consider English language, lowercase and alphabets circle back
	 * (abcde.....xyzabcd..).
	 * 
	 * for example, Input: jhlskhfslkfhabcdefmhlhkllmn Output: abcde
	 */
	
package com.pks;

import java.util.Scanner;


public class subString {

	
	public static String getFirstCharacter(String string) {
		/* Function to get first alphabetic character in the string */
		
		String subString="";
		for(int i=0;i<string.length();i++) {
			if (Character.isLetter(string.charAt(i ))){        // Checking if the character is alphabetic
				subString=Character.toString(string.charAt(i));
				break;                                          // Terminate the loop if alphabet found
			}
		}
		return subString;
	}
	
	public static String getSubString(String string) {
		// Function to get the Longest subString
		if(string == null) {
			// If string is null return null
			return null;
		}
		
		if(string.length()==0) {
			// If string is empty return empty subString
			return "";
		}
		
		string.toLowerCase();
		
		//Storing the first alphabetic character of the string
		String subString = getFirstCharacter(string);
		int len = 1;
		int startIndex = 0;
		for (int i = 1; i < string.length(); i++) {
			
			//checking if the character is letter
			if (Character.isLetter(string.charAt(i - 1)) && Character.isLetter(string.charAt(i))) {
				
				//checking if it is consecutive or having alphabet circle back
				if ((string.charAt(i - 1) - string.charAt(i)) == -1 || (string.charAt(i - 1) - string.charAt(i)) == 25) {
					len++;
					if (subString.length() < len) {
						//if length of the previously stored subString is less then changing it
						
						subString = string.substring(startIndex, startIndex + len);

					}
				} 
				else {
					
					startIndex = i;
					len = 1;
				}
			} 
			else {
				startIndex = i;
				len = 1;
			}
		}
		
		return subString;
	}

	
	public static void main(String[] args) {
		
		//main to run the code
		
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		String subString=getSubString(string);

		if (subString.length() == 0) {              
			System.out.println("No subString found");
		} 
		else {
			System.out.println(subString);
		}
		sc.close();

	}

}
