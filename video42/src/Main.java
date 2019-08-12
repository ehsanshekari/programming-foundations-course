import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of cities: ");
        int n = input.nextInt();
        int seasons = 4;
        double sum;
        double[] avgs = new double[seasons];
        double[][] rains = new double[n][seasons];
        for (int i = 0; i < rains.length; i++){
            System.out.println("CITY:" + (i + 1));
            for(int j = 0; j < rains[i].length; j++){
                System.out.println("Enter rain amount for season " + (j + 1));
                rains[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < rains.length; i++){
            System.out.println("CITY: " + (i + 1));
            for(int j = 0; j < rains[i].length; j++){
                System.out.print(rains[i][j] + " ");
            }
            System.out.println(" ");
        }

        for(int i = 0; i < seasons; i++){
            sum = 0;
            for(int j = 0; j < n; j++){
                sum += rains[j][i];
            }
            avgs[i] = sum / n;
        }

        for(int i = 0; i < seasons; i++){
            for(int j = 0; j < n; j++){
                if(rains[j][i] < avgs[i]){
                    System.out.println("avg for season " + (i + 1) + " " + avgs[i]
                            + " City: " + (j + 1) + " City rain: " + rains[j][i]);
                }
            }
        }
    }
}
