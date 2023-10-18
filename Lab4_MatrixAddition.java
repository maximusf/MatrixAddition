//Maximus Fernandez
//10/5/2023

import java.util.Scanner;
public class Lab4_MatrixAddition {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Welcome message
		Greeting();
		
		//Gathering dimensions for matrix 1 & 2
		
		System.out.println("-- Dimensions for Matrix 1 --");
		System.out.println("Please enter the length and width for this matrix.");
		int rowsNum1 = input.nextInt();
		int columnsNum1 = input.nextInt();
		//Creating Matrix 1
		int [][] matrix1 = new int [rowsNum1][columnsNum1];
		//Receive elements for matrix 1 array for each row of matrix 1
		for (int i=0; i<rowsNum1; i++) {
			for (int j=0; j<columnsNum1; j++) 
			{
				System.out.println("Please enter value at index "+i+" "+j);
				matrix1[i][j] = input.nextInt();
			}
		}
		
		//Displays user's first matrix
		for(int i=0; i<rowsNum1; i++){
			for(int j=0; j<columnsNum1; j++)
			{
				System.out.print(matrix1[i][j] + " ");
			}
			
			System.out.println();
		}
		
		//User inputs elements for second matrix (array)
		System.out.println("-- Dimensions for Matrix 2 --");
		System.out.println("Please enter the length and width for this matrix.");
		int rowsNum2 = input.nextInt();
		int columnsNum2 = input.nextInt();
		//Creating Matrix 2
		if (rowsNum1 == rowsNum2 && columnsNum1 == columnsNum2)
		{
		int [][] matrix2 = new int [rowsNum2][columnsNum2];
		//Receive elements for matrix 1 array for each row of matrix 2
		for (int i=0; i<rowsNum2; i++) {
			for (int j=0; j<columnsNum2; j++) 
			{
				System.out.println("Please enter value at index "+i+" "+j);
				matrix2[i][j] = input.nextInt();
						
			}
		}
		System.out.println();
				
		//Displays user's second matrix
		for(int i=0; i<rowsNum2; i++){
			for(int j=0; j<columnsNum2; j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("The sum of these matrices is: ");
		
		
		//Printing first matrix
		for(int i=0; i<rowsNum1; i++){
			for(int j=0; j<columnsNum1; j++)
			{
				System.out.print(matrix1[i][j] + " ");
			}
			
			System.out.println();
		}
		//Adding display
		System.out.println();
		System.out.println("+");
		System.out.println();
		//Printing second matrix
		
		for(int i=0; i<rowsNum2; i++){
			for(int j=0; j<columnsNum2; j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
			
			System.out.println();
		}
		int [][] matrix3 = new int [rowsNum1][columnsNum1]; // CHECK HERE
		
		//Addition logic for combining both matrices
		for (int i=0; i<rowsNum1; i++){
			for (int j=0; j<columnsNum1; j++)
			{
				matrix3[i][j]= matrix1[i][j] + matrix2[i][j];
			}
		}
		
		//Printing sum of both matrices
		System.out.println();
		System.out.println("=");
		System.out.println();
		for(int i=0; i<rowsNum1; i++)
		{
			for(int j=0; j<columnsNum1; j++)
			{
				System.out.print(matrix3[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		
		}// end of if-statement
		else {
			System.out.println("The dimensions for Matrix 1 and Matrix 2 are not the same.");
		}
		
		//Close scanner
		input.close();

	}
	
	public static void Greeting() {
		System.out.println("== Adding Two Matrices Program ==");
		System.out.println("--      (Using 3 arrays)       --");
		System.out.println();
	}
	
	
}