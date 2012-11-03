import hsa.*;

public class looping4{
    public static void main(String[] args){
       Console con = new Console();
       int intCounter;
       
       for(intCounter = 0; intCounter < 10; intCounter++){
       
	       //intCounter=0 means that the variable will start at this number
	       //intCounter <8 is the condition that determines if the loop will continue
           //intCounter++ means that this variable is counting up every loop
           //intCounter--means that this variable is counting down every loop
           
           con.println("I'm looping");
           con.println("in a for loop");
           con.println(intCounter); 
        }   
        con.println("whew..the loops is over");
        con.println("he final count on the loop that stopped it was:"+intCounter);
   }
}	  
       