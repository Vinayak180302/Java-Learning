package demo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int str;
		
		Scanner sc= new Scanner(System.in);
		
		try {
			str = sc.nextInt();
			System.out.println(str);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("The End");
		}

	}

}
