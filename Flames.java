package SampleApplication;

import java.util.Scanner;

public class Flames {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("FLAMES");
			
			System.out.println("Enter first name");
			String s =sc.nextLine().toUpperCase();
			
			System.out.println("Entr second name");
			String c =sc.nextLine().toUpperCase();
			
			
			int count=findCount(s,c);
			flames(count);
		}
	}

	public static void printRelation(char flames) {
		switch (flames) {
		case 'f':
			System.out.println("Friends");
			break;
		case 'l':
			System.out.println("Lovers");
			break;
		case 'a':
			System.out.println("Affection");
			break;
		case 'm':
			System.out.println("Marriage");
			break;
		case 'e':
			System.out.println("Enemy");
			break;
		case 's':
			System.out.println("Sister");
			break;
		}
	}

	public static void flames(int count) {
		StringBuilder flames = new StringBuilder("flames");
		while (flames.length() > 1) {
			int i = count;
			while (i > flames.length()) {
				i -= flames.length();
			}
			String remaining = flames.substring(i) + flames.substring(0, i - 1);
			flames = new StringBuilder(remaining);
		}
		printRelation(flames.charAt(0));
	}

	public static int findCount(String boy, String girl) {
		for (int i = 0; i < boy.length(); i++) {
			for (int j = 0; j < girl.length(); j++) {
				if (boy.charAt(i) == girl.charAt(j)) {
					girl = girl.substring(0, j) + girl.substring(j + 1);
					boy = boy.substring(0, i) + boy.substring(i + 1);
					i--;
					break;
				}
			}
		}
		return boy.length() + girl.length();
	}

}

