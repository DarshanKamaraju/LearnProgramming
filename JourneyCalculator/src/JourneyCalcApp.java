import java.util.Scanner;

public class JourneyCalcApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the speed and time to calculate distance");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
	    JourneyCalc journeyCalc=new JourneyCalc();
	    double distance=journeyCalc.calculateDistance( speed, time);
		System.out.println(distance);
	}
	double calculateDistance(double speed,double time) {
		return speed*time;
	}
}


