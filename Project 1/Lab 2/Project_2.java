import java.util.Scanner;
public class Project_2 {

	public static double ConvertCtoFAndPrint(double var)
	{
		return (32 + var*(180.0/100.0));
	}
	
	public static double ConvertFtoCAndPrint(double var)
	{
		return ( (var - 32)/(180.0/100.0));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double C, F;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the temperature in Centigrade: ");
		C = input.nextDouble();
		System.out.print("C to F: " + ConvertCtoFAndPrint(C));
		System.out.print("\nPlease enter the temperature in Fahrenheit: ");
		F = input.nextDouble();
		System.out.print("F to C: " + ConvertFtoCAndPrint(F));
		System.out.print("\nDone!!!");
		
	}

}
