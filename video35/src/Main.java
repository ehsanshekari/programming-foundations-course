import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalAvg = 0.0;
        double maxAvg = -1;
        double minAvg = 21;
        int maxStudentId = 0;
        int minStudentId = 0;
        int i;
        int n = 2;
        int nCourses;
        int id;
        double grade;
        int unit;
        double sum;
        int totalUnit;
        double avg;


        for (i = 0; i < n; i++) {
            System.out.print("Enter nCourses: ");
            nCourses = input.nextInt();
            System.out.print("id: ");
            id = input.nextInt();
            sum = 0;
            totalUnit = 0;
            for (int j = 0; j < nCourses; j++) {
                System.out.print("grade: ");
                grade = input.nextInt();
                System.out.print("unit: ");
                unit = input.nextInt();
                sum += (grade * unit);
                totalUnit += unit;
            }
            avg = sum / totalUnit;
            // System.out.println(avg);
            totalAvg += avg;
            if (avg > maxAvg) {
                maxAvg = avg;
                maxStudentId = id;
            }
            if (avg < minAvg) {
                minAvg = avg;
                minStudentId = id;
            }
        } // end of first for
        totalAvg /= n;
        System.out.println("totalAvg: " + totalAvg);
        System.out.println("minAvg: " + minAvg + " id:" + minStudentId);
        System.out.println("maxAvg: " + maxAvg + " id:" + maxStudentId);
    }
}
