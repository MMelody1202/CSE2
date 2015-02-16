
import java.text.DecimalFormat;
import java.util.Scanner;

public class Banking {
 public static void main(String args []){
	 Scanner sc = new Scanner(System.in);
	 DecimalFormat df=new DecimalFormat("#.00");//restrict the output to have two digits after the decimal point
	 
	 double current=Math.random()*4000+1000;//declare variable in the interval between 1000 and 5000
	 System.out.println("starting money is "+df.format(current));//check the generated number
	 
	 System.out.println("Please select your choice:");//let the users choose their options
	 System.out.println("1 depositing money.");//option1
	 System.out.println("2 withdrawing money.");
	 System.out.println("3 viewing balance.");
	 
	 
	 int choice= sc.nextInt();//declare variable
	 switch(choice){
	 case (1):
		 System.out.println("How much money do you want to deposit?");
	     int a=sc.nextInt();//declare a to be the number to deposit
	     if(a>=0){
	         //
	    	 current+=a;//
	    	 System.out.println("Your resulting balance is "+df.format(current));//print out the resulting balance
	     }
	     else System.out.println("Please enter a positive integer, try again."); //if a is less than 0	 
	     break;//end of case1
	 case (2):
		 System.out.println("How much money do you want to withdraw?");
	     int b=sc.nextInt();//declare b to be the amount withdraw
	     if(b>=0 && b<=current){
	         //under the condition b is greater and equal to 0 and less and equal to curret
	    	 current-=b;//resulting balance
	    	 System.out.println("Your resulting balance is "+df.format(current));//print out the resulting balance
	     }
	     else System.out.println("Please ensure you have entered a positive integer which is no more than your current balance, try angain.");
	     break;
	 case (3):
		 System.out.println("Your current balance is "+df.format(current));//print out the current balance
	     break;
	 }
	 
 }
}

		