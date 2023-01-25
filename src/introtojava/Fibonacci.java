package introtojava;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int fibo=0;
		int count=0;
		while(count <= 10) {
			System.out.print(fibo+" ");
			a=b;
			b=fibo;
			fibo=a+b;
			count++;
		}
		
	}

}
