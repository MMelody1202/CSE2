//Ji Qi
//homework4-WhichNumber
//02-15-15

import java.util.Scanner; //import

public class WhichNumber {
	// main method required for every Java program
 public static void main(String [] args){
	 Scanner sc = new Scanner(System.in);
	 String yes="y",
			YES="Y",
			no="n",
			NO="N";//declare input
	 
	 System.out.println("Think of a number between 1 and 10 inclusive.");
	
	 System.out.println("Is the number even?");
	 String a = sc.nextLine();//type the correct character to answer the question
	 if (a.equals(yes)| a.equals(YES)) //determine whether the input is equal to "Y" or "y"
	 {
		 System.out.println("Is it divisible by 3?");
		 String b = sc.nextLine();//
		 if (b.equals(yes)|b.equals(YES))
		 {
			 System.out.println("Is your number 6?");
			 String c = sc.nextLine();
			 if (c.equals(yes)|c.equals(YES)) System.out.println("Yay!");//
		 }
		 else if (b.equals(no)|b.equals(NO)){
			 System.out.println("Is your number divisible by 4?");
			 String d = sc.nextLine();
			 if (d.equals(yes)|d.equals(YES)){
				 System.out.println("Is the number divisible by 4 greater than 1?");
				 String e = sc.nextLine();
				 if (e.equals(yes)|e.equals(YES)){
					 System.out.println("Is your number 8?");
					 String f = sc.nextLine();
					 if (f.equals(yes)|f.equals(YES)) System.out.println("Yay!");
				 }
				 else if (e.equals(no)|e.equals(NO)){
					 System.out.println("Is your number 4?");
					 String g = sc.nextLine();
					 if (g.equals(yes)|g.equals(YES)) System.out.println("Yay!");
				 }
				 else System.out.println("Sorry, that is not a valid input.");
			 }
			 else if (d.equals(no)|d.equals(NO)){
				 System.out.println("Is it divisible by 5?");
				 String h = sc.nextLine();
				 if (h.equals(yes)|h.equals(YES)) {
					 System.out.println("Is your number 10?");
					 String i = sc.nextLine();
					 if (i.equals(yes)|i.equals(YES)) System.out.println("Yay!");
				 }
				 else if (h.equals(no)|h.equals(NO)){
					 System.out.println("Is your number 2?");
					 String j = sc.nextLine();
					 if (j.equals(yes)|j.equals(YES)) System.out.println("Yay!");
				 }
				 else System.out.println("Sorry, that is not a valid input.");
			 }
			 else System.out.println("Sorry, that is not a valid input.");
		 }
		 else System.out.println("Sorry, that is not a valid input.");
	 }
	 
	 else if (a.equals(no)|a.equals(NO))
	 {
		 System.out.println("Is it divisible by 3?");
		 String k = sc.nextLine();
		 if(k.equals(yes)|k.equals(YES)){
			 System.out.println("When devided by 3 is the result greater than 1?");
			 String l = sc.nextLine();
			 if (l.equals(yes)|l.equals(YES)){
				 System.out.println("Is your number 9?");
				 String m = sc.nextLine();
				 if (m.equals(yes)|m.equals(YES)) System.out.println("Yay!");
			 }
			 else if (l.equals(no)|l.equals(NO)){
				 System.out.println("Is your number 3?");
				 String n = sc.nextLine();
				 if (n.equals(yes)|n.equals(YES)) System.out.println("Yay!");
			 }
			 else System.out.println("Sorry, that is not a valid input.");
		 }
		 else if (k.equals(no)|k.equals(NO)){
			 System.out.println("Is it greater than 6?");
			 String o = sc.nextLine();
			 if (o.equals(yes)|o.equals(YES)){
				 System.out.println("Is your number 7?");
				 String p = sc.nextLine();
				 if (p.equals(yes)|p.equals(YES)) System.out.println("Yay!");
			 }
			 else if (o.equals(no)|o.equals(NO)){
				 System.out.println("Is it less than 3?");
				 String q = sc.nextLine();
				 if (q.equals(yes)|q.equals(YES)){
					 System.out.println("Is your number 1?");
					 String r = sc.nextLine();
					 if (r.equals(yes)|r.equals(YES)) System.out.println("Yay!");
				 }
				 else if (q.equals(no)|q.equals(NO)){
					 System.out.println("Is your number 5?");
					 String s = sc.nextLine();
					 if (s.equals(yes)|s.equals(YES)) System.out.println("Yay!");
				 }
				 else System.out.println("Sorry, that is not a valid input.");
			 }
			 else System.out.println("Sorry, that is not a valid input.");
		 }
		 else System.out.println("Sorry, that is not a valid input.");
			 
			 
	 }
	 else System.out.println("Sorry, that is not a valid input.");
	 
 }
}

		