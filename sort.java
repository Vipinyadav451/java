//sort the element in ascending order 
public class sort {
    static void getsort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }

    // sort element in descending order
    static void getsortDecending(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }

    // find the frequency of elements in given array
    static void getfrequncy(int arr[]) {

    }

    static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 2, 4, 5, 2, 4, 2 };
        getsort(arr);
        getsortDecending(arr);
        // for (int k : arr) {
        // System.out.println(k);
        // }
    }
}