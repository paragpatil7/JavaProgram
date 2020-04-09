package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommanElement2Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Array1[]=new int[4];
		int Array2[]=new int[3];
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Element for Array1");
		for (int i=0;i<4;i++)
		{
			Array1[i]=scn.nextInt();
		}
		
		System.out.println("Enter Element for Array2");
		for(int j=0;j<3;j++)
		{
			Array2[j]=scn.nextInt();
		}
		
			
		for(int i=0;i<Array1.length;i++)
		{
			for (int j=0;j<Array2.length;j++)
			{
				if(Array1[i]==Array2[j])
				{
					System.out.println("Comman Element are "+Array1[i]);
				}
			}
		}
		
	}

}
