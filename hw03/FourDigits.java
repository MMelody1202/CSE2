//Ji Qi
//hw03-FourDigits


import java.util.Scanner; //import statement

public class FourDigits {
     // main method required for every Java program
	public static void main(String [] args){
		Scanner myScanner = new Scanner(System.in); //declare and construct
		
		System.out.print("Enter a double and I display the four digits to the right of the decimal point ");
	    double x= myScanner.nextDouble(); //declare variable x
	    int y1, y2, y3, y4; //declare variable y1, y2, y3, y4
	    
	    y1=(int)(x*10)%10; //get the first digit by multiplying the number by 10 and divided
	    y2=(int)(x*100)%10;
	    y3=(int)(x*1000)%10;
	    y4=(int)(x*10000)%10;
	    
	   
	   
	    System.out.println("The four digits are: "+ y1+y2+y3+y4 ); //print the final result out
	} //end of main method
}  // end of class
