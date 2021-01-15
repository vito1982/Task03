//	Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

package by.htp.tsk01;

public class Main {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,0,1,2},
				{3,4,5,6},
		};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + " " + arr[i][arr.length - i - 1] + "\n");
		}
	}

}
