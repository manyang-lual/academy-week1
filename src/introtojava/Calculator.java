package introtojava;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
			Scanner obj = new Scanner(System.in);
			double number1;
			double number2;
			
				
			System.out.println("/................Calculator Menu................/");
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for finding Square");
			System.out.println("Press 6 for finding Sqaure Root");
			System.out.println("Press 7 for finding Reciprocal\n");

			System.out.println("Enter the option: ");
			int option= obj.nextInt();
				do {
					
					if(option==1) {
						System.out.println("Enter the first number");
						number1= obj.nextDouble();
						
						System.out.println("Enter the second number");
						number2= obj.nextDouble();
						
						System.out.println("The addition of the number " + number1 +  " and " +number2+" is = "+(number1+number2));
						
					}
					
					else if(option==2) {
						System.out.println("Enter the first number");
						number1= obj.nextDouble();
						
						System.out.println("Enter the second number");
						number2= obj.nextDouble();
						System.out.println("The subtraction of the number " + number1 +  " and " +number2+" is = "+(number1-number2));
						
					}
					else if(option==3) {
						System.out.println("Enter the first number");
						number1= obj.nextDouble();
						
						System.out.println("Enter the second number");
						number2= obj.nextDouble();
						System.out.println("The amultiplication of the number " + number1 +  " and " +number2+" is = "+(number1*number2));
						
					}
					else if(option==4) {
						System.out.println("Enter the first number");
						number1= obj.nextDouble();
						
						System.out.println("Enter the second number");
						number2= obj.nextDouble();
						System.out.println("The division of the number " + number1 +  " and " +number2+" is = "+(number1/number2));
						
					}
					
					else if(option==5) {
						System.out.println("Enter the number to find square");
						double num=obj.nextDouble();
						System.out.println("The Square of the number  " + num + " is = "+(num*num));
						
					}
					
					else if(option==6) {
						System.out.println("Enter the number to find square root");
						double num=obj.nextDouble();
						System.out.println("The Square root of the number " + num + " is = "+Math.sqrt(num));
						
						
					}
					else if(option==7) {
						System.out.println("Enter the number to find reciprocal");
						double num=obj.nextDouble();
						System.out.println("The Reciprocal of the number " + num + " is = "+(1/num));
						
					}
					
					System.out.println("\nTo continue calculation Press 1 else Press any button to exit");
					int num=obj.nextInt(); //.parseInt(obj.nextLine());
					
					if(num==1) {
						System.out.println("Enter the option: ");
						option= obj.nextInt();
					}
					else {
						System.exit(0);
					}
					
				}while(option>=1 && option<=7);
				
	}

}
