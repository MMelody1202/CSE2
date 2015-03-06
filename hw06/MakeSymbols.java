// Ji QI
//hw06
//MakeSymbols
import java.util.*; //import a package
public class MakeSymbols {
    //main class
    public static void main(String[] args) {
        //main method
        int a;//declare variable a
        int index; //declare variable index
        //generate an integer between 0 and 100
        a = (int) (Math.random() * 100); //generate an integer between 0 and 100
        System.out.println("Random number generated: " + a);
        //detect the number is even or odd
        if((a%2)==0) //if a is even
           index = 0; //assgin 0 to index
        else
            index = 1; //if a is odd, assgin 1 to index
        //print out the result
        System.out.print("The output pattern: ");
        do{
            if(index == 0) //when a is even, output is *
                System.out.print("*");
            else //when a is odd, output is &
                System.out.print("&");
            a--;
            }while(a!=0);
    }//end of method
}//end of class