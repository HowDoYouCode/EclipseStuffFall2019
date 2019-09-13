/* ZhanHeng Mai
 * Creating a Calculate Library
 * August 29 2019
 * 4th period
 * */
public class DoMath {

	public static void main(String[] args) {
		System.out.println("Square: "+Calculate.square(-3));
		System.out.println("Cube: "+Calculate.cube(-2));
		System.out.println("Average: "+Calculate.average(3.0, 9.0));
		System.out.println("AverageOverloaded: "+Calculate.average(15.0, 17.0, 18.0));
		System.out.println("ToDegrees: "+Calculate.toDegrees(2));
		System.out.println("ToRadians: "+Calculate.toRadians(1));
		System.out.println("Discriminant: "+Calculate.discriminant(2, 4, -2));//32
		System.out.println("ToImproperFrac: "+Calculate.toImproperFrac(2, 1, 4));//9/4
		System.out.println("ToMixedNum: "+Calculate.toMixedNum(7, 2));
		System.out.println("Foil: "+Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println("IsDivisibleBy: "+Calculate.isDivisibleBy(1, 2));
		System.out.println("AbsValue: "+Calculate.absValue(-22));
		System.out.println("Max: "+Calculate.max(22, 11));
		System.out.println("MaxOverload: "+Calculate.max(23, 12, -63));
		System.out.println("Min: "+Calculate.min(22, 11));
		System.out.println("Round: "+Calculate.round2(5.051));
		System.out.println("Exponent: "+Calculate.exponent(5, 2));
		System.out.println("Factorial: "+Calculate.factorial(7));
		System.out.println("IsPrime: "+Calculate.isPrime(3));
		System.out.println("GreatestCommonFactor: "+Calculate.gcf(-34, 12));
		System.out.println("SquareRoot: "+Calculate.sqrt(50));
		System.out.println("QuadraticFormula: "+Calculate.quadForm(2, -7, 1));
		// TODO Auto-generated method stub

	}

}
