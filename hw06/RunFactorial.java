// Ji Qi
//hw06
//RunFactorial

import java.util.Scanner; //import Scanner
public class RunFactorial {
    // main method required for every Java program
    public static void main(String[] args) {
        int input = 0; //declare and assign value to input
        int index; //declare index
        int result = 0; //declare and assign value to result
        System.out.println("Please enter an integer that is between 9 and 16:");
        do {
                index = 1; //assgin 1 to index
                Scanner scan = new Scanner(System.in); //get keyboard input
                //check if the input is valid
                if (scan.hasNextInt()) { 
                    input = scan.nextInt(); 
                    if (input < 9 || input > 16){ //if the input is less than 9 or greater than 16
                        System.out.println("Invalid input, enter again"); 
                        index = 0; //assign 0 to index
                        }
                } 
                
                else if (!scan.hasNextInt()){  // if invalid input, let user re-enter
                    System.out.println("Invalid input, enter again");
                    scan.nextLine(); 
                    index = 0; //assign 0 to index
                }
                }while (index == 0); //when index is 0, do the above do part
        System.out.println("Input accepted:");
        result = input; //assign input to result
        int out = input; //declare and assign input to out
        //use this while loop to solve the factorial programs
        while(input != 1){ //when input is not equal to 1
            result = result * (input-1); //comput the factorial outcome
            input--; 
    }
        //result
        System.out.print(out + "!=");
        System.out.println(result);       
    }   //end of method
} //end of class

