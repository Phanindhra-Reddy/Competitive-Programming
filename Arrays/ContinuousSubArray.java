import java.util.*;
public class ContinuousSubArray {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of the array: ");
       int n=sc.nextInt();
       System.out.println("enter the elements of the array: ");
       int arr[]=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       System.out.println("subarray needed to be sorted is: ");
       subArray(arr);
       sc.close();
	}
	
	//method that prints the subrray to be sorted
	static void subArray(int arr[]) {
		int x = arr.length;
		int t[]=new int[x];
	       for(int i=0;i<x;i++) {
	    	   t[i]=arr[i];
	       }
	       int start=0,stop=0;
	       for(int i=1;i<x;i++) {  // x times 
	    	   int key=arr[i];
	    	   int j=i-1;
	    	   while(j>-1 && arr[j]>key) {  //x - 1 times for best case
	    		   start=i;
	    		   arr[j+1]=arr[j];
	    		   stop=j;
	    		   j--;
	    	   }
	    	   arr[j+1]=key;
	       }
	      for(int h=stop;h<=start;h++) {
	    	   System.out.print(t[h]+" ");
	       }
	}

}

// Total Time complexity is : O(n) for best case
                        //   O(n^2) for worst and average cases

/**
 EXAMPLE 1

 suppose  let us take the array [1,2,3,0,4,5] 
here,
    if we sort [1,2,3,0] then the whole array would be sorted.

EXAMPLE 1

 suppose  let us take the array [4,5,6,7,10,9,8,11,12] 
here,
    if we sort [10,9,8] then the whole array would be sorted.
 */

 /**
  sample input 1:
  6
  1 2 3 0 4 5 
  sample output 1:
  1 2 3 0

  sample input 2:
  9
  4 5 6 7 10 9 8 11 12
  sample output 2:
  10 9 8
  */