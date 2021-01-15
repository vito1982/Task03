//	Найти положительные элементы главной диагонали квадратной матрицы.

package by.htp.tsk10;

public class Main {

	public static void main(String[] args) {
		int[][] arr = {
				{-5, 2, 7,-3, 6},
				{ 1, 1,-4, 9,-4},
				{ 2,-3, 8, 1,-4},
				{ 6, 2, 1,-7, 7},
				{ 4,-1, 6, 3, 1},
		};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i][i] > 0) System.out.print(arr[i][i] + " ");
		}
	}

}
