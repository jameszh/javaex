import hsa.*;

//new line
public class looping9v1 {
   public static void main(String[]args){
	   Console con = new Console();
   
   String strName;
   String strBackwards;
   String strLetter;
   int intLength;
   int intCounter;
   
   strBackwards = "";
   
   con.println("What is your name");
   strName = con.readLine();
   
   intLength = strName.length();
   con.println("your name is this long:"+intLength);
   
   for(intCounter = 0; intCounter < intLength; intCounter++){
	   //con.println("test: "+intCounter);
	   strLetter = strName. substring(intCounter, intCounter+1);
	   //con.println("test letter: "+strLetter);
	   strBackwards = strLetter + strBackwards;
	   //con.println("test back: "+strBackwards);
	   
   }
   con.println("haha,your name backwards is:"+strBackwards);   
  }

}
   