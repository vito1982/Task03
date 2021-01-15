//	Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

package by.htp.tsk02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] arr = {
			{1,2,3,4,5,6},
			{1,2,3},
			{1,2,3,4,5},
			{1,2}
		};
		
		enterX(arr);
	}
	
	public static void enterX(int[][] arr) {
		int k, p;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите № строки -> ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		k = sc.nextInt();
		
		System.out.print("Введите № столбца -> ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		p = sc.nextInt();
		
		if(k < arr.length && p < arr[k].length) {
			System.out.println("Запрашиваемый элемент = " + arr[k][p]);
		}else {
			System.out.println("Запрашиваемый элемент находится вне введенного диапазона!");
		}
	}

}
