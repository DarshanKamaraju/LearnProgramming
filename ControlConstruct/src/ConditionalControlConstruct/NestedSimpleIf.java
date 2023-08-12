package CnditionalControlConstruct;

import java.util.Scanner;

public class NestedSimpleIf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lets go for blood donation");
		System.out.println("enter your age");
		int age=scan.nextInt();
		if(age<=50 && age>=20)
		{
			System.out.println("you are eligible for blood donation");
		}
		if(age>50 )
		{
			System.out.println("you are not eligible for blood donation");
		}
		
	}

}
