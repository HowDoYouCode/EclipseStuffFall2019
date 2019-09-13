/* ZhanHeng Mai
 * Creating a Calculate Library this do math tasks
 * August 29 2019
 * 4th period
 * */
public class Calculate {
	//returns the square of the value passed.
		public static int square(int number) {
			return number * number;
		}
		public static double square(double number) {
			return number * number;
		}
		//returns the cube of an int
		public static int cube(int number) {
			return number * number * number;
		}
		//returns the average of two doubles
		public static double average(double num1, double num2) {
			return (num1 + num2)/2;
		}
		//overloaded method. returns average of three doubles
		public static double average(double num1, double num2, double num3) {
			return (num1 + num2 + num3)/3;
		}
		//returns degrees(double) of the inputed radians(double)
		public static double toDegrees(double radians) {
			return radians * 180 / 3.14159;
		}
		//returns radians(double) of the inputed degrees(double)
		public static double toRadians(double degrees) {
			return degrees * 3.14159 / 180;
		}
		//returns discriminant from 3 doubles a,b,c
		public static double discriminant(double a, double b, double c) {
			return b * b - 4 * a * c;
		}
		//returns improper fraction(String) when input mixed number(3 ints)
		public static String toImproperFrac(int wholeNum, int numer, int denom) {
			int fracNumer = denom * wholeNum + numer;
			return fracNumer + "/" + denom;
		}
		//returns mixed number(String) when input numerator and denominator 
		public static String toMixedNum(int numer, int base) {
			int wholeNum = numer / base;
			int newNumer = numer % base;
			return wholeNum +"_" + newNumer + "/" + base;
		}
		//converts (ax+b)(cx+d) to ax^2 + bx + c 
		public static String foil(int a, int b, int c, int d, String x) {
			int f = a * c;
			int o = a * d;
			int i = b * c;
			int l = b * d;
			int oi = o + i;
			return f + x + "^2" + " + " + oi + x + " + " + l;
		}
		//returns boolean base on if int a is divisible by int b
		public static boolean isDivisibleBy(int num1, int num2) {
			if(num2 == 0)throw new IllegalArgumentException("Imagine that you have zero cookies and you split them evenly among zero friends. How many cookies does each person get? See? It doesn't make sense. And Cookie Monster is sad that there are no cookies, and you are sad that you have no friends. (▀̿Ĺ̯▀̿ ̿)");
			if(num1 % num2 == 0) {
				return true;
			}else {
				return false;
			}
		}
		//returns absolute value(double) of inputed double 
		public static double absValue(double num) {
			if(num < 0) {
				return -num;
			}else {
				return num;
			}
		}
		//returns the larger value double of the two inputed doubles
		public static double max(double num1, double num2) {
			if(num1 > num2) {
				return num1;
			}else {
				return num2;
			}
		}
		//returns the larger value double of the three inputed doubles
		public static double max(double num1, double num2, double num3) {
			if(num1 > num2) {
				if(num1 > num3) {
					return num1;
				}else {
					return num3;
				}
			}else {
				if(num2 > num3) {
					return num2;
				}else {
					return num3;
				}
			}
		}
		//returns the smaller value int of the two inputed int
		public static int min(int num1, int num2) {
			if(num1 < num2) {
				return num1;
			}else
				return num2;
		}
		//returns a double rounded to 2 decimal places from inputed double
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
		}//returns value(double) for base^exp
		public static double exponent(double base, int exp) {
			if(exp < 0)throw new IllegalArgumentException("Error cannot compute negative exponent (╯ ͠° ͟ʖ ͡°)╯┻━┻");
			double baseHolder = base;
			if(exp == 0) {
				return 1;
			}
			for(int count = 1; exp > count; count++) {
				baseHolder *= base;	
			}
			return baseHolder;
		}//returns factorial of inputed num
		public static int factorial(int num) {
			if(num < 0)throw new IllegalArgumentException("Cannot input negative number ¯\\_(ツ)_/¯");
			if(num == 0){
				return 1;
			}
			for(int count = num-1; count >= 1; count--) {
				num *= count;
			}
			return num;
		}//returns boolean(true or false) according if it is a prime number
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
		}//returns the greatest common factor of num1 and num2
		public static int gcf(int num1, int num2) {
			while (num2 != 0) {
				int replace = num1;
				num1 = num2;
				num2 = replace % num2;
			}
			double a = (double)num1;
			absValue(a);
			num1= (int)a;
			return num1;
		}//returns square root rounded to 2 decimal places with Newton's fancy method
		public static double sqrt(double num) {
			if(num < 0)throw new IllegalArgumentException("You can't SquareRoot a negative number ಠ_ಠ");
			double value = 1; 
			while(!(absValue(num - square(value)) < 0.001)) {
				value = 0.5 * (num / value + value);
			}
			return round2(value);
		}//returns a String with the value of the output of the quadratic formula when inputed a,b,c unless no real roots
		public static String quadForm(int a, int b, int c) {
			if(discriminant(a, b, c) < 0) {
				return "no real roots";
			}
			double plusAns = (-b + sqrt(discriminant(a,b,c))) / (2 * a);
			double minusAns = (-b - sqrt(discriminant(a,b,c))) / (2 * a);
			if(plusAns == minusAns) {
				return round2(plusAns) + "";
			}
			return round2(plusAns) + " and " + round2(minusAns);
		}
}
