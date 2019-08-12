public class Main {

    public static void main(String[] args) {
        int[] a = {1, 5, 3, 7};
        int[] b = {9, 11, 3, 1, 15};
        int[] c = new int[4];
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[counter] = a[i];
                    counter++;
                }
            }
        }

        for (int i = 0; i < counter; i++) {
            System.out.println(c[i]);
        }

    }
}
