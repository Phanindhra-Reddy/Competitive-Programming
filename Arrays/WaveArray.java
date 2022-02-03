import java.util.*;
public class WaveArray {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of the array: ");
       //taking the size of the input array
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter the elements: ");
       //taking the elemets of the array
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       sc.close();
       //sorting the elements in ascending order
       Arrays.sort(arr);  // O(nlogn)
       int i=0;
       /*checking the even position elements are greater than 
         next adjacent element.if not we have to swap them*/
       while(i<n-1) {  // O(n)
    	   if(arr[i]<=arr[i+1]) {
    		   int temp=arr[i];
    		   arr[i]=arr[i+1];
    		   arr[i+1]=temp;
    	   }
    	   i=i+2;
       }
       System.out.println("wave array is: ");
       System.out.println(Arrays.toString(arr));
	}
}

//total time complexity : O(nlogn);

//Problem Statement
/*
The array elements in the resultant array must be such that arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] .....

If there are multiple sorted orders in wave form, return the one which is lexicographically smallest.

The array may contain duplicates. 
---------------------------------
 sample input:1
 5
 5 2 9 3 2
 sample output:1
 2 2 5 3 9
 --------------------------------
 sample input:2
 6
 3 2 9 6 4 1
 sample output:2
 2 1 4 3 6 9
 --------------------------------
 */
