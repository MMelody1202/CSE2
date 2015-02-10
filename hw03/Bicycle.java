//Ji Qi
//hw03-Bicycle

import java.util.Scanner;//import statement

public class Bicycle {
    	 // main method required for every Java program
  public static void main(String[] args) {
  Scanner myScanner = new Scanner( System.in );; //declare and construct
  
System.out.print("Enter the number of seconds (an integer > 0): ");
int secsTrip = myScanner.nextInt();

System.out.print("Enter the number of counts (an integer > 0): ");
int countsTrip = myScanner.nextInt(); 

double wheelDiameter=27.0,// declare variable wheelDiameter and assgin value 27.0
       PI=3.14159, // declare the value of PI to be 3.14159
  	   feetPerMile=5280,  //declare the value of feetPerMile to be 5280
  	   inchesPerFoot=12,   //declare the value of inchesPerFoot to be 12
  	   secondsPerMinute=60, //declare the value of secondsPerMinute to be 60
  	   minutesPerHour=60; //declare the value of minutesPerHour to be 60
double distanceTrip, totalMinutes, averageSpeed; //declare variables

distanceTrip=countsTrip*wheelDiameter*PI; //calculate the distance in inches
distanceTrip/=inchesPerFoot*feetPerMile; // Converts to distance in miles

totalMinutes=secsTrip/secondsPerMinute; //calculate total time in minutes
averageSpeed=distanceTrip/(totalMinutes/minutesPerHour); //calculate average speed in miles per hour

int y= (int) (distanceTrip*100); //declare variable y as an integer
double m=(double) (y*0.01); //declare variable m
		
int x=(int) (totalMinutes*100); //declare variable x as an integer
double p=(double) (x*0.01); //declare variable p
		
int z= (int) (averageSpeed*100); //declare variable z as an integer
double n=(double) (z*0.01);  //declare variable n
		
System.out.println("The distance was "+m+" miles"+ " and took "+p+" minutes");
System.out.println("The average mph was " + n); //print out final result
		
		} //end of main method

} // end of class