// Ji Qi
// hw8
//03-21/15

import java.util.Scanner; //import Scanner
public class HW8 {
    //main class requried for every java program
	public static void main(String[] args) {
	    //main method
		 char option; //declare option
		 Scanner scan = new Scanner(System.in); //declare 

		 System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!"); //print out the sentence

		 System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-"); //print out "Please hit 'C' or 'c' to continue, anything else to quit-"

	
		 String input = getInput(scan, "Cc");  //call getInput method

		 
		 System.out.println("You are in a dead valley."); //print out "You are in a dead valley."

		 System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-"); //print out the sentence

	
		 input = getInput(scan, "Cc"); //call getInput method

		 System.out.println("You walked and walked and walked and you saw a cave!"); //print out the sentence

		 
		 cave(); //call cave method

		 System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");

	
		 input = getInput(scan, "Cc"); //call getInput method

		 System.out.println("You entered a cave!");

		 System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");

		 
		 input = getInput(scan, "Cc"); //call getInput method

		 System.out.println("Unfortunately, you ran into a GIANT!");

		
		 giant(); //call giant method

		 System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");

	
		 input = getInput(scan, "AaEe", 10); //call getInput method

		 System.out.println("Congratulations! You SURVIVED! Get your REWARD!");

		 System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        
		
		
		 box(); //call box method
     
         
		 input = getInput(scan); //call getInput method

		 System.out.println("Hero! Have a good day!");
		 

		 }
	public static void giant() { //giant method in which the output is the graph "giant"

		 System.out.println("            --------- ");

		 System.out.println("           |  /   \\|  ");
		 
		 System.out.println(" ZZZZZH    |    O   |     HZZZZZ ");

		 System.out.println("      H    -----------    H ");

		 System.out.println(" ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ ");

		 System.out.println("      H    HHHHHHHHHHH    H ");

		 System.out.println(" ZZZZZH    HHHHHHHHHHH    HZZZZZ ");

		 System.out.println("           HHHHHHHHHHH ");

		 System.out.println("           HHH     HHH ");

		 System.out.println("          HHH       HHH ");

		 }
		 
	public static void cave() { //cave method in which the output is graph "crave"

		 System.out.println("                    *****   * * * * * * * * ");

		 System.out.println("               ***         *** ");

		 System.out.println("            ***               *** ");

		 System.out.println("       |    ***               *** ");

		 System.out.println("       |    ***               *** ");

		 System.out.println("   O __|__  ***               *** ");

		 System.out.println(" ******l    ***               *** ");

		 System.out.println("  * *       ***               *** ");

		 System.out.println(" *   *      ********************* * * * * * * ");

		 }

		 public static void box(){ //box method in which the output is graph "box"

		 System.out.println(" ********************* ********************* ********************* ");

		 System.out.println(" ***               *** ***               *** ***               *** ");

		 System.out.println(" ***      1        *** ***        2      *** ***        3      *** ");

		 System.out.println(" ***               *** ***               *** ***               *** ");

		 System.out.println(" ********************* ********************* ********************* "); 

		 }
		 
		 public static String getInput(Scanner scan, String string){ //getInput method
			 
			 String aa=""; //declare and assign string aa
			 String s1=scan.nextLine(); //get input from keyboard and assign it to s1
			 if(s1.equals("C")||s1.equals("c")) //if s1 is equal to C or c, continue
				;
			 else //if s1 is not C or c, the output is "Yea right LOSER" and quit the game
				 {System.out.println("Yea right LOSER!");
				 System.exit(0);   //quit the game
				 }
			return aa; //return value of this method is aa
			 
		 }
		 
		 public static String getInput(Scanner scan, String string, int trial){ //getInput method and redefine the method
			 
			 String bb=""; //declare and assign string bb
			 int trail=0; //declare and assign trail to 0
			 double x,y; 
			 int m; //declare variables
			
			
			 while(trail<10){ //while loop when the number success trails reach 10, the loop ends
			 String s2=scan.nextLine(); //get input from keyboard and assign this value to s2
			 
			 if(s2.equals("A")||s2.equals("a")) {                 //choose to attack giant
			 
				 x=Math.random(); //get a random number between 0 and 1
				
				 if(x>=0&&x<0.5)x=0; //if x is between 0 and 0.5, assign 0 to x
				 else x=1; //if x is between 0.5 to 1, assign 1 to x
				 if(x==1){ //if x is equal to 1, the attack is successful
					 System.out.println("Critical Hit!");
					 trail++; //trail is the number of successful attack and the trail is added by 1
				 }
				 else{ //when x is equal to 0, the attack fails
					 System.out.println("Gosh! How can you miss it!");
			 }
			 }
			 
			 else if(s2.equals("E")||s2.equals("e")){           //choose to escape
				 y=Math.random()*10+1; //get a random number between 1 and 11
				 m=(int)y; //casting y to m, which changes the range of m to 1-10
				 if(m!=10) ; //if m is not equal to 10 ,the escape fails
				 else //only when m is equal to 10, the escape is successful
				 {System.exit(0);}  // exit the game
			 }
			 else //if the input is not A,a,E,e, the output is "Executed by the GIANT! Game Over!"
			 { System.out.println("Executed by the GIANT! Game Over!");   
			  System.exit(0); //exit the game
			 }
			 }
			 return bb; //in the method, the return value is bb
		 }
		 
		 public static String getInput(Scanner scan){  //this getInput method is redefined
			 String cc=""; //decalre and assgin cc
			 int s3=scan.nextInt(); //get the input from keyboard and assgin it to s3
			 switch(s3){ 
			 case (1): //if the user choose box 1
				 System.out.print("It is GPA4.0!"); 
			     break; 
			 case (2): //if the user choose box2
				 System.out.print("It is GPA4.0");
			     break;
			 case (3): //if the user choose box3
				 System.out.print("It is GPA4.0");
			     break;
			 default: //by default, the output is "A WRONG NUMBER! You get nothing! Better retart the game LOL"
				 System.out.print("A WRONG NUMBER! You get nothing! Better retart the game LOL");
			 }
			 
			 
			 return cc; // in the method, the return value is cc
		 } //end of method
}//end of class

		