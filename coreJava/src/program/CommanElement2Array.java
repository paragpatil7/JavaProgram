package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommanElement2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Array1[]=new int[4];
		int Array2[]=new int[3];
		
		List l1=new ArrayList<>();
		List l2=new ArrayList<>();
		List l3=new ArrayList<>();
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
		
		for(int i:Array1)
		{
			//System.out.println(i);
			l1.add(i);

		}
		for(int j:Array2)
		{
			l2.add(j);
		}
			//l1=Arrays.asList(arraytoconvert);
		System.out.println(l1);
		System.out.println(l2);
		l1.retainAll(l2);
		System.out.println(l1);
		
	
		
		
	}

}
