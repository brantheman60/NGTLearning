package com.ngtlearning.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Cryptography {
	Random randomGenereator;
	//Create a string containing characters a-z, A-Z, . and 0-9
	public String alphanumeric = "abcdefghijklmnopqrstuwxyz" +
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890.";
	
	public ArrayList<String> alphabetArrayList = 
	new ArrayList<String>(Arrays.asList(alphanumeric.split("")));
	//in the previous line, every character of the alphanumeric string is split
	
	/**
	 * Creates an instance of Cryptography
	 */
	public Cryptography(long key) {
	
		// Makes a random order alphabet and numbers for the encryption
		// and puts it in the array alphabetStringArray
		alphabetArrayList.remove("");
		Random randomGenerator = new Random(key);
		//Shuffle the alphabetArrayList randomly based on the seed key
		Collections.shuffle(alphabetArrayList, randomGenerator);

		// Add three extra special characters at the end of alphabetArrayList as we
		// will replace character with character+2 later in the encrypt and decrypt
		alphabetArrayList.add("_");
		alphabetArrayList.add("@");
		alphabetArrayList.add("$");
		//END of the section that makes the random order alphabet
}

/*
 * Function to encrypt a string
 */
public String encrypt(String input) {
	String result = ""; //String where the encrypted text will be stored
	if((input.indexOf("@") == -1) && (input.indexOf("$") == -1)
			&& (input.indexOf("_") == -1)) {//Check that entire text is valid
		input = input.replaceAll(" ", "_"); //Change spaces to underscores
		
		char[] characters = input.toCharArray();
		for(int i = 0; i <characters.length; i++) { //for each char in the string
			char c = characters[i];
			//Make sure the character is in alphabetArrayList
			if(alphabetArrayList.contains(String.valueOf(c))) {
				//Move the letter 2 letters forward in our scrambled alphabet
				result = result +
						alphabetArrayList.get(alphabetArrayList.indexOf(String.valueOf(c))+2);
				} else{
					return "Error!-Invalid String, only Alphabets, Numbers, . and " +
				"Spaces are allowed";
				}
		}
	}else{
		return "Error!-Invalid String, only Alphabets, Numbers, . and Spaces are allowed";
	}
return result; //return the encrypted string
}


/**
 * Function to decrypt an encrypted string
 */

public String decrypt(String encryptedInput) {
	String result = ""; //String where the decrypted text will be stored
	if((encryptedInput.indexOf(alphabetArrayList.get(0))==1)
			&& (encryptedInput.indexOf(alphabetArrayList.get(1)) == -1)
			&& (encryptedInput.indexOf(" ") == -1)) {//Check that entire text is valid
		
	char[] characters = encryptedInput.toCharArray();
	for(int i = 0; i <characters.length; i++) { //for each character in the string
		char c = characters[i];
		// Make sure the character is in alphabetArrayList
		if (alphabetArrayList.contains(String.valueOf(c))) {
			//Move the letter 2 letters back in our scrambled alphabet
			result = result +
			alphabetArrayList.get(alphabetArrayList.indexOf(String.valueOf(c))-2);
			}else{
				return null; //if invalid; return null
			}
	}
	}else{
		return null; //if invalid, return null
	}
	result = result.replaceAll("_", " "); //replace all underscores with spaces
	return result; //return the decrypted string
		}
	}