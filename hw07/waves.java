//Ji Qi
//cse2-hw07
//waves-for loop


import java.util.Scanner; //import Scanner

public class waves {
	// main method required for every Java program
 public static void main(String agrs[]){
	 Scanner sc = new Scanner(System.in); 
	 System.out.print("enter a number between 1 and 30: ");
	 int n=sc.nextInt(); //read the input from keyboard
	 int i=1,j=1,k=1,m,l; //declare variables i to be 1, j to be 1,k to be 1, m and l
	 
	 System.out.println("FOR LOOP:"); //print out "FOR LOOP:"
	 for(i=1;i<=n;i++){ //control the number shown in the output, and the output is i
		if(i%2==0){ //if i is even
		for(j=1;j<=i;j++){ //make sure the number of output in each line is in ascending order, the first line output is one number, the last line output has i numbers
		for(k=1;k<=j;k++){ //control the output of one line, the output is i and maximum number of output is k
			System.out.print(i); 
		} 
		 System.out.println(""); //change to the next line
	 }
	 }
		else{ //if i is odd
			for(l=i;l>=1;l--){ //make sure the number of output in each line is in descending order, the first line output has i numbers ,the last line output has one number
				for(m=1;m<=l;m++){ //control the output of one line, the output is i and maximum number of output is m
					System.out.print(i);
				} 
				 System.out.println(""); //change to the next line
			 }
		}
	 }
	 
	 System.out.println("WHILE LOOP:"); //print out "WHILE LOOP:"
    i=1;
    j=1;
    k=1;
    l=1;
    m=1;//assign value to i,j,k,l and m to be 1
	 
	 while(i<=n){
	
		if(i%2==0){ //when i is even
			j=1; 
		while(j<=i){ //make sure the number of output in each line is in ascending order, the first line output is one number, the last line output has i numbers
	
			k=1;
		while(k<=j){ //control the output of one line, the output is i and maximum number of output is k
			k++;
			System.out.print(i);
		} 
		j++;
		 System.out.println(""); //change to the next line
	 }
	 }
		else{ //if i is odd
			l=i;
			while(l>=1){ //make sure the number of output in each line is in descending order, the first line output has i numbers ,the last line output has one number
				
				m=1;
				while(m<=l){ //control the output of one line, the output is i and maximum number of output is m
					m++;
					System.out.print(i);
				} 
				l--;
				 System.out.println(""); //change to the next line
			 }
		}
		i++;
	 }
	 
	 System.out.println("DO-WHILE LOOP:"); //print out "DO-WHILE LOOP:"
	 i=1;j=1;k=1;l=1;m=1; //assign values to i, j ,k l and m to be 1
	 do{
			
			if(i%2==0){ //if i is even
				j=1;
			do{ //make sure the number of output in each line is in ascending order, the first line output is one number, the last line output has i numbers
		
				k=1;
			do{ //control the output of one line, the output is i and maximum number of output is k
				k++;
				System.out.print(i);
			} while(k<=j); 
			j++;
			 System.out.println(""); //change to the next line
		 }while(j<=i);
		 }
			else{ //if i is odd
				l=i;
				do{ //make sure the number of output in each line is in descending order, the first line output has i numbers ,the last line output has one number
					
					m=1;
					do{ //control the output of one line, the output is i and maximum number of output is m
						m++;
						System.out.print(i);
					} while(m<=l);
					l--;
					 System.out.println(""); //change to the next line
				 }while(l>=1);
			}
			i++;
		 }while(i<=n);
	 
 }//end of method
} //end of class


		