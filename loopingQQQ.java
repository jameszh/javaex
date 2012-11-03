//11 - guess the number game
import hsa.*;

public class loopingQQQ{
    public static void main(String[] args){
       Console con = new Console();
       int intRandom;
       int intGuess;
       int intTries; 
       
       intRandom = 0;
       intGuess = 0;
       intTries = 0; 

       
       //Generate random number
       intRandom = (int)(Math.random()*100+1);
       //con.println(intRandom);
       
       while(intGuess != intRandom){
	       con.println("guess a number");
	       intGuess=con.readInt(); 
	       intTries = intTries + 1;
	       if(intGuess < intRandom){ 
		       con.println("too low"); 
	       }else if(intGuess > intRandom){
		       con.println("too high");
	       }else{
		       con.println("you got it! congrats"); 
	       }            
       }
       con.println("you tried this many times: "+intTries); 
  }
}     