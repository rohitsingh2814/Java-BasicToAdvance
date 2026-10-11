package JavaCollections;

import java.util.*;


public class HashInterface {

public static void HashMap(){
    HashMap<Integer,String>mp=new HashMap<>();
    mp.put(1,"Rohit");
    mp.put(2,"Aman");
    mp.put(3,"Raj");

    System.out.println(mp);

    String str="aabccbda";
    HashMap<Character,Integer>freq=new HashMap<>();
    for(int i=0;i<str.length();i++){
        freq.put(str.charAt(i),freq.getOrDefault(str.charAt(i),0)+1);
    }

    System.out.println(freq);
    System.out.println(freq.containsKey('a'));
    System.out.println(freq.containsValue(2));
    System.out.println(freq.size());
    freq.remove('d');
    for(char a: freq.keySet()){  //iterate keys
        System.out.println(a);
    }

    for(int a: freq.values()){ //iterate values
        System.out.println(a);
    }

    for(var e :freq.entrySet()){
        System.out.println(e.getKey()+" -> "+ e.getValue());
    }

    freq.forEach((key,value)->{
        if(value>2){
            System.out.println(key);
        }
    });


}

public static void LinkedHashMap(){
    //same as hashmap only ordered of insertion mantained.

    LinkedHashMap<Integer,String> ls=new LinkedHashMap<>();
}
public static void TreeMap(){
        //same as hashmap only sorting according to keys.

        TreeMap<Integer,String> ls=new TreeMap<>();
}


    public static void main(String[] args) {

    HashMap();
    LinkedHashMap();
    TreeMap();
    }
}
