package com.ngtlearning.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

	/*
	 * We'll start off by creating 3 classes: one with all of the characters, another that
	 * will create the key, and another that will encrypt the code (given that there's a key)
	 */
	
public class Cryptography {
		Random randomGenerator;
		//Create a string containing characters a-z, A-Z, . and 0-9
		public String alphanumeric = "abcdefghijklmnopqrstuvwxyz" +
								"ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890."; //put them all in a string!
		
		public ArrayList<String> alphabetArrayList =
				new ArrayList<String>(Arrays.asList(alphanumeric.split(""))); 
		/* then put them all in an array! furthermore, the ".asList" section
		 * before the "alphanumeric.split" means that we split the string, then put them in a string
		 */
	
	public Cryptography(long key){
		/*
		 * Now, we'll shuffle around as well as add some characters in this
		 * constructor. We now have a new seed key, which is also a random order alphabet
		 */
		alphabetArrayList.remove("");
		randomGenerator = new Random(key);
		Collections.shuffle(alphabetArrayList, randomGenerator);
		//translation: for alphabetArraylist (the character list),
		//use randomGenerator (a random key made from the Random method)
		alphabetArrayList.add("_");
		alphabetArrayList.add("@");
		alphabetArrayList.add("$"); //these three will be used for other letters.
	}
	
	public String encrypt(String input){ //Now for the encrypting-the-message part; String "encrypt" based on string "input"
		String result = ""; //String where the encrypted text will be stored
		if((input.indexOf("@") == -1) && (input.indexOf("$") == -1)&&(input.indexOf("_") == -1)){ // Check that entire text is valid
			input = input.replaceAll(" ", "_"); //replace the blank areas with "_"
			
			char[] characters = input.toCharArray(); //if all is good, we convert the Array to characters and work on each individually
			for(int i =0; i<characters.length;i++){
				char c = characters[i];
				// Make sure the character is in alphabetArraylist
				if(alphabetArrayList.contains(String.valueOf(c))){
					result = result+ alphabetArrayList.get(alphabetArrayList.indexOf(String.valueOf(c))+2);
					//Move the letter 2 letters forward in our scrambled alphabet
				}else{
					return "Error!-Invalid String, only Alphabets, Number, . and "+
						"Spaces are allowed";
				}
			}
		}else{
			return "Error!-Invalid String, only Alphabets, Number, . and Spaces are allowed";
		}
	return result; //return the encrypted string
	}	
	
	public String decrypt(String encryptedInput){ //Now to undo this with decrypting; String "decrypt" based on string "encryptedInput"
		String result = ""; //String where the decrypted text will be stored
		if((encryptedInput.indexOf(alphabetArrayList.get(0)) == -1)
			&&(encryptedInput.indexOf(alphabetArrayList.get(1)) == -1)
			&&(encryptedInput.indexOf(" ") == -1)){ // Check that entire text is valid and there's no 
			
			
		char[] characters = encryptedInput.toCharArray(); //if all is good, we convert the Array to characters and work on each individually
			for(int i =0; i<characters.length;i++){
				char c = characters[i];
				// Make sure the character is in alphabetArraylist
				if(alphabetArrayList.contains(String.valueOf(c))){
					result = result+ alphabetArrayList.get(alphabetArrayList.indexOf(String.valueOf(c))-2);
					//Move the letter 2 letters forward in our scrambled alphabet
				}else{
					return null; //if invalid, do nothing
				}
			}
		}else{
			return null;
		}
		result = result.replaceAll("_", " "); //replace all underscores with spaces
		return result; //return the decrypted string
	}
}
