package introtojava;

import java.util.Scanner;

public class Pluralizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
	    System.out.print("# in:");
	    int amt = inp.nextInt();
	    inp.nextLine(); //this line is necessary
	    System.out.print("word:");
	    String word = inp.nextLine();
	    //leave the above unedited, write your code below:
	    
	    int len=word.length();
	    if(amt<=1) {
	    	System.out.print(amt+" "+word);
	    }
	    else {
	    	
	    	if(word.substring(word.length()-2).equals("fe")){
	    		
	    		String s = word.substring(0,word.length()-2)+"ves";
		    	
		    	System.out.print(amt+" "+s);
	    	}
	    	
	    	else if(word.substring(len-1).equals("y") && !(word.substring(len-2).equals("ay")||word.substring(len-2).equals("oy")||word.substring(len-2).equals("ey")||word.substring(len-2).equals("uy"))) {
	    		String s = word.substring(0,word.length()-1)+"ies";
		    	System.out.print(amt+" "+s);
	    		
	    	}
	    	
	    	else if(word.substring(word.length()-2).equals("sh")||word.substring(word.length()-2).equals("ch")) {
	    		String s = word.substring(0,word.length())+"es";
		    	System.out.print(amt+" "+s);
	    		
	    	}
	    	
	    	else if(word.substring(len-2).equals("us")) {
	    		String s = word.substring(0,len-2)+"i";
	    		
		    	System.out.print(amt+" "+s);
	    	}
	    	
	    	else if(word.substring(len-2).equals("ay")||word.substring(len-2).equals("oy")||word.substring(len-2).equals("ey")||word.substring(len-2).equals("uy")) {
	    		String s = word.substring(0,len)+"s";
		    	System.out.print(amt+" "+s);

	    	}
	    	else {
	    		String s = word.substring(0,len)+"s";
		    	System.out.print(amt+" "+s);
	    	}
	    }

	}

}
