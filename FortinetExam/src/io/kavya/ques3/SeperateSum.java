package io.kavya.Fortinet;

import java.util.ArrayList;
import java.util.List;

public class SeperateSum {

	//Time Complexity : O(n)
	//Space Complexity : O(n)
	
	public boolean seperate(List<Integer> list,int k)
	{
		Object arr[] = list.toArray();
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += (int)arr[i];
		if (sum%2 != 0)
			return false;
		int n = arr.length;
		return isSubsetSum (arr, n, sum/k);
	}

	private boolean isSubsetSum(Object[] arr, int n, int sum) {
		
		// Base Cases
				if (sum == 0)
					return true;
				if (n == 0 && sum != 0)
					return false;

				// If last element is greater than sum, then ignore it
				if ((int)arr[n-1] > sum)
					return isSubsetSum (arr, n-1, sum);

				/* else, check if sum can be obtained by any of
				the following
				(a) including the last element
				(b) excluding the last element
				*/
				return isSubsetSum (arr, n-1, sum) ||
					isSubsetSum (arr, n-1, sum-(int)arr[n-1]);
	}

}
