import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = input.nextInt();
        int i = 0;
        int sum = 0;
        int adad;

        while( i < n){
            System.out.print("Enter your number: ");
            adad = input.nextInt();
            sum += adad;
            i++; // ++i
        }

        System.out.print("Sum is: " + sum);
    }
}
