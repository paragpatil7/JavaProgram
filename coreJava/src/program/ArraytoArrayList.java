package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraytoArrayList {

	public static void main(String[] args) {
		
		int arraytoconvert[]=new int[4];
		
		List l1=new ArrayList<>();
		Scanner scn=new Scanner(System.in);
		
		for (int i=0;i<4;i++)
		{
			arraytoconvert[i]=scn.nextInt();
		}

		for(int i:arraytoconvert)
		{
			System.out.println(i);

		}
		
		for(int i:arraytoconvert)
		{
			//System.out.println(i);
			l1.add(i);

		}

		
		//l1=Arrays.asList(arraytoconvert);
		System.out.println(l1);
		
		
		
		
		
		
	}

}
