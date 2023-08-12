package CnditionalControlConstruct;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the jourcy number");
		int jourcy=scan.nextInt();
		switch(jourcy) {
	            case 1:
	                System.out.println("It's MSD");
	                break;
	            case 2:
	                System.out.println("It's Kohli");
	                break;
	            case 3:
	                System.out.println("It's Rohit");
	                break;
	            case 4:
	                System.out.println("It's Raina");
	                break;
	            case 5:
	                System.out.println("It's Jadeja");
	                break;
	            case 6:
	                System.out.println("It's Sachin");
	                break;
	            case 7:
	                System.out.println("It's Sehwag");
	                break;
	            default:
	                System.out.println("Invalid jourcy");
	        }
	    }
	}
