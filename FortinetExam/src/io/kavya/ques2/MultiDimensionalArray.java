package io.kavya.Fortinet;

public class MultiDimensionalArray {

	public static Long getValue(int indexOfDimension)
	{
		long value = 0; 
		return value;
	}
	
	
	//Time Complexity : O(2mn)
	//Space Complexity : O(2mn)
	public static Long sum(MultiDimensionalArray mArray, int[] lengthOfDimension)
	{
		long sum = 0;
		int rows = lengthOfDimension[0];
		int columns = lengthOfDimension[1];
		long multiDimensionalArray [][] = new long[rows][columns];
		for(int i = 0; i < rows;i++)
		{
			for(int j = 0; j < columns;j++)
			{
				multiDimensionalArray[i][j] = mArray.getValue(i);
			}
		}
		for(int i = 0; i < rows;i++)
		{
			for(int j = 0; j < columns;j++)
			{
				sum += multiDimensionalArray[i][j];
			}
		}
		
		return sum;
	}
	
}
