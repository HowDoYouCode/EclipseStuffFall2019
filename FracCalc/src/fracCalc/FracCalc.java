package fracCalc;
import java.util.Scanner;

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
    	int[] mixfrac = new int[operand.length - operand.length/2];
    	String[] parse = spliting(fracone);
    	for (int i = 0; i < operand.length - operand.length/2; i++) {
    		whole[i] = Integer.parseInt(parse[0]);
    		numerator[i] = Integer.parseInt(parse[1]);
    		denominator[i] = Integer.parseInt(parse[2]);
    		mixfrac[i] = toImproperFraction(whole[i], numerator[i], denominator[i]);
    		parse = spliting(fractwo);
    	}
    	int commondenominator = denominator[0] * denominator[1];
    	int temp;
    	int temp2;
    	if (denominator[0] == 1) {
    		temp = mixfrac[0];
    	} else { 
    		temp = denominator[1] * mixfrac[0];
    	} if (denominator[1] == 1) {
    		temp2 = mixfrac[1];
    	} else {
    		temp2 = denominator[0] * mixfrac[1];
    	}
    	if (operator.equals("+")) {
    		if (numerator[0] == 0 && numerator[1] == 0) {
    			return (whole[0] + whole[1] + "");
    		} if (denominator[1] == 1) {
    			return reduceAnswer(temp + (temp2*denominator[0]), commondenominator);
    		} else if (denominator[0] == 1) {
    			return reduceAnswer((temp * denominator[1]) + temp2, commondenominator);
    		}
    		return reduceAnswer(temp + temp2, commondenominator);
    	} else if (operator.equals("-")) {
    		if (denominator[1] == 1) {
    			return reduceAnswer(temp - (temp2 - denominator[0]), commondenominator);
    		} else if (denominator[0] == 1) {
    			return reduceAnswer((temp * denominator[1]) - temp2, commondenominator);
    		}
    		return reduceAnswer(temp - temp2, commondenominator);
    	} else if (operator.equals("*")) {
    		if(temp == 0 || temp2 == 0) {
    			return "0";
    		} if(denominator[0] == 1 || denominator[1] == 1) {
    			return reduceAnswer(temp * temp2, commondenominator);
    		}
    		return reduceAnswer(temp * temp2 / commondenominator, commondenominator);
    	} else {
    		if(denominator[0] == 1 && denominator[1] == 1) {
    			return reduceAnswer(temp, temp2);
    		} if(denominator[0] == 1 || denominator[1] == 1) {
    			return reduceAnswer(temp * denominator[1], denominator[0]);
    		}
    		return reduceAnswer(temp, temp2); 
    	}
    }
    public static String[] spliting(String str) {
    	String[] splitted = {"0","0","1"}; // whole, numerator, denominator
    	if (str.indexOf("_") == -1 && str.indexOf("/") == -1) { // check for whole
        	splitted[0] = str; // whole
        	splitted[1] = "0"; // numerator
        	splitted[2] = "1"; //denominator
        } else if (str.indexOf("_") == -1) { // fraction only
        	String[] answer = str.split("/");
        	splitted[0] = "0"; // whole
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
    public static int toImproperFraction(int wholenum, int numeratornum, int denominatornum) {
    	int fraction;
    	if (wholenum < 0) {
    		fraction = denominatornum * wholenum - numeratornum;
    	} else { 
    		fraction = denominatornum * wholenum + numeratornum;
    	}
    	System.out.println(fraction);
    	return fraction;
    }
    public static String reduceAnswer(int numerator, int commondenominator) {
    	int temp = numerator;
    	int temp2 = commondenominator;
    	int temp3 = gcf(temp, commondenominator);
    	temp = temp/temp3;
    	temp2 = temp2/temp3;
    	return toMixedNum(temp, temp2);
    }
    public static String toMixedNum(int numer, int base) {
		int wholeNum = numer / base;
		int newNumer = numer % base;
		return wholeNum +"_" + newNumer + "/" + base;
	}
    public static int gcf(int number1, int number2) {
		while (number2 != 0) {
			int replace = number1;
			number1 = number2;
			number2 = replace % number2;
		}
		double a = (double)number1;
		absValue(a);
		number1= (int)a;
		return number1;
	}
    public static double absValue(double number) {
		if(number < 0) {
			return -number;
		}else {
			return number;
		}
	}

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
