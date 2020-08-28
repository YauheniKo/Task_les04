package by.htp.les03.main;

public class Task6 {

	public static void main(String[] args) {
		int[][] mas = new int[10][10];

		int k = 1;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == 0 || i == 0) {
					mas[i][j] = k;
				} else if (j == mas.length - 1 || i == mas.length - 1) {
					mas[i][j] = k;
				}

				else
					mas[i][j] = 0;

			}

		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println(" ");

		}

	}

}
