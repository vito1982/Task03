//	Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//	единиц равно номеру столбца.

package by.htp.tsk12;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(10)+5;
		int[][] arr = new int[n][n];

		arrFill(arr);
		arrPrint(arr);
	}
	
	public static void arrFill(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr[i].length; j++) {
				arr[i][j] = 1;
			}
		}
	}

	public static void arrPrint(int[][] arr) {
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
