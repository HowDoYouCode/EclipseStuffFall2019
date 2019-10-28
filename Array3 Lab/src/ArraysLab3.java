import java.util.Arrays;
import java.util.Scanner;

public class ArraysLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner User = new Scanner(System.in);
		int list = User.nextInt();
		int[] A1 = new int[list];
		int[] A2 = new int[list];
		for (int i=0;i<list;i++) {
			A1[i] = User.nextInt();
		}
		for (int i=0;i<list;i++) {
			A2[i] = User.nextInt();
		}
		sum(A1, A2);
		int n = User.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<arr.length;i++) {
			System.out.println(i+" : ");
			arr[i] = User.nextInt();
		}
		int num = 0;
		append(arr,num);
		User.close();
		
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length];
		for (int i=0; i<arr1.length;i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		System.out.println(Arrays.toString(arr3));
		return arr3;
	}
	public static int[] append(int[] arr, int num) {
		for (int i =0;i<arr.length;i++) {
			arr[i] = arr[i] + (arr.length+1);
		}
		return arr;
	}
	public static int[] remove(int[] arr, int idx) {
		return arr;
	}
	public static int sumEven(int[] arr) {
		return 0;
	}
	public static void rotateRight(int[] arr) {
		
	}
} 