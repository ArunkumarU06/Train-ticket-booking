package SampleApplication;

import java.util.Random;


public class randomNumber 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=10;i++) 
		{
			Random  Rand = new Random();
			int rand = Rand.nextInt(1000)+1000;
			System.out.println(rand);
		}
		
	}

}
