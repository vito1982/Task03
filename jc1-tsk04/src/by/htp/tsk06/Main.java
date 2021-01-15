//	Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//	Образец в задании 6.

package by.htp.tsk06;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		arrFill(arr);
		printArr(arr);
	}
	
	public static void arrFill(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == 0 || i == arr.length-1) {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = 1;
				}
			} else {
				arr[i][0] = 1;
				arr[i][arr[i].length - 1] = 1;
			}
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
