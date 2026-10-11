package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class ListInterface {

    public static void ArrayListClass(){
        ArrayList<Integer>arr=new ArrayList<>();
       arr.add(2);  //add element
       arr.add(3);
       arr.add(4);
       System.out.println(arr); // [2, 3, 4]

        arr.add(1,5);  // add a paticular index and  move further elemnt

        System.out.println(arr);  //[2, 5, 3, 4]

        System.out.println(arr.get(0)); // access the element by by index

        arr.set(1,3); //modify the element by using index and value;

        System.out.println(arr);  // [2, 3, 3, 4]

        arr.remove(3); //index passed to remove elements
        arr.remove(arr.indexOf(2)); //remove elements by value;
        System.out.println(arr);


        //arr.equals(arr2)  // true or false if two arraylist have same element in same order

        System.out.println(arr.contains(3)); // true if arraylist present the element else false

        System.out.println(arr.size()); // size of the arraylist

        arr.clear();  // clear the array

        Collections.sort(arr); //sort the arraylist
        Collections.sort(arr,Collections.reverseOrder()); //sort in decending order
        Collections.reverse(arr); //reverse the array
        System.out.println(arr.isEmpty()); // checks the array is empty

 }

   public static  void LinkedListClass(){
        LinkedList<Integer>ll=new LinkedList<>();

        //ll add methods
        ll.add(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.add(4);

       System.out.println(ll);

        //ll get methods
       System.out.println(ll.get(1)); //by index o(n)
       System.out.println(ll.getFirst()); //O(1)
       System.out.println(ll.getLast()); //O(1)

       //update
       ll.set(1,100); //O(n)

       //remove
       ll.remove(1); //o(n) by index
       ll.removeFirst(); //O(1)
       ll.removeLast(); //O(1)

       //search
       System.out.println(ll.contains(3)); //O(n)
       System.out.println(ll.indexOf(2)); //O(n)

       System.out.println(ll);
       System.out.println(ll.size());
    // other sorting and reverse and empty fn same as ArrayList



   }

   public static void StackClass(){
        Stack<Integer>st=new Stack<>();

        st.push(1); //add element on top
        st.push(2);
        st.push(3);
        st.add(4);
        st.add(5);
        System.out.println(st.pop()); //remove and return top element
       System.out.println(st.peek()); //return top element
       System.out.println(st.empty()); //check stack is empty or not
       System.out.println(st.contains(2)); //give 1-based index answer

       //others method of collection appy for satck
       //Underflow = trying to remove an element when the stack is empty.
       // Overflow = trying to add an element when the stack has reached its maximum capacity.

   }
    public static void main(String[] args){
           ArrayListClass();
           LinkedListClass();
           StackClass();
    }
}
