package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommanElement2ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List l1=new ArrayList<>();
		List l2=new ArrayList<>();
		List l3=new ArrayList<>();
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Element for Array1");
		for (int i=0;i<4;i++)
		{
			l1.add(scn.nextInt());
		}
		
		System.out.println("Enter Element for Array2");
		for(int j=0;j<3;j++)
		{
			l2.add(scn.nextInt());
		}
		
		
		System.out.println(l1);
		System.out.println(l2);
		l1.retainAll(l2);
		System.out.println(l1);
		
		
		
	}

}
