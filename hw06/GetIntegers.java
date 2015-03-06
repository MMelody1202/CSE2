//Ji Qi
//hw06
//get integers

import java.util.Scanner; //import Scanner
public class GetIntegers {  
    // main method required for every Java program
    public static void main(String[] args) {
        int index; //declare variable index
        int i = 0; //declare variable i to be 0
        int[] num = new int[5]; //initalized an array to store five positive integers
        System.out.println("Please enter 5 nonnegative integers: ");
        while(i <= 4){    //if i is less than or equal to 4
            do {
                index = 1; //assgin 1 to index
                Scanner scan = new Scanner(System.in); //declare an input
                //check if the input is valid or not
                if (scan.hasNextInt()) { 
                    num[i] = scan.nextInt(); //get variable from user
                    if (num[i] < 0){ //if the user types a negative value
                        System.out.println("Invalid input, enter again");
                        index = 0; //assign 0 to index when input is negative
                        }
                    else
                        i++; 
                } 
                // if invalid input, let user re-enter
                else if (!scan.hasNextInt()){
                    System.out.println("Invalid input, enter again");
                    scan.nextLine(); //read next line
                    index = 0; //assign 0 to index when the user has re-entered
                }
                }while (index == 0); //
           }
        // get the sum of the five numbers
        int total = num[0]+num[1]+num[2]+num[3]+num[4]; //declare and assign value to total
        System.out.println("Sum is "+total);
    } //end of method
} //end of class
