package program;

import java.util.Scanner;

public class ArraySort2 {

	public static void main(String[] args) {
		int temp;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter length of the array");
		int Arraylength=scn.nextInt();
		
		int ArraySort[]=new int[Arraylength];
		System.out.println("Enter the array Element");
		for(int i=0;i<Arraylength;i++)
		{
			ArraySort[i]=scn.nextInt();
		}
		
		for(int i=0;i<Arraylength;i++)
		{
			for (int j=i+1;j<Arraylength;j++)
			{
				if(ArraySort[i]>ArraySort[j])
				{
					temp=ArraySort[i];
					ArraySort[i]=ArraySort[j];
					ArraySort[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted array Element");
		/*
		for (int i=0;i<Arraylength;i++)
		{
			System.out.println(" "+ArraySort[i]);
		}
		*/
		for(int i:ArraySort)
		{
			System.out.println(" "+i);
		}
	}

}
