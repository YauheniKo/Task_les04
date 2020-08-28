package by.htp.les03.main;

public class Task12 {

	public static void main(String[] args)  {
		int[][] mas = new int[10][11];

		int i = 0;
		int j = 0;
		int k = 0;
		

		for (j = 0; j < mas[0].length; j++) {

			
			for (i = 0; i < mas.length; i++) {

				if (j <= k) {
					mas[i][j] = 0;
				} else
					mas[i][j] = 1;
				k++;
			}

			k = 0;

		}
		for (i = 0; i < mas.length; i++) {

			for ( j = 0; j < mas[0].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println("");
		}
		

	}

	
}
