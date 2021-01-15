//	Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//	Образец в задании 5.

package by.htp.tsk05;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		arrFill(arr);
		printArr(arr);
	}
	
	public static void arrFill(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i][arr[i].length-i-1] = i+1;
		}
	}
	
	public static void printArr(int[][] arr) {
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
