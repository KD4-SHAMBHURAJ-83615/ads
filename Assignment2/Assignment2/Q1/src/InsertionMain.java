
//Write a insertion sort function to sort array and returns no of comparisons.
import java.util.Arrays;

public class InsertionMain {

		static int comp;
		public static void insertionSort(int arr[], int N) {
			for(int i = 1 ; i < N ; i++) {
				
				int temp = arr[i];
				comp++;
				int j = i - 1;
				while(j >= 0 && arr[j] > temp) {
				
					arr[j + 1] = arr[j];
					j--;
				}
				
				arr[j + 1] = temp;
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub


			int arr[] = {50, 40, 20, 60, 10, 30,70};
			
			System.out.println("Before sort array : " + Arrays.toString(arr));
			insertionSort(arr, arr.length);
			System.out.println("After sort array : " + Arrays.toString(arr));
			System.out.println("No. of Comparisons:"+comp);
		}

	

}
