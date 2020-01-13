package OldfracCalc;
import java.util.*;

public class OldFracCalc {

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
    	int[] fraction1= toImproperFraction(spliting(fracone));
    	int[] fraction2 = toImproperFraction(spliting(fractwo));
    	
    	int commondenominator = fraction1[2] * fraction2[2];
    	if (operator.equals("+")) {
    		if (fraction1[1] == 0 && fraction2[1] == 0) {
    			return (fraction1[0] + fraction2[0] + "");
    		} if (fraction2[2] == 1) {
    			return reduceAnswer(fraction1[1] += fraction2[1] * fraction1[2], commondenominator);
    		} else if (fraction1[2] == 1) {
    			return reduceAnswer(fraction2[1] += (fraction1[1] * fraction2[2]), commondenominator);
    		}
    		return reduceAnswer((fraction1[1] * fraction2[2]) + (fraction2[1] * fraction1[2]), commondenominator);
    	} else if (operator.equals("-")) {
    		if (fraction1[2] == 1) {
    			return reduceAnswer(fraction1[1] - (fraction2[1] * fraction1[2]), commondenominator);
    		} else if (fraction2[2] == 1) {
    			return reduceAnswer((fraction2[1] * fraction1[2]) - fraction1[1], commondenominator);
    		}
    		return reduceAnswer((fraction1[1] * fraction2[2]) - (fraction2[1] * fraction1[2]), commondenominator);
    	} else if (operator.equals("*")) {
    		if (fraction1[1] == 0 || fraction2[1] == 0) {
    			return "0";
    		} if (fraction1[2] == 1 || fraction2[2] == 1) {
    			return reduceAnswer(fraction1[1] * fraction2[1], commondenominator);
    		} 
    		return reduceAnswer(fraction1[1] * fraction2[1], commondenominator);
    	} else {
    		if (fraction1[2] == 1 && fraction2[2] == 1) {
    			return reduceAnswer(fraction1[1], fraction2[1]);
    		} else if (fraction1[2] == 1 || fraction2[2] == 1) {
    			return reduceAnswer(fraction1[1] * fraction2[2], fraction1[2] * fraction2[1]);
    		}
    		return reduceAnswer(fraction1[1] * fraction2[2], fraction1[2] * fraction2[1]);
    	}
    }
    public static int[] spliting(String str) {
    	int[] splitted = {0,0,1}; // whole, numerator, denominator
    	if (str.indexOf("_") == -1 && str.indexOf("/") == -1) { // check for whole
        	splitted[0] = Integer.parseInt(str); // whole
      
        } else if (str.indexOf("_") == -1) { // fraction only
        	String[] answer = str.split("/");
        	
        	splitted[1] = Integer.parseInt(answer[0]); // numerator
        	splitted[2] =Integer.parseInt( answer[1]); // denominator
       	} else { // both whole and fraction
        	String[] answer = str.split("_");
        	splitted[0] = Integer.parseInt(answer[0]); //whole
        	String[] ators = answer[1].split("/");
        	splitted[1] = Integer.parseInt(ators[0]); // numerator
        	splitted[2] = Integer.parseInt(ators[1]); // denominator
        }
    	return splitted;
    }
    public static int[] toImproperFraction(int[] fraction) {	
    	if (fraction[0] < 0) {
    		fraction[1] = fraction[2] * fraction[0] - fraction[1];
    		
    	} else { 
    		fraction[1] = fraction[2] * fraction[0] + fraction[1];
    	}
    	fraction[0]=0;
    	return fraction;
    }
    public static String reduceAnswer(int numerator, int commondenominator) {
    	int tempnumerator = numerator;
    	int tempdenominator = commondenominator;
    	int temp = gcf(tempnumerator, commondenominator);
    	tempnumerator = tempnumerator/temp;
    	tempdenominator = tempdenominator/temp;
    	return toMixedNum(tempnumerator, tempdenominator);
    }
    public static String toMixedNum(int numer, int base) {
		int whole = numer / base;
		int newNumerator = numer % base;
		if (absValue(newNumerator) == 0 && absValue(base) == 1) {
			return whole+"";
		} else if (whole == 0) {
			return newNumerator + "/" + absValue(base);
		}
		return whole +"_" + absValue(newNumerator) + "/" + absValue(base);
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
    public static int absValue(int number) {
		if(number < 0) {
			return -number;
		}else {
			return number;
		}
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
