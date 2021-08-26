import java.util.*;
public class MountainArray {

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
       
       System.out.println(checkMountain(arr) ? "Mountain array":"not mountain array");
       sc.close();
	}

    
	//checks whether the given array is mountain array or not
	public static boolean checkMountain(int a[]) {
		int x = a.length;
		if(x<=3) {
			return false;
		}else {
		boolean lar=true,rar=true;;
		int max=0,ind=0;;
		for(int i=0;i<x;i++) {
			if(max<a[i]) {
				max=a[i];
				ind=i;
			}
		}
		//checks whether left side array is in ascending order
		for(int i=0;i<ind;i++) {  // ind+1 times
			if(a[i]>a[i+1]) {
				lar=false;
				break;
			}
		}
		//checks whether right side array is in descending order
		for(int i=x-1;i>ind;i--) { // x-ind + 1times
			if(a[i]>a[i-1]) {
				rar=false;
				break;
			}
		}
		if(lar&&rar) {
			return true;
		}else {
			return false;
		}
		}
	}
	/*Alternate method

public static boolean validMountainArray(int[] A) {
int i = 0;
int j = A.length - 1;
int n = A.length - 1;
while (i + 1 < n && A[i] < A[i+1]) {
i++;
}
while (j > 0 && A[j] < A[j-1]) {
j--;
}
return i > 0 && i == j && j < n;
}
}
	 */
}

//time complexity id : O(n) (best,worst and average cases)

//problem statement

/*
 * there must be a gradual increase and after reaching certain point  it should
 * decrease gradually
 * the input array size must be greater than  3
 * 
 * sample input1:
 * 5
 * 1 2 3 2 1
 * sample output1:
 * Mountain array
 * 
 * sample input2:
 * 8
 * 1 2 3 4 5 5 2 0
 * sample output2:
 * Mountain array
 * 
 * sample input1:
 * 2
 * 1 2
 * sample output1:
 * not Mountain array
 * */

