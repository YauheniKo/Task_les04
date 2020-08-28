package by.htp.les03.main;

public class Task9 {

	public static void main(String[] args) {
		int[] mas = { 2, 3, 4, 5, 6 };

		long[][] arr = new long[mas.length][mas.length];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = (long) Math.pow(mas[j], i + 1);

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");

		}

	}

}
