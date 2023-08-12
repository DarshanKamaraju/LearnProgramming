import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a marks");
		int marks=scan.nextInt();
		System.out.println("Welcome to Kodnest ");
		Check check=new Check();
		check.checkEligibility(marks);
	}

}
