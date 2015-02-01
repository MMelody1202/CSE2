//Ji Qi
//hw02-Arithmetic
//01-30-2015

public class Arithmetic{
    //main method
    public static void main(String [] args){
       
                
  int nSocks=3;  //Number of pairs of socks
  double sockCost$=2.58;  //Cost per pair of socks
  int nGlasses=6; //Number of drinking glasses
  double glassCost$=2.29; //Cost per glass
  int nEnvelopes=1; //Number of boxes of envelopes
  double envelopeCost$=3.25; //cost per box of envelopes
  double taxPercent=0.06;
  double totalSocksCost$; //total cost of socks
  double totalGlassCost$; //total cost of glass
  double totalEnvelopesCost$; //total cost of envelopes
  
  System.out.println("total cost of socks is "+(nSocks*sockCost$)+" dollars and had "+(taxPercent*nSocks*sockCost$) +" tax");
  System.out.println("total cost of glasses is "+(nGlasses*glassCost$)+" dollads and had "+(taxPercent*nGlasses*glassCost$)+" tax");
  System.out.println("total cost of envelopes is "+(nEnvelopes*envelopeCost$)+" dollars and had "+(taxPercent*nEnvelopes*envelopeCost$)+" tax");

  
  System.out.println("total cost is " +(nSocks*sockCost$ + nGlasses*glassCost$ +nEnvelopes*envelopeCost$)+" with no tax");
  System.out.println("actual cost is " + ((nSocks*sockCost$ + nGlasses*glassCost$ +nEnvelopes*envelopeCost$)+((nSocks*sockCost$ + nGlasses*glassCost$ +nEnvelopes*envelopeCost$)*taxPercent))+" with tax");
    }
}
  
