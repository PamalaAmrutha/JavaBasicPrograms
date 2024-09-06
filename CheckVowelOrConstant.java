package com.sritech.Programs;

public class CheckVowelOrConstant {
	
	public static void main(String[] args) {
		  //Check whether a character is vowel or consonant
		  
		        char ch = 'e'; // Example character

		        if (isVowel(ch)) {
		            System.out.println(ch + " is a vowel.");
		        } else if (isConsonant(ch)) {
		            System.out.println(ch + " is a consonant.");
		        } else {
		            System.out.println(ch + " is not a letter.");
		        }
		    }

		    public static boolean isVowel(char ch) {
		        // Convert the character to lowercase to handle both uppercase and lowercase inputs
		        ch = Character.toLowerCase(ch);
		        
		        // Check if the character is one of the vowels
		        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
		    }

		    public static boolean isConsonant(char ch) {
		        // Convert the character to lowercase to handle both uppercase and lowercase inputs
		        ch = Character.toLowerCase(ch);

		        // Check if the character is a letter and not a vowel
		        return Character.isLetter(ch) && !isVowel(ch);
		    }
		}


