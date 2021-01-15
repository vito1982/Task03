//	Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//	Образец матрицы в задании 8.

package by.htp.tsk08;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		arrFill(arr);
		arrPrint(arr);
	}
	
	public static void arrFill(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length-i; j++) {
				arr[i][j] = i+j+1;
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
