package Interview;

public class PrimeNumber {
    static String prime(int n){

        for(int i = 2;i <n ; i++) {
            if(n%i ==0) {
                return "Not prime";
            }
        }
        return "prime";
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(prime(n));
    }

}
