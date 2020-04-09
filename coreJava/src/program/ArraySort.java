package program;

import java.util.Scanner;
import java.util.*;
public class ArraySort {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter length of the array");
		int Arraylength=scn.nextInt();
		
		int ArraySort[]=new int[Arraylength];
		System.out.println("Enter the array Element");
		for(int i=0;i<Arraylength;i++)
		{
			ArraySort[i]=scn.nextInt();
		}
		
		Arrays.sort(ArraySort);
		
		System.out.println("Sorted Array Element are ");
		for(int i=0;i<Arraylength;i++)
		{
			
			System.out.println(" " +ArraySort[i]);
		}
		/*
		int n=4;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int Arraysort[]=new int[n];
		
		for (int i=0;i<n;i++)
		{
			Arraysort[i]=scn.nextInt();
		}
		
		//Arrays.parallelSort(Arraysort);
		Arrays.sort(Arraysort);
		System.out.println("Sorted Array Element.");
		for (int i=0;i<n;i++)
		{
			System.out.println("  "+Arraysort[i]);
		}
		*/
	}
}