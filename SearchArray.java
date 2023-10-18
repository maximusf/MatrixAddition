import java.util.Scanner;

public class SearchArray {
//Searches for a value from an array
	public static void main(String[] args) {
		
		int [] array = {0,1,2,3,4,5};
		
		Scanner k = new Scanner(System.in);
		System.out.println("What number do you want to search the array for? ");
		
		int search = k.nextInt();
		
		boolean exists = false;
		
		for (int i = 0; i< array.length; i++) {
			if (search == array[i]) {
				
//				System.out.println("We found it! It was at index: " + i);
//				break:
				exists = true;
				break;
			}
		}

		if (exists == true)
			//if(exists)
		{
			System.out.println("Exists");
		}
		
		k.close();
			
	}

}
