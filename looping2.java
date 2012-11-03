import hsa.*;

public class looping2{
    public static void main(String[] args){
       Console con = new Console();
       
       String strName;
       
       con.println("What is your name?");
       strName = con.readLine();
       
       while(strName.equals("cadawas")){
	       con.println("The best name is");
	       con.println(strName);
	       
	       con.println("give me another name"); 
	       strName = con.readLine(); 
	          
   }
   
       con.println("you have entered a bad name...program over!"); 
  }
}    	       