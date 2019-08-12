public class Main {

    public static void main(String[] args) {

        int[] a = {15, 2, 26, 8, 23, 4, 1, 5};
        int minIndex;
        int temp;

        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }

    }
}
