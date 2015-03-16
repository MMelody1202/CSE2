//Ji Qi
//cse2-hw07
//waves-for loop

import java.util.Scanner;

public class waves {
 public static void main(String agrs[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a number between 1 and 30: ");
	 int n=sc.nextInt();
	 int i,j,k,m,l;
	 
	 for(i=1;i<=n;i++){
		if(i%2==0){
		for(j=1;j<=i;j++){
		for(k=1;k<=j;k++){
			System.out.print(i);
		} 
		 System.out.println("");
	 }
	 }
		else{
			for(l=i;l>=1;l--){
				for(m=1;m<=l;m++){
					System.out.print(i);
				} 
				 System.out.println("");
			 }
		}
	 }
 }
}

		