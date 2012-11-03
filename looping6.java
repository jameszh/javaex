import hsa.*;

public class looping6{
    public static void main(String[] args){
       Console con = new Console();
       int intRandom; 
       
       //100 represents the range of numbers .... you can change this to specify
       //larger or smaller range 
       //1 represents the starting number for your range 
       //in this case, the rarnge will start at 1 and go to 100 for randomness
       //change this if you want a different starting number.
       intRandom = (int)(Math.random()*100+1); 
       
       con.println("the random number is:"+intRandom);
   }
}	  
       