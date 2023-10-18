
public class SortingArray {

	//tip: right click on variable -> refactor -> rename to change variable names in an instance
	public static void main(String[] args) {
		int[] array = {4,2,1,3,5};
		
		
		for (int i=0; i<array.length; i++) {
			
			//Assume the first index was correct, find min after it
			int min_index = i;
			
			for(int j = i + 1; j < array.length; j++) {
				
				if (array[j] < array[min_index]) {
					min_index = j;
				}
			}
			
			if (min_index != i) {
				int temp = array[i];
				array[i] = array[min_index];
				array[min_index] = temp;
			}
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}
