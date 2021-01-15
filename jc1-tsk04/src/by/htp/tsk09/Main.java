//	Дан линейный массив x1, x2, .... x(n-1), x(n) Получить действительную квадратную матрицу порядка n:
//	Образец матрицы в задании 9.

package by.htp.tsk09;

public class Main {

	public static void main(String[] args) {
		int[] mas = {5,8,4,6,7,3};
		int[][] arr = new int[mas.length][mas.length];
		
		arrFill(arr, mas);
		arrPrint(arr);
	}
	
	public static void arrFill(int[][] arr, int[] mas) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) Math.pow(mas[j], (i+1));
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
