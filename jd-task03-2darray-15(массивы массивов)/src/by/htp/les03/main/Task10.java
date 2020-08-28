package by.htp.les03.main;

public class Task10 {
	int a=0;
	public static void main(String[] args) {
		int[][] mas = new int[7][7];
		creatMass(mas);
		printMass(mas);
		printPosIndex(mas);
		

	}

	public static void creatMass(int mas[][]) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 20 - 10);

			}

		}
	}

	public static void printMass(int mas[][]) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] >= 0) {
					System.out.print(" " + mas[i][j] + " ");
				} else
					System.out.print(mas[i][j] + " ");

			}
			System.out.println("");

		}
	}

	public static void printPosIndex(int mas[][]) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j && mas[i][j] > 0) {
					System.out.print(mas[i][j] + "-Положительный элемент главной диагонали");
					System.out.println();
				}

			}
		}
	}
}
