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
    	String[] numbers = {"0","0","1","0","0","1"};
        String[] operand = input.split(" ");
        if (operand[2].indexOf("_") == -1 && operand[2].indexOf("/") == -1) {
        	numbers[3] = operand[2];
        } else if (operand[2].indexOf("_") == -1) {
        	String[] answer = operand[2].split("/");
        	numbers[4] = answer[0];
        	numbers[5] = answer[1];
        } else {
        	String[] answer = operand[2].split("_");
        	numbers[3] = answer[0];
        	String[] ators = answer[1].split("/");
        	numbers[4] = ators[0];
        	numbers[5] = ators[1];
        }
    	return ("whole:"+numbers[3]+" numerator:"+numbers[4]+" denominator:"+numbers[5]);  
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
