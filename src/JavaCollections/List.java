package JavaCollections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class List {

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

        ll.add(2);

   }
    public static void main(String[] args){
           ArrayListClass();





    }
}
