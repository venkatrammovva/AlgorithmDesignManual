package Chapter1;

public class InsertionSort {
	public int[] insertionSort(int[] input){
		int i, j, n=input.length ;
		for(i = 1; i < n; i++){
			j=i;
			while((j>0) && (input[j] < input[j-1])){
				int temp = input[j];
				input[j] = input[j-1];
				input[j-1] = temp;
				j--;
			}
		}
		return input;
	}
}
