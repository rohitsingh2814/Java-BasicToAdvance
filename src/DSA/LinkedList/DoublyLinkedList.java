package DSA.LinkedList;
public class DoublyLinkedList {
    public static class Dnode{
        int data;
        Dnode next;
        Dnode prev;

        Dnode(int data,Dnode next,Dnode prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }

        Dnode(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    public static Dnode ArrayToDll(int[] arr){
        int n=arr.length;
        Dnode head=new Dnode(arr[0]);
        Dnode current=head;
        for(int i=1;i<n;i++){
            Dnode temp=new Dnode(arr[i]);
            temp.prev=current;
            current.next=temp;
            current=current.next;
        }
        return head;

    }
    public static Dnode DeleteHead(Dnode head){
        if(head.next==null){
            return null;
        }
        head=head.next;
        head.prev=null;
        return head;

    }
    public static Dnode DeleteTail(Dnode head){
        Dnode current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;

        return head;

    }
    public static Dnode DeleteKth(Dnode head,int k){
        if(k==1){
            head=head.next;
            head.prev=null;
            return head;
        }

        Dnode current=head;
        int count=0;
        while(current!=null){
            count++;
            if(count==k){
                break;
            }
            current=current.next;
        }

        Dnode next=current.next;
        Dnode prev=current.prev;

        if(next==null && prev==null){
            return null;
        }else if( prev==null){
            DeleteHead(head);
        }else if(next==null){
            DeleteTail(head);
        }
        else{
            prev.next=next;
            next.prev=prev;
        }
        return head;
    }

    public static Dnode DeleteEl(Dnode head,int el){
        if(head==null){
            return null;
        }
        Dnode current=head;
        while(current!=null){
            if(current.data==el){
                break;
            }
            current=current.next;
        }
        Dnode next=current.next;
        Dnode prev=current.prev;

        if(next==null && prev==null){
            return null;
        }else if( prev==null){
            DeleteHead(head);
        }else if(next==null){
            DeleteTail(head);
        }
        else{
            prev.next=next;
            next.prev=prev;
        }
        return head;

    }
    public static Dnode InsertBeforeHead(Dnode head,int val){
        Dnode newHead=new Dnode(val,head,null);
        head.prev=newHead;
        return newHead;
    }
    public static Dnode InsertBeforeTail(Dnode head,int val){
       Dnode current=head;
       while(current.next!=null){
           current=current.next;
       }
        Dnode newnode=new Dnode(val,current,current.prev);
        current.prev.next=newnode;
        return head;
    }
    public static void  PrintDll(Dnode head){
        while(head!=null){
            System.out.print(head.data+" <-> ");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        Dnode head=ArrayToDll(arr);
        PrintDll(head);
        System.out.println(head.next.prev.data); //print the head
        head=DeleteHead(head);
        PrintDll(head);
        head=DeleteTail(head);
        PrintDll(head);
        head=DeleteKth(head,4);
        PrintDll(head);
      head=DeleteEl(head,4);
        PrintDll(head);

        head=InsertBeforeHead(head,1);
        PrintDll(head);
        head=InsertBeforeTail(head,2);
        PrintDll(head);

    }


}
