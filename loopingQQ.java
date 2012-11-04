//Canada 3 different ways
import hsa.*;

public class loopingQQ{
    public static void main(String[] args){
       Console con = new Console();
       String strWord;
       String strPart;
       String strSpaces;
       String strSpacesPart; 
       int intCount; 
       int intLength; 
       
       strSpaces = "";
       
       con.println("give me a word to styleize");
       strWord = con.readLine();
       intLength = strWord.length(); 
       //.length() gets the number of letters in the word 
       
       //Pattern 1
       
       for(intCount = intLength; intCount >=1; intCount--){
          strPart = strWord.substring(0,intCount);
          con.println(strPart);
       }
//        strPart = strWord.substring(0,5);
//        con.println(strPart);
//        strPart = strWord.substring(0,4);
//        con.println(strPart);
//        strPart = strWord.substring(0,3);
//        con.println(strPart);
//        strPart = strWord.substring(0,2);
//        con.println(strPart);
//        strPart = strWord.substring(0,1);
//        con.println(strPart);

       //Pattern 2
       //0-6
       //2-6
       //2-6
       //3-6
       //4-6
       
       for(intCount=0; intCount<intLength; intCount++){
	       strPart = strWord.substring(intCount,intLength);
	       con.println(strPart);
       }
       
       //Pattern 3
       //same pattern as 2 BUT
       //spaces are added each time..
       //what if we had a spaces variable with lots of spaces.....
       //If we were to substring the spaces to get the amount we want
       //0 - 0
       //0 - 1
       //0 - 2
       //0 - 3
       //0 - 4
       //0 - 5
       //Then we can combine pattern 2 with spaces 
       
        for(intCount=0; intCount<intLength; intCount++){
	       strPart = strWord.substring(intCount,intLength);
	       strSpacesPart = strSpaces.substring(0,intCount);
	       con.println(strSpacesPart + strPart);
        }
  }
}   
       