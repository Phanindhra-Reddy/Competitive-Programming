import java.util.*;
import java.lang.Math;
public class MaxSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       System.out.println("enter size of array");
	       int x=sc.nextInt();
	       int a[]=new int[x];
	       System.out.println("enter elements of array");
	       for(int i=0;i<x;i++) {
	    	   a[i]=sc.nextInt();
	       }
           sc.close();
	       System.out.println("maxsubarray: ");
	       maxSubArray(a);
	}
	
	//method that prints the maximum subarray and sum as well
	public static void maxSubArray(int arr[]) {
		int result=0;
		int sum[]=new int[arr.length];
		sum[0]=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			sum[i]=Math.max(arr[i],sum[i-1]+arr[i]);
			result=Math.max(sum[i], result);
		}
		int start=0,end=0,temp=result;
		
		for(int i=0;i<arr.length;i++) {
			if(result==sum[i]) {
				end=i;
				break;
			}
		}
		for(int i=end;i>=0;i--) {
			temp-=arr[i];
			if(temp==0) {
				start=i;
				break;
			}
		}
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Maximum sum: ");
		System.out.print(result);
	}

}

// time complexity : O(n) 
/*
====================================================
Sample input1:
enter size of array
16
enter elements of array
13 -3 -25 20 -3 -16 -23 18 20 -7 12 -5 -22 15 -4 7
Sample Output1:1
maxsubarray: 
18 20 -7 12 
Maximum sum: 
43
=====================================================
Sample input2:
enter size of array
9
enter elements of array
-2 1 -3 4 -1 2 1 -5 4
Sample output2:
maxsubarray: 
4 -1 2 1 
Maximum sum: 
6
====================================================
*/