import java.io.*;
import java.util.*;

public class Calculator {

	public static String operation(String operand1, String operator, String operand2) {
	    int result = 0;
		int number1 = Integer.parseInt(operand1);
		
		int number2= Integer.parseInt(operand2);
	
	    switch(operator) {
	        case "+" :
	            result = number1 + number2;
	        break;
	        case "-" :
	            result = number1 - number2;
	        break;
	        case "x" :
	            result = number1 * number2;
	        break;
	        case "/" :
	            result = number1 / number2;
	        break;
	    }
	    System.out.println("Result: " + result);
	    String computedValue= String.valueOf(result);
	    return computedValue;
		}
		 public static void main(String[] args) {
			 try {
		        if(args.length == 3) {
		        	Calculator.operation(args[0], args[1], args[2]);
		        }
		        else if(args.length!=3) {
		            System.out.println("You must have 3 arguments");
		        }
		        
		 } catch(Exception e) {
			 e.printStackTrace();
		 }
		 }
	 
}
	 