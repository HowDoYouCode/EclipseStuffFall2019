import java.util.Scanner;

public class ProcessingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("How many numbers do you want?");
		Scanner Userin = new Scanner(System.in);
		int[] num = new int[Userin.nextInt()];
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+1+": ");
			num[i] = Userin.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		int SumofEven = 0;
		int LargeEven = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				SumofEven = SumofEven + num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0 && num[i] > LargeEven) {
				LargeEven = num[i];
			}
		}
		System.out.println("Sum of all even: " + SumofEven);
		System.out.println("Largest even number: " + LargeEven);
		Userin.close();
	}
}
