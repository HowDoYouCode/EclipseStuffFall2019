import java.util.Scanner;

public class QuadraticClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
		System.out.println("This is Quadratic Describer");
		System.out.println("Insert Values for coefficients a,b,c");
		Scanner Userin = new Scanner(System.in);
		System.out.print("a: ");
		double a = Userin.nextDouble();
		System.out.print("b: ");
		double b = Userin.nextDouble();
		System.out.print("c: " );
		double c = Userin.nextDouble();
		Quadratic.quadrDescriber(a,b,c);
		System.out.println("\nKeep going? (\"q\" or \"quit\" to stop Quadratic Describer)");
		if (Userin.nextLine().equals("quit") || Userin.nextLine().equals("q")) {
			break;
			}
		Userin.close();
		}
	}

}
