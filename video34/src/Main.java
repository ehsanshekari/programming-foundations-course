public class Main {

    public static void main(String[] args) {

     int n = 26575;
     int varoon = 0;
     int r;

     while(n > 0){
         r = n % 10;
         varoon = (varoon * 10) + r;
         n /= 10;
     }

     System.out.println("Varoon:" + varoon);

    }
}
