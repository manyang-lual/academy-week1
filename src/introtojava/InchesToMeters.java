package introtojava;
import java.util.Scanner;
public class InchesToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Input a value to be converted to meters: ");
		double value = obj.nextDouble();
		System.out.println(value+" inches equals to "+(value*0.0254));
	}

}
