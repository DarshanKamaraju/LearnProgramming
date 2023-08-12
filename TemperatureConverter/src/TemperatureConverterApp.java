import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Temperature in Farenheat");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double tempInCelcious=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(tempInCelcious);

	}

}
