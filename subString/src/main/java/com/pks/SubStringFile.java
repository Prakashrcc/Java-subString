package com.pks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SubStringFile {
	
	public static char getFirstChar(String string) {
		//Function to get the first alphabetic character from the string
		
		char lastChar=' ';
		for(int i=0;i<string.length();i++) {
			if(Character.isLetter(string.charAt(i))) {   // Checking if the character is alphabetic
				 lastChar=string.charAt(i);
				break;    								 // Terminate the loop if alphabet found
			}
		}
		return lastChar;
	}
	public static String getSubStringWithoutSpace(String subString) {
		// Function to remove white spaces and other non alphabetic character from string
		
		 StringBuffer stringBuffer = new StringBuffer();  
			for(int i=0;i<subString.length();i++) {
				if(Character.isLetter(subString.charAt(i))) {   // Checking if the character is alphabetic
					stringBuffer.append(subString.charAt(i));   // Storing the alphabet
				}
			}
			
		return stringBuffer.toString();
	}
	
	public static String getSubStringFile(String string) {
		// 
		if(string == null) {
			// If string is null return null
			return null;
		}
		if(string.length()==0) {
			// If string is empty return empty substring;
			return "";
		}
		string.toLowerCase();		
		String subString = "";
		int len = 1;
		int startIndex = 0;
		
		//getting the first alphabetic character
		char lastChar=getFirstChar(string);
		for (int i = 1; i < string.length(); i++) {
			
			 // Checking if the character is alphabetic
			if ( Character.isLetter(string.charAt(i))) {       
				
				//checking if it is consecutive or having alphabet circle back
				if ((lastChar - string.charAt(i)) == -1 || (lastChar - string.charAt(i)) == 25) {
					len++;
				
					if (subString.length() < len) {
						
						//if length of the previously stored subString is less then changing it
						subString = string.substring(startIndex, startIndex + len);

					}
					
					lastChar=string.charAt(i);
				} else {
				
					startIndex = i;
					len = 1;
					lastChar=string.charAt(i);
				}
			}
			else {
				len++;
				
			}
		}
		
		if(subString.length()>0) {
			
			// Removing whitespace and other non alphabetic character from the subString
			subString=getSubStringWithoutSpace(subString);
		}
		
		
		return subString;
	}
	//C:\\Users\\Prakash\\Desktop\\substring.txt
	public static String getFile() throws IOException {
		//method to get a file
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("Enter the file name along with the path");
		String path=inputScanner.nextLine();
		String string = new String(Files.readAllBytes(Paths.get(path)));
		
		return string;
	}

	public static void main(String[] args) throws IOException {
		// main method to run the code 
		
		//getFile() method to get the file
		String file=getFile();
		
		String subString=getSubStringFile(file);
		
		if(subString==null) {
			System.out.println("Null File provided");
		}
		else if(subString.length()==0) {
			System.out.println("Empty subString");
		}
		else {
		
			System.out.println(subString);
		}
		
	}

}
