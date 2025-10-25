package cis3270.assignment1.chapter7;
public class Q18 {
    public static void main(String[] args) {
        int array[] = {4, 7, 9, 5, 6, 1, 2, 8, 3, 10};

        for (int v: bubbleSort(array)) {
            System.out.println(v + " ");
        }
    }
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j+1]) {
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        return array;
    }
}
