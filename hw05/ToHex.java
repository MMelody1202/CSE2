//Ji Qi
//homework5
//Decimal to Hexadecimal Converter
//02-22-2015


import java.util.Scanner; //import Scanner

public class ToHex {
		// main method required for every Java program
	 public static void main(String args []){
		 Scanner sc = new Scanner(System.in); //declare and construct
		 System.out.println("Please enter three numbers representing RGB values:");//let the user enter 3 numbers
		 int R,G,B; //declare variable R, G and B to be integers 
		 if(sc.hasNextInt()){ //if the input is integer
			 
			 String s=sc.nextLine(); //declare String s
			 String[] arr=s.split(" ");
		try{ 
			 if (arr.length==3) //if the length of the array is equal to 3
			 {
		  R=Integer.parseInt(arr[0]); //declare and assign value to variable R to be the first number of array
			 G=Integer.parseInt(arr[1]); //declare and assign value to variable G to be the second number of array
			 B=Integer.parseInt(arr[2]); //declare and assign value to variable B to be the thirf number of array
		 if(R>=0&&R<=255&&G>=0&&G<=255&&B>=0&&B<=255){ //if R is greater than and equal to 0 and R is less than and equal to 255 and G is greater than and equal to 0 and G is less than and equal to 0 
		 System.out.print("The decimal numbers R: "+R+", G:"+G+", B:"+B+", is represented in hexadecimal as: ");  //print out the above statment 
		 int R1=R/16; //decalre R1 to be an integer and  to be 1/16 of R
		 int R2=R%16; //declare R2 to be an integer and to be the remainder of R divided by 16
		 int G1=G/16; //declare G1 to be an integer and  to be the 1/16 of G
		 int G2=G%16; //declare G2 to be an integer and to be the remainder of G divided by 16
		 int B1=B/16; //declare B1 to be an integer and to be 1/16 of B
		 int B2=B%16; //declare B2 to be an integer and to be the remainder of B divided by 16
		 //System.out.println(R1+" "+R2+","+G1+" "+G2+","+B1+" "+B2); //print out the statement
		 String a1,a2,b1,b2,c1,c2;//declare a1, a2, b1, b2,c1 and c2 to be string
		 if (R1>=0&&R1<=9)a1 = String.valueOf(R1);//if a1 (under the condition that R1 is greater than and equal to 0 and R1 is less than and equal to 9) is equal to R1
		 else if(R1==10) a1="A"; // if the above if statement does not meet, then to see if a1 is under the condition R1 equal to 10, if it is then a1=A
		 else if(R1==11) a1="B"; //if the above else if does not meet, then to see if a1 is under the condition R1 equal to 11, if it is then a1=B
		 else if(R1==12) a1="C"; //if the above else if does not meet, then to see if a1 is under the condition R1 equal to 12, if it is then a1=C
		 else if(R1==13) a1="D"; //if the above else if does not meet, then to see if a1 is under the condition R1 equal to 13, if it is then a1=D
		 else if(R1==14) a1="E"; //if the above else if does not meet, then to see if a1 is under the condition R1 equal to 14, if it is then a1=E
		 else  a1="F";  //if all the else if &if statements do not meet, then a1 equal to F
		 if (R2>=0&&R2<=9)a2 = String.valueOf(R2); //if a2 (under the condition that R2 is greater than and equal to 0 and R1 is less than and equal to 9) is equal to R2
		 else if(R2==10) a2="A"; //if the above if statement does not meet, then to see if a2 is under the condition R2 equal to 10, if it is then a2=A
		 else if(R2==11) a2="B"; //if the above else if does not meet, then to see if a2 is under the condition R2 equal to 11, if it is then a2=B
		 else if(R2==12) a2="C";  //if the above else if does not meet, then to see if a2 is under the condition R2 equal to 12, if it is then a2=C
		 else if(R2==13) a2="D"; //if the above else if does not meet, then to see if a2 is under the condition R2 equal to 13, if it is then a2=D
		 else if(R2==14) a2="E"; //if the above else if does not meet, then to see if a2 is under the condition R2 equal to 14, if it is then a2=E
		 else  a2="F"; //if all the else if &if statements do not meet, then a2 equal to F
		 if (G1>=0&&G1<=9)b1 = String.valueOf(G1); //if b1 (under the condition that G1 is greater than and equal to 0 and G1 is less than and equal to 9) is equal to G1
		 else if(G1==10) b1="A"; //if the above if statement does not meet, then to see if b1 is under the condition G1 equal to 10, if it is then b1=A
		 else if(G1==11) b1="B"; //if the above else if does not meet, then to see if b1 is under the condition G1 equal to 11, if it is then b1=B
		 else if(G1==12) b1="C"; //if the above else if does not meet, then to see if b1 is under the condition G1 equal to 12, if it is then b1=C
		 else if(G1==13) b1="D";  //if the above else if does not meet, then to see if b1 is under the condition G1 equal to 13, if it is then b1=D
		 else if(G1==14) b1="E" ; //if the above else if does not meet, then to see if b1 is under the condition G1 equal to 14, if it is then b1=E
		 else  b1="F"; //if all the else if &if statements do not meet, then b1 equal to F
		 if (G2>=0&&G2<=9)b2 = String.valueOf(G2); //if b2 (under the condition that G2 is greater than and equal to 0 and G2 is less than and equal to 9) is equal to G2
		 else if(G2==10) b2="A"; //if the above if statement does not meet, then to see if b2 is under the condition G2 equal to 10, if it is then b2=A
		 else if(G2==11) b2="B"; //if the above else if does not meet, then to see if b2 is under the condition G2 equal to 11, if it is then b2=B
		 else if(G2==12) b2="C"; //if the above else if does not meet, then to see if b2 is under the condition G2 equal to 12, if it is then b2=C
		 else if(G2==13) b2="D"; //if the above else if does not meet, then to see if b2 is under the condition G2 equal to 13, if it is then b2=D
		 else if(G2==14) b2="E";  //if the above else if does not meet, then to see if b2 is under the condition G2 equal to 14, if it is then b2=E
		 else  b2="F"; //if all the else if &if statements do not meet, then b2 equal to F
		 if (B1>=0&&B1<=9)c1 = String.valueOf(B1); //if c1 (under the condition that B1 is greater than and equal to 0 and B1 is less than and equal to 9) is equal to B1
		 else if(B1==10) c1="A"; //if the above if statement does not meet, then to see if c1 is under the condition B1 equal to 10, if it is then c1=A
		 else if(B1==11) c1="B"; //if the above else if does not meet, then to see if c1 is under the condition  equal to 11, if it is then c1=B
		 else if(B1==12) c1="C"; //if the above else if does not meet, then to see if c1 is under the condition B1 equal to 12, if it is then c1=C
		 else if(B1==13) c1="D"; //if the above else if does not meet, then to see if c1 is under the condition B1 equal to 13, if it is then c1=D
		 else if(B1==14) c1="E"; //if the above else if does not meet, then to see if c1 is under the condition B1 equal to 14, if it is then c1=E
		 else  c1="F"; //if all the else if &if statements do not meet, then c1 equal to F
		 if (B2>=0&&B2<=9)c2 = String.valueOf(B2); //if c2 (under the condition that B2 is greater than and equal to 0 and B2 is less than and equal to 9) is equal to B2
		 else if(B2==10) c2="A"; //if the above if statement does not meet, then to see if c2 is under the condition B2 equal to 10, if it is then c2=A
		 else if(B2==11) c2="B"; //if the above else if does not meet, then to see if c2 is under the condition B2 equal to 11, if it is then c2=B
		 else if(B2==12) c2="C"; //if the above else if does not meet, then to see if c2 is under the condition B2 equal to 12, if it is then c2=C
		 else if(B2==13) c2="D"; //if the above else if does not meet, then to see if c2 is under the condition B2 equal to 13, if it is then c2=D
		 else if(B2==14) c2="E"; //if the above else if does not meet, then to see if c2 is under the condition B2 equal to 14, if it is then c2=E
		 else  c2="F"; //if all the else if &if statements do not meet, then c2 equal to F
		 System.out.println(a1+a2+b1+b2+c1+c2); //print out the final result
		 }
		 else System.out.println("Sorry, you must enter values between 0-255."); //if the user does not enter values between 0-255
		 }
	       else System.out.println("Sorry, you must enter three numbers."); //if the user does not enter three numbers
		}
		
		catch (Exception e){ 
			System.out.println("Sorry, your input must consist of integers.");//if the user does not enter inputs that consist of integers
		}
		
	}
		 
	 } //end of method
} //end of class