package by.htp.les03.main;

public class Task1 {
	public static void main(String[] args) {
		int[][] mas = new int[10][10];

		int i = 0;
		int j = 0;
		int k = 0;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				mas[i][j] = k;
				k++;
			}

		}

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.print(mas[i][j]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
