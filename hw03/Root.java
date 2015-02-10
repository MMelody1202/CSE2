//Ji Qi
//hw03-Root


import java.util.Scanner; //import statement

public class Root {
    // main method required for every Java program
	public static void main(String [] args){
		Scanner myScanner = new Scanner(System.in); //declare and construct
		
System.out.print("Enter a double, and I print its cube root ");
	    double x= myScanner.nextDouble(); //declare variable x
	    double guess=x/3; //declare variable guess as the value of one third of x
	   
	    guess=(2*guess*guess*guess+x)/(3*guess*guess); //enter number for the first guess
	    guess=(2*guess*guess*guess+x)/(3*guess*guess); //substitute the last estimate and calculate again
	    guess=(2*guess*guess*guess+x)/(3*guess*guess); //substitute the last estimate and calculate again
	    guess=(2*guess*guess*guess+x)/(3*guess*guess); //substitute the last estimate and calculate again
	    guess=(2*guess*guess*guess+x)/(3*guess*guess); //substitute the last estimate and calculate again
	    	
	    
	    System.out.println("The cube root is : "+guess);
		System.out.println(guess+"*"+guess+"*"+guess+"="+guess*guess*guess); //print the final result out
		
		
	} //end of main method
	
}  // end of class
	

		