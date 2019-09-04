/* ZhanHeng Mai
 * Creating a Calculate Library
 * August 29 2019
 * 4th period
 * */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.cube(-2));
		System.out.println(Calculate.average(3.0, 9.0));
		System.out.println(Calculate.average(15.0, 17.0, 18.0));
		System.out.println(Calculate.toDegrees(2));
		System.out.println(Calculate.toRadians(1));
		System.out.println(Calculate.toDegrees(Calculate.toRadians(2)));//randominversetest
		System.out.println(Calculate.discriminant(2, 4, -2));//32
		System.out.println(Calculate.toImproperFrac(2, 1, 4));//9/4
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(9, 3));
		System.out.println(Calculate.absValue(-22));
		System.out.println(Calculate.max(22, 11));
		System.out.println(Calculate.max(22, 11, -33));
		System.out.println(Calculate.min(22, 11));
		System.out.println(Calculate.round2(5.051));
		System.out.println(Calculate.exponent(5, 2));
		System.out.println(Calculate.factorial(7));
		System.out.println(Calculate.isPrime(3));
		System.out.println(Calculate.gcf(-34, 12));
		System.out.println(Calculate.sqrt(50));
		System.out.println(Calculate.quadForm(2, -7, 1));
		// TODO Auto-generated method stub

	}

}
