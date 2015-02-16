//Ji Qi
//homework4-WhichNumber
//02-15-15

import java.util.Scanner; //import Scanner
public class WhichNumber {
	// main method required for every Java program
 public static void main(String [] args){
	 Scanner sc = new Scanner(System.in);//declare and constrect
	 String yes="y",
			YES="Y",
			no="n",
			NO="N";//declare inputs
	 
	 System.out.println("Think of a number between 1 and 10 inclusive.");
	
	 System.out.println("Is the number even?");
	 String a = sc.nextLine(); //decalre variable and type the correct input to answer the question above
	 if (a.equals(yes)| a.equals(YES)) //determine whether the question "Is the number even?" is true or not
	 {
		 System.out.println("Is it divisible by 3?");
		 String b = sc.nextLine(); //declare variable and type the correct input to answer the question above
		 if (b.equals(yes)|b.equals(YES)) //determine whether the question "Is it divisible by 3?" is true or not
		 {
			 System.out.println("Is your number 6?");
			 String c = sc.nextLine(); //declare variable and type the correct input to answer the question above
			 if (c.equals(yes)|c.equals(YES)) //determine whether the question"Is your number 6?" is true or not 
			 System.out.println("Yay!");//guess the right number and print out "Yay!"
		 }
		 else if (b.equals(no)|b.equals(NO)){
			 System.out.println("Is your number divisible by 4?");
			 String d = sc.nextLine(); //declare variable and type the correct input to answer the question above
			 if (d.equals(yes)|d.equals(YES)){ //determine whether the question "Is your number divisible by 4?" is true or not 
				 System.out.println("Is the number divisible by 4 greater than 1?");
				 String e = sc.nextLine(); //declare variable and type the correct input to answer the question above
				 if (e.equals(yes)|e.equals(YES)){ //determine whether the question "Is the number divisible by 4 greater than 1?" is true or not
					 System.out.println("Is your number 8?");//declare variable and type the correct input to answer the question above
					 String f = sc.nextLine(); //declare variable and type the correct input to answer the question above
					 if (f.equals(yes)|f.equals(YES)) //determine whether the question "Is your number 8?" is true or not
					 System.out.println("Yay!"); //guess the right number and print out "Yay!"
				 }
				 else if (e.equals(no)|e.equals(NO)){ //the number is not divisible by 4 greater than 1
					 System.out.println("Is your number 4?");
					 String g = sc.nextLine(); //declare variable and type the correct input to answer the question above
					 if (g.equals(yes)|g.equals(YES)) //determine whether the question "Is your number 4?" true or not
					 System.out.println("Yay!"); //guess the right number and print out "Yay!"
				 }
				 else System.out.println("Sorry, that is not a valid input.");//otherwise it is not a valid input
			 }
			 else if (d.equals(no)|d.equals(NO)){ //the number is not divisible by 4
				 System.out.println("Is it divisible by 5?");
				 String h = sc.nextLine(); //declare variable and type the correct input to answer the question above
				 if (h.equals(yes)|h.equals(YES)) { //determine whether the question "Is it divisible by 5?" is true or not
					 System.out.println("Is your number 10?");
					 String i = sc.nextLine(); //declare variable
					 if (i.equals(yes)|i.equals(YES)) //determine whether the question "Is your number 10?" is true or not
					 System.out.println("Yay!"); //guess the right number and print out "Yay!"
				 }
				 else if (h.equals(no)|h.equals(NO)){ //the number is not divisible by 5
					 System.out.println("Is your number 2?");
					 String j = sc.nextLine(); //declare variable
					 if (j.equals(yes)|j.equals(YES)) //determine whether the question "Is your number 2?" is true or not
					 System.out.println("Yay!"); //guess the right number and print out "Yay!"
				 }
				 else System.out.println("Sorry, that is not a valid input."); //otherwise it is not a valid input
			 }
			 else System.out.println("Sorry, that is not a valid input."); //otherwise it is not a valid input
		 }
		 else System.out.println("Sorry, that is not a valid input."); //otherwise it is not a valid input
	 }
	 
	 else if (a.equals(no)|a.equals(NO)) //the number is not even
	 {
		 System.out.println("Is it divisible by 3?");
		 String k = sc.nextLine();//declare variable
		 if(k.equals(yes)|k.equals(YES)){ //determine whether the question "Is it divisible by 3?" is true or not
			 System.out.println("When divided by 3 is the result greater than 1?");
			 String l = sc.nextLine();//decalre variable
			 if (l.equals(yes)|l.equals(YES)){ //determine whether the question "When divided by 3 is the result greater than 1?" is true or not
				 System.out.println("Is your number 9?");
				 String m = sc.nextLine();//decalre variable
				 if (m.equals(yes)|m.equals(YES)) //determine whether the question "Is your number 9?" is true or not
				 System.out.println("Yay!"); //guess the right number and print out "Yay!"
			 }
			 else if (l.equals(no)|l.equals(NO)){ //when divided by 3 the result is not greater than 1
				 System.out.println("Is your number 3?");
				 String n = sc.nextLine();//decalre variable
				 if (n.equals(yes)|n.equals(YES)) System.out.println("Yay!"); //guess the right number and print out "Yay!"
			 }
			 else System.out.println("Sorry, that is not a valid input.");//otherwise it is not a valid input
		 }
		 else if (k.equals(no)|k.equals(NO)){ //the number is not divisible by 3
			 System.out.println("Is it greater than 6?");
			 String o = sc.nextLine();//decalre variable
			 if (o.equals(yes)|o.equals(YES)){ //determine whether the question above is true or not
				 System.out.println("Is your number 7?");
				 String p = sc.nextLine();//decalre variable
				 if (p.equals(yes)|p.equals(YES)) System.out.println("Yay!"); //guess the right number and print out "Yay!"
			 }
			 else if (o.equals(no)|o.equals(NO)){ //the number is not greater than 6
				 System.out.println("Is it less than 3?");
				 String q = sc.nextLine();//decalre variable
				 if (q.equals(yes)|q.equals(YES)){ //determine whether the question above is true or not
					 System.out.println("Is your number 1?");
					 String r = sc.nextLine();//decalre variable
					 if (r.equals(yes)|r.equals(YES)) System.out.println("Yay!"); //guess the right number and print out "Yay!"
				 }
				 else if (q.equals(no)|q.equals(NO)){ //the number is not less than 3
					 System.out.println("Is your number 5?");
					 String s = sc.nextLine();//decalre variable
					 if (s.equals(yes)|s.equals(YES)) System.out.println("Yay!"); //otherwise it is not a valid input
				 }
				 else System.out.println("Sorry, that is not a valid input."); //otherwise it is not a valid input
			 }
			 else System.out.println("Sorry, that is not a valid input."); //otherwise it is not a valid input
		 }
		 else System.out.println("Sorry, that is not a valid input."); //otherwise it is not a valid input
			 
			 
	 }
	 else System.out.println("Sorry, that is not a valid input."); //otherwise it is not a valid input
	 
 } //end of method

} //end of class

		