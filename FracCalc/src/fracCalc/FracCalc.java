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
    	String[] whole = {"0","0","0","0"};
    	String[] numerator = {"0","0","0","0"};
    	String[] denominator = {"1","1","1","1"};
    	int[] intwhole = {0,0,0,0,0};
    	int[] intnumerator = {0,0,0,0,0};
    	int[] intdenominator = {1,1,1,1,1};
        String[] operand = input.split(" ");
        int k = 0;
        for (int i = 0;i < operand.length; i+=2) {
        	if (operand[i].indexOf("_") == -1 && operand[i].indexOf("/") == -1) {
        		whole[k] = operand[i];
        	} else if (operand[i].indexOf("_") == -1) {
        		String[] answer = operand[i].split("/");
        		numerator[k] = answer[0];
        		denominator[k] = answer[1];
        	} else {
        		String[] answer = operand[i].split("_");
        		whole[k] = answer[0];
        		String[] ators = answer[1].split("/");
        		numerator[k] = ators[0];
        		denominator[k] = ators[1];
        	}
        	intwhole[k] = Integer.parseInt(whole[k]);
        	intnumerator[k] = Integer.parseInt(numerator[k]);
        	intdenominator[k] = Integer.parseInt(denominator[k]);
            System.out.println("whole: "+intwhole[k]);
            System.out.println("numerator: "+intnumerator[k]);
            System.out.println("denominator: "+intdenominator[k]);
            if (operand[i-k].equals("+")) {
            	
            }
        	k = k++;
        }
        return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
