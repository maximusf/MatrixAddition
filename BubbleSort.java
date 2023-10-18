
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The Plan:
		//4 2 1 3 5
		
		//Compare 4 and 2 (index 0 and 1)
		//Index 1 is smaller, swap them
		
		//new array is {2,4,1,3,5}
		
		//Compare 4 and 1 (index 1 and 2)
		//index 2 is smaller, swap them
		
		//new array is {2,1,4,3,5}
		
		//New Array is {2,1,3,4,5}
		
		int[] array = {4,2,1,3,5};
		
		boolean hasSwapped = true;
		
		while(hasSwapped)
		{
			hasSwapped = false;
			
			for(int i=0; i<array.length-1; i++) 
			{
				if(array[i] > array[i+1])
				{
					hasSwapped = true;
					
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}

	}

}
