package by.htp.les03.main;

public class Task4 extends Task11 {

	public static void main(String[] args) {
		int[][] mas = new int[10][10];

		int k = 1;

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				k = 1;
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = k;
					k++;
				}

			} else {
				k = mas.length;
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = k;
					k--;
				}

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
