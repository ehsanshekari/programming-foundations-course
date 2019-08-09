import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int i;

         do {
             System.out.print("Enter your number (1 to 10)");
             i = input.nextInt();
         } while(!(i > 1 && i < 10));

        System.out.print("number is" + i);


    }
}
