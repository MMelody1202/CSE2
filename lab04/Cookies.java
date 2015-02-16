//Ji Qi
//lab04: Cookies


import java.util.Scanner; //import Scanner

public class Cookies {
	//main method required for every Java program
 public static void main(String [] args){
	 Scanner sc = new Scanner(System.in); //declare and construct
	 
	 System.out.print("Enter the number of people: ");
	 String people=sc.nextLine();//declare variable
	
	 if (people.matches("\\d+")) 
	 {
     int p=Integer.parseInt(people);//declare variable p
     if(p<=0)System.out.println("You did not enter an int >0");//if p is less and equal to 0
	 System.out.print("Enter the number of cookies you are planning to buy: ");
	 int cookie=sc.nextInt(); //declare variable cookie
	 System.out.print("How many do you want each people to get?");
	 int each=sc.nextInt();//declare variable each
	 if (cookie<each*p){
		 int more=each*p - cookie; //declare variable more
		 System.out.println("You will not have enough cookies. you need to buy at least "+more+" more");//print out the result
	 }
	 else if(cookie%p !=0){
		 System.out.println("You have enough, but they will not divide evenly.");//print out the result
	 } 
	 else System.out.println("You have enough cookies for each person and the amount will devide evenly.");//print out the result
	 }
	 else if(people.matches("-?[0-9]+")) 
	 System.out.println("You did not enter an int >0");//print out the result
	 
	
	 else 
		 System.out.println("You did not enter an int");//print out the result
 } //end of main method
} //end of class

		
		







   			    
   			    



