class Pr8_Matrix {
	public static void main(String[] a) {
		int mat1[][] = {
			{ 1, 2 },
			{ 4, 5 }
		};

		int mat2[][] = {
			{ 6, 7 },
			{ 8, 9 }
		};
		int sum;

		for (int i = 0; i < mat1[0].length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				sum = 0;
				for (int k = 0; k < mat1[i].length; k++) {
					sum += mat1[i][k] * mat2[k][j];
				}
				System.out.print(sum);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}