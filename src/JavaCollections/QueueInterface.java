package JavaCollections;

import javax.swing.plaf.IconUIResource;
import java.awt.*;
import java.util.*;

public class QueueInterface {
    public static void QueueClass(){
        Queue<Integer> Q=new LinkedList<>();

        Q.offer(2); //add element
        Q.add(3);  //add element
        Q.add(5);
        Q.offer(5);
        for(int x:Q){
            System.out.print(x+" ");
        }

        System.out.println(Q.element()); //only retrives
        System.out.println(Q.peek()); //only retives and give null is emply
        System.out.println(Q.poll()); //retives and remove the head
        System.out.println(Q.remove()); //retives and remove the head and gives null when empty
        System.out.println();

        System.out.println(Q.contains(5));
        System.out.println(Q.size());
        System.out.println(Q.isEmpty());

        System.out.println(Q);
    }

    public static void PriorityClass(){
        //priority Queue is used for some priority based storing

        PriorityQueue<Integer>PQ=new PriorityQueue<>(); //min PQ
        PQ.add(10);
        PQ.add(5);
        PQ.add(7);
        PQ.offer(2);
      for(int x:PQ){
          System.out.print(x);
      }

        System.out.println(PQ.peek());
        System.out.println(PQ.poll());
        System.out.println(PQ); //[5,10,7]
        System.out.println(PQ.contains(2));
        Integer[] arr = PQ.toArray(new Integer[0]);

        PQ.remove(7);
        System.out.println(PQ);
        PriorityQueue<Integer>PQ2 =new PriorityQueue<>(Collections.reverseOrder()); //max PQ
        PriorityQueue<Integer>PQ3 =new PriorityQueue<>((a,b)->b-a);  //max PQ with custom compataor;

        System.out.println(PQ3.comparator()); //gives the compatror
    }

    public static void DequeClass(){
         Deque<Integer> dq= new ArrayDeque<>();
        //simple method of Queue act as sample in Queue
         dq.addFirst(1);// add from Front
         dq.addFirst(2);
         dq.addLast(0);
         dq.add(5); //add from rear;
         dq.offerFirst(5);  //add from first
         dq.offerLast(6);  //add from last
        System.out.println(dq.peek()); //return front value
        System.out.println(dq.peekFirst()); //return front value
        System.out.println(dq.peekLast()); //return rear value

        System.out.println(dq.poll()); // return and remove front value
        System.out.println(dq.pollFirst()); //return and remove from front
        System.out.println(dq.pollLast()); //return and remove from rear

        System.out.println(dq.element()); //return the head of DQ

        System.out.println(dq.contains(1));
        System.out.println(dq.remove(0));
        System.out.println(dq.isEmpty());
         for(Integer x:dq){
             System.out.print(x+" ");

         }
         dq.clear();




        System.out.println(dq);
    }
    public static void main(String[] args){

        QueueClass();
        PriorityClass();
        DequeClass();
    }
}
