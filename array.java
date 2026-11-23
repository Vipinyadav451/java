//calculate array average
public class array {
    // static double getAverage(int[] arr) {
    // double sum = 0;
    // for (int i : arr) {
    // sum += i;
    // }
    // int size = arr.length;
    // double avg = sum / size;
    // return avg;
    // }

    // static void main() {
    // int[] arr = { 2, 4, 1, 3 };
    // System.out.println(getAverage(arr));
    // }
    // multiply each element of array by 10;
    // int mul=1;
    static int[] multiply(int[] arr) {
        int size = arr.length;
        int newArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArr[i] = newElement;
        }
        return newArr; // or return the modified array if needed
    }

    // leaner search
    // static boolean check(int arr[],int tar)

    static void main() {
        int arr[][] = { { 7, 8 }, { 8, 9 } };
        int brr[][] = { { 6, 5 }, { 9, 4 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + brr[i][j]);
            }
            System.out.println("   ");
        }
        // int[] arr = { 2, 4, 1, 3 };
        // int[] result = multiply(arr);
        // System.out.println("printing modified array: ");
        // for (int i : result) {
        // System.out.println(i);
        // } // Print the modified array
    }

}