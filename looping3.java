import hsa.*;

public class looping3{
    public static void main(String[] args){
       Console con = new Console();
       
       String strPassword;
       int intAttempts; 
       
       intAttempts = 0;
       strPassword = "";
       
       con.println("Welcome to the FiftyCent Computer System");
       con.println("suthorization is required");
       
       while(!strPassword.equals("twoquarters") && intAttempts < 3){
	        // ! means NOT. in this case. The password should not equal "twoquarters") 
	        //if you want to use not when comparing numbers, use !=
	        con.println("What is the password");
	        strPassword = con.readLine();
	        intAttempts = intAttempts + 1; 
       
      }
      
      if(strPassword.equals("twoquarters")){
	      con.println("welcome to the system... have some beats headphones");
      }else{
	      con.println("ERROR.. TOO MANY INCORRECT TRIES!");
      }    
   }
}	  
       