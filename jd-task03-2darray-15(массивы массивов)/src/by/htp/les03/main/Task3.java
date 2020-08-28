package by.htp.les03.main;

public class Task3 {

	public static void main(String[] args) {
		int[][] mas = new int[4][5];

		int k = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = k;
				k++;
			}

		}

		for (int i = 0; i < mas.length; i++) {

			if (i % 2 == 0) {

				for (int j = mas[i].length - 1; j >= 0; j = j - 1) {
					System.out.print(mas[i][j] + " ");
				}
			} else {

				for (int j = 0; j < mas[i].length; j++) {
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println(" ");

		}

	}
}
