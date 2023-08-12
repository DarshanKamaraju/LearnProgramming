package CnditionalControlConstruct;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		if(age>18 && age<50)
		{
			System.out.println("you are eligeble for working");
		}
		else
			{
			if(age>50)
			{
				System.out.println("Senior citizen");
			}
			else
			{
				System.out.println("citizen");
			}
		}
}
}