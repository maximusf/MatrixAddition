
public class MaxValArray {
//Looks for the maximum value of an array
	public static void main(String[] args) {
		
		int[] array = {9,10,1,-5,8,100,3};
		
		int max = array[0];
		
		for (int i=0; i<array.length; i++) 
		{
			if (max > array[i]) {
				max = array[i];
			}
			
		}
		
		
		System.out.println(max);
		

	}

}
