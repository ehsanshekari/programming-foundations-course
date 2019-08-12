public class Main {

    public static void main(String[] args) {

        double[] grades = {12, 17, 15.5, 18.25};

        double avg = 0;

        for (int i = 0; i < grades.length; i++) {
            avg += grades[i];
        }

        avg /= grades.length;

        System.out.println("avg is: " + avg);

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= avg) {
                System.out.println("higher than avg: " + grades[i]);
            } else {
                System.out.println("lower than avg: " + grades[i]);
            }
        }

    }
}
