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
    	String denominator = "1";
    	String numerator = "0";
    	String whole = "0";
        String[] operand = input.split(" ");
        String[] Answerss = operand[2].split("/");
        denominator = Answerss[1];
        for (int i = 0; i<Answerss[0].length();i++) {
        	if (Answerss[0].charAt(i)=='_') {
        		String[] Answers = Answerss[0].split("_");
        		whole = Answers[0];
        		numerator = Answers[1];
        	} else {
        		whole = "0";
        		numerator = Answerss[0];
        	}
        }
    	return (whole+numerator+denominator);  
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
