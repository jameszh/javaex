import hsa.*;
import java.awt.Color;

public class looping8{
    public static void main(String[] args){
       Console con = new Console();
       //Animate a ball that goes from the left to right of the screen
       
       //variables
       //the x coordinate of the upper left corner of the ball. 
       int intX; 
       
       //initialize
       intX = 0; 
       
       //Basic theory behind animation
       //1 Draw something on the screen
       //2 Pause
       //3 Clear the screen or the somehting 
       //4 Draw the same something but slightly different 
       //5 Pause
       //6 Clear
       //7 Draw the same something but slightly different
       //8 Pause
       //9 Clear 
       //10 Repeat steps 7-9 as needed  
       
       
       con.setColor(Color.RED);          //1a
       
       con.fillOval(intX,300, 25, 25);   //1b
       pause(100);                       //2
       //con.clear();
       con.setColor(Color.WHITE);        //3a
       con.fillOval(intX, 300, 25, 25);  //3b
       
       while(intX > 600){
	       intX = intX + 50;
       con.setColor(Color.RED);
       con.fillOval(intX, 300, 25, 25);
       pause(100);
       con.setColor(Color.WHITE);
       con.fillOval(intX, 300,25,25);
       
       }
       con.println("Ballzzzzz!!!!!");
       
       
       
       intX = intX + 50;
       con.setColor(Color.RED);
       con.fillOval(intX, 300, 25, 25);
       pause(100);
       con.setColor(Color.WHITE);
       con.fillOval(intX, 300,25,25);
       
       intX = intX + 50;
       con.setColor(Color.RED);
       con.fillOval(intX, 300, 25, 25);
       pause(100);
       con.setColor(Color.WHITE);
       con.fillOval(intX, 300,25,25);
       
       intX = intX + 50;
       con.setColor(Color.RED);
       con.fillOval(intX, 300, 25, 25);
       pause(100);
       con.setColor(Color.WHITE);
       con.fillOval(intX, 300,25,25);
       
      
   } 
   public static void pause(int intMS){
	   try{
		   Thread.sleep(intMS);
       }catch(InterruptedException e){	 
       }       
	   
  }	   
}   