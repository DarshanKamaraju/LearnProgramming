import java.util.Scanner;
public class Arithmatic {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the two numbers");
	Long num1=scan.nextLong();
	Long num2=scan.nextLong();
	long res=galacticAddition(num1,num2);
	System.out.println(res);
}
public static long galacticAddition(long num1, long num2) {
     return num1+num2;
}
}
