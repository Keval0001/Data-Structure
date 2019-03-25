package array;
//https://www.geeksforgeeks.org/array-rotation/
public class Question1_Rotation {
	public static void main(String arg[]) {
		Question1_Rotation q = new Question1_Rotation();
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		q.rotation(arr, 3, arr.length);

	}

	public void rotation(int a[], int d, int n) {
		int temp = 0;
		for (int x = 0; x < d; x++) {
			temp = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[n - 1] = temp;
		
		}

		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z]);

		}
	}
}
