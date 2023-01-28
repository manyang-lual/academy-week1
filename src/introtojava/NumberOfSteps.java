package introtojava;

public class NumberOfSteps {
	
	public int numberOfSteps(int num) {
        
        int count = 0;

        while(num>0){
            if(num%2 == 0){
                num/=2;
            }
            else{
                num-=1;
            }

            count++;
        }

        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfSteps main = new NumberOfSteps();
        int result = main.numberOfSteps(14);
        System.out.println(result);

	}

}
