package by.htp.les03.main;

public class Test {
	int a=10;
	int b=20;

	public static void printVar(int a, int b) {
		System.out.println(a + " =a");
		System.out.println(b + " =b");
	}

	public static int varA(int a) {
		
		return a * 2;
	}

	public static int varB(int b) {

		return (b * 3);
	}

	public static int varSum(int a, int b) {
		int sum=a+b;
		return sum;
	}

	public static int varMax(int a, int b) {
		int max=Math.max(a, b);
		return max;
	}

	public static void main(String[] args) {

	}

}
