import java.util.*;
import java.lang.*;
import java.io.*;
 public class BinaryIndexedTree{
	 static int BIT[]=new int[1000];
	 static int n,a[];
	 public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the size of array: ");
		 n = sc.nextInt();
		 a = new int[n+1];
		 System.out.println("enter the elements of array: ");
		 for(int i=1;i<=n;i++) {
			 a[i]=sc.nextInt();	 
		 }
		 for(int i=1;i<=n;i++) {
			 update(i,a[i]);
		 } 
		 System.out.println("Input Array:");
		 for(int i=1;i<=n;i++) {
			 System.out.print(a[i]+" ");
		 }
		 System.out.println();
		 System.out.println("Binary Indexed Tree:");
		 for(int i=1;i<=n;i++) {
			 System.out.print(BIT[i]+" ");
		 }
		 System.out.println();
		 System.out.println("enter the index for sum:");
		 int x = sc.nextInt();
		 System.out.println("your sum: "+sum(x));
		 sc.close();
	 }
	 //Method to create binry indexed tree
	 static void update(int index,int element) {
		 for(;index<=n;index+=index & (-index)) {
			 BIT[index]+=element;
		 }
	 }
	 
	 //method to get the sum of n indices
	 static int sum(int index) {
		 int sum=0;
		 for(;index>0;index-=index&-index) {
			 sum+=BIT[index];
		 }
		 return sum;
	 }
 }