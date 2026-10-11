package String;

public class string1 {
    public static void main(String[] args) {
        String a= new String("Rohit");
        String b= new String("Rohit");

        System.out.println(a==b);
          String s="rohit";
          StringBuilder sb =new StringBuilder(s);
          sb=new StringBuilder(sb.toString().toUpperCase());
           System.out.println(sb.toString());
    }
}
