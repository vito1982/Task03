//	Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
//	строка слева направо, третья строка справа налево и так далее.

package by.htp.tsk03;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] arr;
		arr = arrFill();
		printFull(arr);
		printRL(arr);
	}
	
	public static int[][] arrFill() {
		Random rand = new Random();
		int m, n;
		m = rand.nextInt(9);
		n = rand.nextInt(9);
		
		int[][] arr = new int[m+1][n+1];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(100);
			}
		}
		
		return arr;
	}
	
	public static void printFull(int[][] arr) {
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void printRL(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i%2 == 0) {
				for(int j = arr[i].length; j > 0; j--) {
					System.out.print(arr[i][j-1] + " ");
				}
			}else {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
