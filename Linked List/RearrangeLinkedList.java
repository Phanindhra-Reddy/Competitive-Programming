/*Problem statement :
 *  rearrange the linked list in such a way that all the even nodes
 *  should come first and then followed by odd nodes.
 *  
 *  sample input : 12 34 32 21 34 45 6 54 34 23 1 2
 *  sample output: 12 34 32 34 6 54 34 2 21 45 23 1*/

class Node{
    int data;
    Node next;
   
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
   }
   
   public class RearrangeLinkedList{
    
    public static void printList(Node head){
        Node ptr = head;
        while (ptr != null){
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }
   
    public static Node rearrangeEvenOdd(Node head){
        Node odd = null, oddTail = null;
        Node even = null, evenTail = null;
        Node curr = head;
   
        while (curr != null){
            if ((curr.data & 1) != 0){
                if (odd == null) {
                    odd = oddTail = curr;
                }
                else {
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }else{
                if (even == null) {
                    even = evenTail = curr;
                }else {
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            }
            curr = curr.next;
        }
   
        if (even != null){
            head = even;
            evenTail.next = odd;
        }else {
            head = odd;
        }
   
        if (oddTail != null) {
            oddTail.next = null;
        }
   
        return head;
    }
   
    public static void main(String[] args){
        int[] keys = {1,2,3,4,5,6,7,8,9,10 };
        Node head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
        head = rearrangeEvenOdd(head);
        printList(head);
    }
   }