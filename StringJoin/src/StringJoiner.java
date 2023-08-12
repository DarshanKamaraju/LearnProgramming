import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the First name and Last name");
    String Fn=scan.next();
    String Ln=scan.next();
    System.out.println(joinStrings(Fn,Ln));
    
	}
	public static String joinStrings(String Fn, String Ln) {
		return Fn+Ln;
}
}