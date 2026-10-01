package literals;

public class literals {
    public static boolean prime(int a){
        if(a==0||a==1||a==2){
            return true;
        }
        for(int i=3;i<Math.sqrt(a);i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(prime(20 ));
    }
}
