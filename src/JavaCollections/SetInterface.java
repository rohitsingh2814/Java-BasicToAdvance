package JavaCollections;

import java.util.*;

public class SetInterface {
    public static void HashSet(){

        HashSet<Integer> st= new HashSet<>();

        st.add(1);
        st.add(2);
        st.add(1); //not add because 1 is already present;
        st.remove(1); //remove single instance
        st.add(5);
        System.out.println(st.contains(5));
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        System.out.println(st);

        //Arraylist to set
        //HashSet<Integer> st= new HashSet<>(list);

        //array to set
        int[] arr={1,2,3,4,5,6,7};
        HashSet<Integer> st2= new HashSet<>();
        for(int x :arr){
            st2.add(x);
        }
        System.out.println(st2);
    }

    public static void LinkedHashSet(){
        // same as hastset only preserve the order of insertion;

        HashSet<Integer>Lst=new LinkedHashSet<>();
        Lst.add(1);
        Lst.add(2);
        Lst.add(3);
        Lst.add(4);

        System.out.println(Lst); //1 2 3 4

        //all other fn are same as hashset

    }

    public static void TreeSet() {
        TreeSet<Integer>Ts=new TreeSet<>();

        //store the unique and sorted manner

        Ts.add(1);
        Ts.add(2);
        Ts.add(3);
        Ts.add(48);
        Ts.add(10);
        Ts.add(9);

        System.out.println(Ts);
        //all other fn are same as hashset

    }

    public static void main(String[] args) {
        HashSet();
        LinkedHashSet();
        TreeSet();
    }
}
