package DSA.LinkedList;

public class LinkedList1 {

    public static class Node {
        int data;
        Node next;

        // Constructor: data + next node
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        // Constructor: only data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int SizeOfLink(Node head) {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void PrintLinkList(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating nodes
        Node n1 = new Node(2, null);
        n1.next = new Node(3, null);

        System.out.println(n1.next.data);


        // Converting array into Linked List
        int[] arr = {1, 2, 3, 4, 5, 6};

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        System.out.println(current.data);

        //printing linklist
        PrintLinkList(head);



        // Size of Linked List
        System.out.println("Size = " + SizeOfLink(head));
    }
}