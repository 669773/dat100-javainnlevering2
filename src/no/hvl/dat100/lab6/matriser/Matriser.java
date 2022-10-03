package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		int rows = 5, kolonne = 5;
		int[][] matrisen = new int[rows][kolonne];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < kolonne; j++) {
				matrisen[i][j] = i + j;
				System.out.printf(matrisen[i][j] + " ");
			}
			System.out.println();
		}
		// throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String ut = "";
		String mellomrom = "";

		int [][] matrisTxt = matrise;

		for (int i = 0; i < matrisTxt.length; i++) {
			for (int j = 0; j < matrisTxt.length; j++) {

				mellomrom = Integer.toString(matrisTxt[i][j]);

				ut = ut + mellomrom + " ";
			}
			ut = ut + "\n";
		}
		return ut;

		//throw new UnsupportedOperationException("tilStreng ikke implementert");	
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] matriseTo;
		matriseTo = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			matriseTo = new int[matrise.length][matrise[i].length];
		}

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matriseTo[i][j] = matrise[i][j] * tall;
			}
		}
		return matriseTo;

		//throw new UnsupportedOperationException("skaler ikke implementert");

	}

	// d)
	public static void main(String[] args) {

		int mat1[][] = { {7, 9, 2}, {3, 8, 6}, {1, 4, 2} };
		int mat2[][] = { {7, 9, 2}, {3, 8, 6}, {1, 4, 2} };
		boolean lik = true;
		int n = 3;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (mat1[i][j] != mat2[i][j])
					lik = false;
		if (lik == true) {
			lik = true;
			System.out.print(lik);
		}
		else {
			System.out.print(lik);
		} 
	}

}
