//	Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//	Образец в задании 4.

package by.htp.tsk04;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		arrFill(arr);
		printArr(arr);
	}
	
	public static void arrFill(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i%2 == 0) {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = j+1;
				}
			} else {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][arr[i].length - j - 1] = j+1;
				}
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
