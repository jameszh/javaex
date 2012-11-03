import hsa.*;

public class looping7{
    public static void main(String[] args){
       Console con = new Console();
       //count down from 100 to 0 by 5s
       
       //Variable
       int intCounter;
       int intNumber;
       
       //initialize
       intNumber = 100;
       
       for(intCounter = 20; intCounter > 0; intCounter--){
	       //Counting downwards 20 times 
           //con.println("testing loop"+intCounter);
           con.println("the number is:"+intNumber);
           intNumber = intNumber - 5;
           
	  }
       
   } 
}   