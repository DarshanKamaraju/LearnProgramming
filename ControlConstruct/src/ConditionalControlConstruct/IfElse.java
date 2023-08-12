package CnditionalControlConstruct;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=scan.nextInt();
		if(marks<15)
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("pass");
		}
	}

}
