package stringProgramms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		//Anagram : All characters in two string are same. also length of two string is same
		
		//LOGIC : sort the string and compare, if equals:both strings are anagram
		
		String st1="harshal";
		String st2="haalhsr";
		
		//sort two string : Convert to char array and sort car array
		
		char[] st1Arr=st1.toCharArray();
		char[] st2Arr=st2.toCharArray();
		
		Arrays.sort(st1Arr);
		Arrays.sort(st2Arr);
		
		//convert Char array to string
		String Sortedst1=new String(st1Arr);
		String Sortedst2=new String(st2Arr);
		
		System.out.println(Sortedst1);
		System.out.println(Sortedst2);
	
		
		//compare two Strings
		if(Sortedst1.equals(Sortedst2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
		

	}

}
