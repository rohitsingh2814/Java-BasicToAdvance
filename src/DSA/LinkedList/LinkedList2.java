package DSA.LinkedList;
import DSA.LinkedList.LinkedList1.Node;
import static DSA.LinkedList.LinkedList1.SizeOfLink;
import static DSA.LinkedList.LinkedList1.PrintLinkList;
public class LinkedList2 {

    public static Node DeleteHead(Node head){
        if(head==null){
            return null;
        }
        return head.next;
    }


    public static Node DeleteTail(Node head){
        if(head==null){
            return null;
        }
        Node current =head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        return head;
    }

    public static Node DeleteKth(Node head,int k){
        Node current =head;
        int count=0;
        Node prev=null;
        if(k==1) return head.next;


        while(current!=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=current;
            current=current.next;

        }


        return head;
    }

    public static Node DeleteEl(Node head,int el){
        Node current =head;
        Node prev=null;
        if(el==head.data) return head.next;


        while(current!=null){
            if(el==current.data){
                prev.next=prev.next.next;
                break;
            }
            prev=current;
            current=current.next;

        }


        return head;
    }

    public static Node InsertHead(Node head,int data){
        Node NewHead=new Node(data);
        NewHead.next=head;

        return NewHead;
    }

    public static Node InsertTail(Node head ,int data){
        Node current=head;
        while(current.next!=null){
            current =current.next;
        }
        current.next=new Node(data);

        return head;
    }

    public static Node InsertNodeKth(Node head,int data,int k){
        if(head==null){
            if(k==1){
                return new Node(data);
            }
            else{
                return null;
            }
        }

        if(k==1){
            Node temp=new Node(data);
            temp.next=head;
            return temp;
        }

        Node current=head;
        int count=0;
        while(current!=null){
            count++;
            if(count==k-1) {
                Node temp = new Node(data);
                temp.next = current.next;
                current.next = temp;
                break;
            }
            current=current.next;
        }
        return head;
    }

    public static Node InsertBeforeValue(Node head,int el,int val){
        if(head==null){
            return null;
        }
        if(val==head.data){
            Node temp=new Node(el);
            temp.next=head;
            return temp;
        }

        Node current=head;

        while(current.next!=null){
            if(current.next.data==val){
                Node temp=new Node(el);
                temp.next=current.next;
                current.next=temp;
                break;
            }

            current=current.next;

        }

        return head;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        Node head=new Node(arr[0]);
        Node current = head;


        for(int i=1;i<arr.length;i++){
            current.next=new Node(arr[i]);
            current=current.next;
        }
        PrintLinkList(head);
        System.out.println("Current Head: "+head.data);
        head=DeleteHead(head);
        PrintLinkList(head);
        System.out.println("after deleting  Head: "+head.data);

        System.out.println("After deleting tail");
        head=DeleteTail(head);
        PrintLinkList(head);

        System.out.println("after deleting Kth node");
        head=DeleteKth(head,3);
        PrintLinkList(head);

        System.out.println("after deleting element node");
        head=DeleteEl(head,3);
        PrintLinkList(head);



        System.out.println("after adding new head node");
        head=InsertHead(head,10);
        PrintLinkList(head);

        System.out.println("after adding new Tail node");
        head=InsertTail(head,20);
        PrintLinkList(head);


        System.out.println("after adding new node in nth");
        head=InsertNodeKth(head,30,3);
        PrintLinkList(head);
        head=InsertNodeKth(head,9,1);
        PrintLinkList(head);
        head=InsertNodeKth(head,70,7);
        PrintLinkList(head);
        head=InsertNodeKth(head,20,2);
        PrintLinkList(head);

        System.out.println("after adding new node before passed value");
        head=InsertBeforeValue(head,20,30);
        PrintLinkList(head);

    }

}
