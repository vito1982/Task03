//	ћатрицу 10x20 заполнить случайными числами от 0 до 15. ¬ывести на экран саму матрицу и номера строк, в
//	которых число 5 встречаетс€ три и более раз.

package by.htp.tsk11;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[10][20];
		
		arrFill(arr);
		arrPrint(arr);
		arrFive(arr);
	}
	
	public static void arrFill(int[][] arr) {
		Random rand = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(15);
			}
		}
	}
	
	public static void arrFive(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			int x = 0;
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 5) x++;
			}
			if(x >= 3) {
				System.out.println("„исло п€ть встречаетс€ три и более раз в строке: " + i);
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
		System.out.println();
	}
}
