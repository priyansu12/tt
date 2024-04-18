/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAA;

/**
 *
 * @author Kashish
 */

import java.util.*;
import java.io.*;
class  exp10{


	static boolean isSubsetSum(int set[], int n, int sum)
	{
		// Base Cases
		if (sum == 0)
			return true;
		if (n == 0)
			return false;

		if (set[n - 1] > sum)
			return isSubsetSum(set, n - 1, sum);

		return isSubsetSum(set, n - 1, sum)
			|| isSubsetSum(set, n - 1, sum - set[n - 1]);
	}

	// Driver code
	public static void main(String args[])
	{
                Scanner myObj = new Scanner(System.in);  
                int n,d;
      
        System.out.println("Enter the size of your array");
        n = myObj.nextInt();
        int[] set  = new int[n];
        System.out.println("Enter the elements of your array");
        for(int i=0;i<n;i++){
            set[i] = myObj.nextInt();
        }
        System.out.println("Enter the sum");
		d = myObj.nextInt();

		if (isSubsetSum(set, n, d) == true)
			System.out.println("Found a subset"
							+ " with given sum");
		else
			System.out.println("No subset with"
							+ " given sum");
	}
}


