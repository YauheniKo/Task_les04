package by.htp.les03.main;

public class Task5 {

	public static void main(String[] args) {
		int[][] mas = new int[8][8];

		int k = 1;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == mas[i].length - k) {
					mas[i][j] = k;
				} else {
					mas[i][j] = 0;
				}

			}
			k++;

		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println(" ");

		}

	}

}
