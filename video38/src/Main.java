public class Main {

    public static void main(String[] args) {

        System.out.println(factorial(3));
        System.out.println(factorial(4));
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++ ){
            fact *= i;
        }
        return fact;
    }

}
