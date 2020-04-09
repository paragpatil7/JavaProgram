package program;

import java.util.Scanner;

public class ReverseString {

	
		
		public void ReverseString(){
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter String");
			int number = scn.nextInt();
			int reverse = 0;
			
			while(number!=0){
				reverse = reverse*10;
				reverse = reverse + number%10;
				number = number/10;
			}
			System.out.println("Reversed String is:-"+reverse);
		}
		
		public static void main(String[] args) {
			ReverseString obj = new ReverseString();
			obj.ReverseString();
	}
		

	

}
