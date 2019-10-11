/* ZhanHeng Mai
 * Creating a Calculate Library
 * August 29 2019
 * 4th period
 * */
public class DoMath {

	public static void main(String[] args) {
		System.out.println("Square: "+Calculate.square(5));
		System.out.println("Cube: "+Calculate.cube(-2));
		System.out.println("Average: "+Calculate.average(5.0, 9.0));
		System.out.println("AverageOverloaded: "+Calculate.average(15.0, 18.0, 18.0));
		System.out.println("ToDegrees: "+Calculate.toDegrees(1));
		System.out.println("ToRadians: "+Calculate.toRadians(2));
		System.out.println("Discriminant: "+Calculate.discriminant(7, 5, -2));//32
		System.out.println("ToImproperFrac: "+Calculate.toImproperFrac(8, 1, 4));//9/4
		System.out.println("ToMixedNum: "+Calculate.toMixedNum(7, 72));
		System.out.println("Foil: "+Calculate.foil(2, 2, 2, -2, "n"));
		System.out.println("IsDivisibleBy: "+Calculate.isDivisibleBy(1, 1));
		System.out.println("AbsValue: "+Calculate.absValue(-22));
		System.out.println("Max: "+Calculate.max(22, 11));
		System.out.println("MaxOverload: "+Calculate.max(23, 12, -62));
		System.out.println("Min: "+Calculate.min(22, 11));
		System.out.println("Round: "+Calculate.round2(5.051));
		System.out.println("Exponent: "+Calculate.exponent(1, 0));
		System.out.println("Factorial: "+Calculate.factorial(5));
		System.out.println("IsPrime: "+Calculate.isPrime(1));
		System.out.println("GreatestCommonFactor: "+Calculate.gcf(-52, 172));
		System.out.println("SquareRoot: "+Calculate.sqrt(0));
		System.out.println("QuadraticFormula: "+Calculate.quadForm(-2, 2, -2));
		// TODO Auto-generated method stub

	}

}
