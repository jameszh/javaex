import hsa.*;

public class looping1{
    public static void main(String[] args){
       Console con = new Console();
       
       String strName;
       
       con.println("What is your name?");
       strName = con.readLine();
       
       
       while(strName.equals("cadawas")){
	       con.println("The best name in the world is");
	       con.println(strName); 
	       
	       
	       
     }
   }
}	       