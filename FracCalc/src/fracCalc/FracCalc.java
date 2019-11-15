package fracCalc;
import java.util.Scanner;
import java.util.Arrays;

public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner Userin = new Scanner(System.in);
    	String input = Userin.nextLine();
    	while (!input.equals("quit")) {
    		System.out.print(produceAnswer(input));
    		input = Userin.nextLine();
    	}
    	Userin.close();
    	}
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) { 
        // TODO: Implement this function to produce the solution to the input
    	String[] operand = input.split(" ");
    	String fracone = operand[0]; // first fraction inputed
    	String operator = operand[1]; // operator +-*/
    	String fractwo = operand[2]; // the second fraction 
    	int[] whole = new int[operand.length - operand.length/2];
    	int[] numerator = new int[operand.length - operand.length/2];
    	int[] denominator = new int[operand.length - operand.length/2];
    	String[] parse = spliting(fracone);
        whole[0] = Integer.parseInt(parse[0]);
    	return "";
    }
    public static String[] spliting(String str) {
    	String[] splitted = {"0","0","1"}; // whole, numerator, denominator
    	if (str.indexOf("_") == -1 && str.indexOf("/") == -1) { // check for whole
        	splitted[0] = str; // whole
        } else if (str.indexOf("_") == -1) { // fraction only
        	String[] answer = str.split("/");
        	splitted[1] = answer[0]; // numerator
        	splitted[2] = answer[1]; // denominator
       	} else { // both whole and fraction
        	String[] answer = str.split("_");
        	splitted[0] = answer[0]; //whole
        	String[] ators = answer[1].split("/");
        	splitted[1] = ators[0]; // numerator
        	splitted[2] = ators[1]; // denominator
        }
    	return splitted;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
