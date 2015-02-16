//Ji Qi
//hw04:Banking
//02-15-15

import java.text.DecimalFormat;//import DecimalFormat
import java.util.Scanner;//import Scanner

public class Banking { 
	// main method required for every Java program
 public static void main(String [] args){
	 Scanner sc = new Scanner(System.in);//declare and construct
	 DecimalFormat df = new DecimalFormat("#.00");//restrict the output to have two digits after the decimal point
	 
	 double current = Math.random()*4000+1000;//declare variable current in the interval between 1000 and 5000
	 System.out.println("starting money is "+df.format(current));//check the generated number
	 
	 System.out.println("Please select your choice:");//let the users choose their options
	 System.out.println("1 depositing money."); //option1 is depositing money
	 System.out.println("2 withdrawing money."); //option2 is withdrawing money
	 System.out.println("3 viewing balance."); //option3 is viewing balance
	 
	 
	 int choice= sc.nextInt();//declare variable choice as an integer
	 switch(choice){ //list all three cases
	 case (1)://beginning of case1
		 System.out.println("How much money do you want to deposit?");
	     int a=sc.nextInt();//declare a to be the number to deposit
	     if(a>=0){
	         //if a is greater and equal to 0
	    	 current+=a;//current becomes current plus a
	    	 System.out.println("Your resulting balance is "+df.format(current));//print out the resulting balance
	     }
	     else System.out.println("Please enter a positive integer, try again."); //if a is less than 0	 
	     break;//end of case1
	 case (2)://beginng of case2
		 System.out.println("How much money do you want to withdraw?");
	     int b=sc.nextInt();//declare b to be the amount withdraw
	     if(b>=0 && b<=current){ 
	         //under the condition b is greater and equal to 0 and less and equal to curret
	    	 current-=b;//resulting balance is current minus b
	    	 System.out.println("Your resulting balance is "+df.format(current));//print out the resulting balance
	     }
	     else System.out.println("Please ensure you have entered a positive integer which is no more than your current balance, try angain.");
	     break;//end of case2
	     
	 case (3)://beginnign of case3
		 System.out.println("Your current balance is "+df.format(current));//print out the current balance
	     break;//end of case3
	 }
	 
 }//end of method
}//end of class

		