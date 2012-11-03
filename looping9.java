//palindrome checker...word has to be the same fowards and backwards 

import hsa.*;

public class looping9{
   public static void main(String[]args){
	   Console con = new Console();
   
   String strFoward;
   String strBackwards;
   String strLetter;
   int intLength;
   int intCounter;
   
   
   strFoward = "";
   
   while(!strFoward.equals("stop")){
	   
	   strBackwards = "";
	   
	   con.println("What is your name");
	   strFoward= con.readLine();
	   
	   intLength = strFoward.length();
	   con.println("the length is:"+intLength);
	   
	   for(intCounter = 0; intCounter < intLength; intCounter++){
		   //con.println("test: "+intCounter);
		   strLetter = strFoward. substring(intCounter, intCounter+1);
		   //con.println("test letter: "+strLetter);
		   strBackwards = strLetter + strBackwards;
		   //con.println(strBackwards);
		   //con.println("letter: "+strLetter);
		   
	   }
	   con.println("your word backwards is:"+strBackwards);   
	   
	   if(strFoward.equalsIgnoreCase(strBackwards)){
		   con.println("palindrome!!!!!");
	   }else{
		   con.println("not palindrome!!!");   
      }
    }
  }
}
   