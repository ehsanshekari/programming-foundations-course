public class Main {

    public static void main(String[] args) {
        int n = 60;
        int fact = 1;
        int i;

        for( i = 1; i <= n; i++){
            fact *= i;
        }

        System.out.println("factorial is: " + fact);
    }
}
