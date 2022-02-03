/*Problem statement:
 * Write a method to detect the loop present in the linkedlist.*/


import java.util.*;
public class LoopDetection{
	//creating a node in the linkedlist
	static class Node{
		int data;
		Node next;
		public Node(int x) {
			data = x;
			next = null;
		}
	}
	//main method
	public static void main(String[] args) {
		Node head = new Node(0);
		head.next = new Node(1);
		head.next.next = new Node(2);
		head.next.next.next = new Node(3);
		//creating loop in linkedlist
		head.next.next.next.next = head.next;
		//Node temp = head;
		//printLL(temp);
		System.out.println("LinkedList contains loop : "+detectLoop(head));
	}
	//printing the linkedlist
	public static void printLL(Node h) {
		while(h!=null) {
			System.out.println(h.data+" ");
			h=h.next;
		}
	}
	//using HashSet to detect loop
	public static boolean detectLoop(Node root) {
		HashSet<Node> store = new HashSet<Node>();
		while(root!=null) {
			if(store.contains(root)) {
				return true;
			}
			store.add(root);
			root = root.next;
		}
		return false;
	}
}
