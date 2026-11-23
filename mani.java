// public class mani {
// static void getreverse(int arr[]) {
// int n = arr.length;
// int i = 0;

// int j = n - 1;
// while (i <= j) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// i++;
// j--;
// }
// for (int k : arr) {
// System.out.println(k);
// }

// }

// static void main(String[] args) {
// int arr[] = { 1, 2, 4, 5, 3, 6 };
// getreverse(arr);
// }
// }
public class mani {
    static void getreverse(int arr[]) {
        // two pointer technique
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }

    // right sift by 1 position every element
    static void getsift(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

    }

    // find out intersection of array
    static void getintersection(int arr[], int arr1[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    // sort of an array 0es, and ones:
    static int[] getsort(int arr[]) {
        // using two pointer method
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        if (arr[i] == 0) {
            i++;
        }
        if (arr[j] == 1) {
            j--;
        }

        return arr;
    }

    static void main(String[] args) {
        int arr[] = { 0, 0, 1, 0, 1, 0, 0, 1, 1, 1 };
        int ans[] = getsort(arr);
        System.out.println(ans);
        // int arr1[] = { 3, 5, 6, 2, 4 };
        // getsift(arr);
        // getintersection(arr, arr1);
        // for (int a : arr) {
        // System.out.println(a + " ");
        // }
    }
}
