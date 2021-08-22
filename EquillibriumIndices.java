import java.util.*;
public class EquillibriumIndices {

	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
          int n=sc.nextInt();
          int arr[]=new int[n];
          System.out.println("enter the elements of the array: ");
          for(int i=0;i<n;i++) {
              arr[i]=sc.nextInt();
          }
          sc.close();
          List<Integer> result = new ArrayList<Integer>();
          result = equillibriumIndices(arr);
          if(result.isEmpty()){
            System.out.println("equllibriumIndices are: ");
              System.out.println("No EquillibriumIndices found.");
          }else
              System.out.println(result);
   }
   static List<Integer> equillibriumIndices(int arr[]){
       int x = arr.length;
       List<Integer> store = new ArrayList<Integer>();
       
       int sum=0,lsum=0;
       for(int i=0;i<x;i++) {  //x+1 times
           sum+=arr[i];
       }
       for(int i=0;i<x;i++) {   //x+1 times
           if(i!=0)
               lsum+=arr[i-1];
           else
               lsum=0;
           sum=sum-arr[i];
           if(lsum==sum)
               store.add(i);
       }
       return store;
   }

}
// The total time complexity is : O(n) ( best,worst and average cases);

/**
 * Problem Summary
 * An Indx is said to be equillibrium index iff 
 *    sum of left side elements is equal to the sum of right side inndex elements
 *    for an index i in an array a[n]
 *    left sum = arr[0]+...+arr[i-1]
 *    rightsum = arr[i+1]+.....arr[n-1]
 *    if(leftsum == rightsum) i is an equillibrium index
 */
/**
 * sample input 1:
 * 7
 * -7 1 5 2 -4 3 0
 * sample output 1:
 * 3 6
 * 
 * sample input 2:
 * 7
 * -4 3 0 2 -7 1 5
 * sample output 2:
 * 3
 */