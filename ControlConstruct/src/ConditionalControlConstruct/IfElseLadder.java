package CnditionalControlConstruct;

import java.util.Scanner;

public class IfElseLadder {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the money");
	int money=scan.nextInt();
	if(money>50000)
	{
		System.out.println("buy IPhone");
	}
	else if(money>40000 && money<50000)
	{
		System.out.println("buy samsung");	
	}
	else if(money>30000 && money<40000)
	{
		System.out.println("buy 1+");	
	}
	else if(money>20000 && money<30000)
	{
		System.out.println("buy realme");	
	}
	else if(money>10000 && money<20000)
	{
		System.out.println("buy Motorolo");	
	}
	else
	{
		System.out.println("go and earn first");
	}
	}
}
