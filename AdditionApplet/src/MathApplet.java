/* Jaime Maldonado 
 *Program creates applet and 
 *prompts user with two numbers. 
 *Returns sum, difference, product and quotient.
 * */

import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.*; 


public class MathApplet extends JApplet {
	
	//Variables for math results.
	 private double sum; 
	 private double product;
	 private double difference;
	 private double quotient;
	 
	 
	 
	 public void init() //Initializing applet.
	 {
		 String firstNumber = JOptionPane.showInputDialog("Enter first floating-point value" ); //Prompts user and places input into variable
		 double number1 = Double.parseDouble( firstNumber ); //Converts string into double
		 
		 String secondNumber = JOptionPane.showInputDialog("Enter second floating-point value" ); //Prompts user and places input into variable
		 double number2 = Double.parseDouble( secondNumber ); //Converts string into double
		 
		 sum = number1 + number2;   
		 difference = number1 - number2;
		 quotient = number1 / number2;
		 product = number1 * number2;
	 }
	 
	 // Drawing results on screen in the form of rectangle.
	 public void paint(Graphics draw) 
	 {
		 super.paint(draw); // Calling superclass paint method. 

		 draw.setColor(Color.BLUE); //Sets background color to blue.
		 draw.fillRect(0, 0, 500, 100);
		 draw.setColor(Color.WHITE); //Sets text to white.
		 draw.drawString( "The sum is " + sum, 20, 20 ); //Displays sum.
		 draw.drawString( "The difference is " + difference, 20, 40 ); //Displays difference.
		 draw.drawString( "The product is " + product, 20, 60 ); //Displays product.
		 draw.drawString( "The quotient is " + quotient, 20, 80 ); //Displays quotient.
	 } 
} 