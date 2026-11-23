public class dsa {
    // search an element in array
    // static boolean getcheck(int[] arr, int target) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == target) {
    // return true;
    // }

    // }
    // return false;

    // }
    // max element in array
    // static int getmax(int arr[]) {
    // int max = arr[0];
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // }
    // return max;
    // }
    // return sum of positive sum and negative sum
    // static int[] getsum(int arr[]) {
    // int psum = 0;
    // int nsum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > 0) {
    // psum += arr[i];
    // } else {
    // nsum += arr[i];
    // }
    // }
    // int ans[] = { psum, nsum };

    // return ans;
    // }
    //
    // find unsorted array
    // static int getunsorted(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i + 1] <= arr[i]) {
    // return arr[i];
    // }
    // }
    // return -1;

    // }
    static int[] getaltrnate(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        return arr;
    }

    // reverse array
    static void getreverse(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int l = 0; l < arr.length; l++) {
            System.out.println(arr[l]);
        }
    }

    // find duplicate in array
    static void getduplicate(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    // find sec smallest number in given array
    static void getsecsmall(int arr[]) {
        int small = arr[0];
        int secsmall = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];

            }
            if (arr[i] < secsmall && arr[i] != small) {
                System.out.println("second smallest element is : " + arr[i]);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 1, };
        // getduplicate(arr);
        // getrev(arr);
        getsecsmall(arr);

        // System.out.println(getcheck(arr, 05));
        // System.out.println(ans);
        // int res[] = getcount(arr);
        // System.out.println("zero count " + res[0]);
        // System.out.println("one count " + res[1]);
    }

    static void getrev(int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}