package introtojava;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Are you going out tonight? true or false :");
		boolean decider = obj.nextBoolean();
		if(decider) {
			System.out.println("Yes you are going out tonight");
		}else {
			System.out.println("We are staying in tonight and watching a movie");
		}

	}

}
