package by.htp.les03.main;

public class Task8 {

	public static void main(String[] args) {
		int[][] mas = new int[10][10];

		int k = 1;
		int x = 0;

		for (int i = 0; i < mas.length; i++) {
			k = k + x;
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = k;
				k++;
				if (j >= mas.length - i) {
					mas[i][j] = 0;
				}

			}
			x++;
			k = 1;

		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println(" ");

		}

	}

}
