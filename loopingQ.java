//8-fibonacci-1,1,2,3,5,8..Two previous numbers add up to the current number
//9
//11
//13
//15
import hsa.*;

public class loopingQ{
    public static void main(String[] args){
       Console con = new Console();
       
       int intNum=0;
       int intPre;
       int intPrePre;
       int intPos;
       int intCount;
       
       intPre=1;
       intPrePre=1;
       
       con.println("Enter the position on the Fibonnacci sequence you want to find");
       intPos = con.readInt();
       
       if(intPos == 1 || intPos == 2){
	       con.println("The value is 1");
       }else{
	       for(intCount = 3; intCount<=intPos; intCount++){
		       intNum = intPre + intPrePre;
		       intPrePre = intPre;
		       intPre = intNum;
		               
       }
       con.println("The value is: "+intNum);
     }
   }
}