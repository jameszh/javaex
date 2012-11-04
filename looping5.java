import hsa.*;

public class looping5{
    public static void main(String[] args){
       Console con = new Console();
       int intCounter;
       double dblTotal;
       double dblSubtotal;
       double dblTax;
       double dblPrice;
       int intItems;
       
       //Creating a cashier program for walmart
       dblTotal = 0;
       dblSubtotal = 0;
       dblTax = 0;
       dblPrice = 0;
       intItems = 0;
       
       con.println("welcome to the walmart cashier checkout program");
       con.println("how many items do you want to checktout");
       intItems = con.readInt();
       
       for(intCounter = 1; intCounter <= intItems; intCounter++){
	       con.println("Give me the price for item:"+intCounter);
	       dblPrice = con.readDouble();
	       dblSubtotal = dblSubtotal + dblPrice; 
	       con.println("The current subtotal is:"+dblSubtotal); 
      
      }
      
      dblTax = dblSubtotal * 0.13;
      dblTotal = dblSubtotal + dblTax; 
      
      con.println("Your tax is:"+dblTax); 
      con.println("Your final total is:"+dblTotal); 
      
   }
}	  
       