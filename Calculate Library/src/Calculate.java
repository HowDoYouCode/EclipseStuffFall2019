/* ZhanHeng Mai
 * Creating a Calculate Library this do math tasks
 * August 29 2019
 * 4th period
 * */
public class Calculate {
		public static double square(double number) {
			return number * number;
		}
		//returns the cube of an int.
		public static int cube(int number) {
			return number * number * number;
		}
		//returns the average of two doubles.
		public static double average(double number1, double number2) {
			return (number1 + number2)/2; 
		}
		//overloaded method. returns average of three doubles.
		public static double average(double number1, double number2, double number3) {
			return (number1 + number2 + number3)/3;
		}
		//returns double degrees of the inputed double radians.
		public static double toDegrees(double radians) {
			return radians * 180 / 3.14159;
		}
		//returns double radians of the inputed double degrees.
		public static double toRadians(double degrees) {
			return degrees * 3.14159 / 180;
		}
		//returns discriminant from 3 doubles a,b,c.
		public static double discriminant(double a, double b, double c) {
			return b * b - 4 * a * c;
		}
		//returns improper fraction(String) when input mixed number 3 ints.
		public static String toImproperFrac(int wholeNum, int numer, int denom) {
			int fracNumer = denom * wholeNum + numer;
			return fracNumer + "/" + denom;
		}
		//returns mixed number(String) when input numerator and denominator. 
		public static String toMixedNum(int numer, int base) {
			int wholeNum = numer / base;
			int newNumer = numer % base;
			return wholeNum +"_" + newNumer + "/" + base;
		}
		//converts (ax+b)(cx+d) to ax^2 + bx + c.
		public static String foil(int a, int b, int c, int d, String x) {
			int f = a * c;
			int o = a * d;
			int i = b * c;
			int l = b * d;
			int oi = o + i;
			return f + x + "^2" + " + " + oi + x + " + " + l;
		}
		//returns boolean base on if int a is divisible by int b.
		public static boolean isDivisibleBy(int number1, int number2) {
			if(number2 == 0)throw new IllegalArgumentException("Imagine that you have zero cookies and you split them evenly among zero friends. How many cookies does each person get? See? It doesn't make sense. And Cookie Monster is sad that there are no cookies, and you are sad that you have no friends. (▀̿Ĺ̯▀̿ ̿)");
			if(number1 % number2 == 0) {
				return true;
			}else {
				return false;
			}
		}
		//returns absolute value of a double of inputed double.
		public static double absValue(double number) {
			if(number < 0) {
				return -number;
			}else {
				return number;
			}
		}
		//returns the larger value double of the two inputed doubles.
		public static double max(double number1, double number2) {
			if(number1 > number2) {
				return number1;
			}else {
				return number2;
			}
		}
		//returns the larger value double of the three inputed doubles.
		public static double max(double number1, double number2, double number3) {
			if(number1 > number2) {
				if(number1 > number3) {
					return number1;
				}else {
					return number3;
				}
			}else {
				if(number2 > number3) {
					return number2;
				}else {
					return number3;
				}
			}
		}
		//returns the smaller value int of the two inputed int numbers.
		public static int min(int number1, int number2) {
			if(number1 < number2) {
				return number1;
			}else
				return number2;
		}
		//returns a double rounded to 2 decimal places from inputed double.
		public static double round2(double dec) {
			if(dec > 0) {
				dec += 0.005;
			}else if(dec == 0) {
				dec = 0;
			}else {
				dec -= 0.005;
			}
			dec *= 100;
			double b = (int)dec;
			b /= 100;
			return b;
		}//returns value of a double for base^exp
		public static double exponent(double base, int exp) {
			if(exp < 0)throw new IllegalArgumentException("Error cannot compute negative exponent (╯ ͠° ͟ʖ ͡°)╯┻━┻");
			if(exp == 0 & base == 0)throw new IllegalArgumentException("undefined");
			double baseHolder = base;
			if(exp == 0) {
				return 1;
			}
			for(int count = 1; exp > count; count++) {
				baseHolder *= base;	
			}
			return baseHolder;
		}//returns factorial of inputed int number.
		public static int factorial(int number) {
			if(number < 0)throw new IllegalArgumentException("Cannot input negative number ¯\\_(ツ)_/¯");
			if(number == 0){
				return 1;
			}
			for(int count = number-1; count >= 1; count--) {
				number *= count;
			}
			return number;
		}//returns boolean according if it is a prime number.
		public static boolean isPrime(int a) {
			int b = 2;
			while(b < a) {
				b++;
				if(a == 4) {
					return false;
				}
				if(a%b==0 && b!=a) {
					return false;
				}
			}
			return true;
		}//returns the greatest common factor of number1 and number2.
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
		}//returns square root rounded to 2 decimal places with Newton's fancy method.
		public static double sqrt(double number) {
			if(number < 0)throw new IllegalArgumentException("You can't SquareRoot a negative number ಠ_ಠ");
			double value = 1; 
			while(!(absValue(number - square(value)) < 0.0000001)) {
				value = 0.5 * (number / value + value);
			}
			return round2(value);
		}//returns a String with the value of the output of the quadratic formula when inputed a,b,c unless it has no real roots.
		public static String quadForm(int a, int b, int c) {
			if(discriminant(a, b, c) < 0) {
				return "no real roots";
			}
			double max = (-b + sqrt(discriminant(a,b,c))) / (2 * a);
			double min = (-b - sqrt(discriminant(a,b,c))) / (2 * a);
			if(max == min) {
				return round2(max) + "";
			}
			return round2(min) + " and " + round2(max);
		}
}
