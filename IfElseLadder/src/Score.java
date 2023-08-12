import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your score");
	int scr=scan.nextInt();
	ScoreApp app=new ScoreApp();
	app.estimateGrade(scr) ;
	
	}
}
