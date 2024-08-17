package SampleApplication;

import java.util.Scanner;

public class ProductTable {
	static int tab;
	static void Table(int a,int b)
	{
		for(int i=1;i<=b;i++)
		{
			tab =i*a;
			System.out.println(i+" * "+a+" = "+tab);
		}	
	}
	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter table");
			int a = s.nextInt();
			System.out.println("enter table range");
			int b = s.nextInt();
			Table(a,b);
		}
	}
}
