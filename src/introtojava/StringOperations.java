package introtojava;

import java.util.Scanner;
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        
        
        System.out.println("/................String Menu................/");
		System.out.println("Press 1 for Palindrome Check");
		System.out.println("Press 2 to reverse a String");
		System.out.println("Press 3 to Concatenate two Strings");
		System.out.println("Press 4 for String Comparison");
		System.out.println("Press 5 to Calculate the Length of String");

        System.out.println("Enter the option:");
        String str = obj.nextLine();
        int option = Integer.parseInt(str);
        String input;
        
        do {
            if(option==1){
                System.out.println("Palimdrome Check");
                System.out.println("Enter a string");
                input = obj.nextLine();
                System.out.println(input);
                
                isPalindrome(input);
            	}
            else if(option==2) {
            	System.out.println("Reverse the string");
                System.out.println("Enter a string");
                input = obj.nextLine();
                System.out.println(input);
                reverseString(input);
            }
            
            else if(option==3) {
            	System.out.println("String concatenation");
                System.out.println("Enter First string:");
                String str1 = obj.nextLine();
                System.out.println(str1);
                
                
                System.out.println("Enter the Second string");
                String str2 = obj.nextLine();
                System.out.println(str2);
                
                System.out.println(str1+str2);
            }
            
            else if(option==4) {
            	System.out.println("String comparisson");
                System.out.println("Enter First string:");
                String s1 = obj.nextLine();
                System.out.println(s1);
                
                
                System.out.println("Enter the Second string");
                String s2 = obj.nextLine();
                System.out.println(s2);
                
                if(s1.equalsIgnoreCase(s2)) {
                	System.out.println("The strings "+s1+" and "+ s2+" are the same");
                }
                else {
                	System.out.println("The strings "+s1+" and "+ s2+" are not the same");
                }
            }
            else if(option==5){
                System.out.println("Length of a string");
                System.out.println("Enter a string");

                input=obj.nextLine();
                System.out.println(input);
                System.out.println("The length of the entered string is: "+input.length());
            }
            System.out.println("\nPress any number to contnue");
            option=Integer.parseInt(obj.nextLine());
        }while(option>=1 && option<=7);

    }
  
       public static void isPalindrome(String string){
            String str=string.toLowerCase();
            boolean check=true;
            int frontIndex=0;
            for(int index=str.length()-1; index>str.length()/2; index--){
                if(str.charAt(index-frontIndex) != str.charAt(frontIndex)){
                	check=false;
                    break;
                }
    
            }
            
            if(check){
                System.out.println("The String "+ string+" is not a palindrome ");
            }
            else{
                System.out.println("The string "+string+" is a palindrome" );
            }
    		
        }
       public static void reverseString(String string) {
    	   char[] arr = new char[string.length()];
    	   
    	   int j=0;
    	   for(int i=string.length()-1; i>=0; i--) {
    		   arr[j]=string.charAt(i);
    		   j++;
    	   }
    	   String reverse=new String(arr);
    	   System.out.println("The reverse of "+string+" is " +reverse);
       }

}
