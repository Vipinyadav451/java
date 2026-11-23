public class cal {
    // static void getarray(int arr[]) {

    // // int arr[]={8,9,4,2};
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // System.out.println("print the arrays" + arr[i]);
    // }
    // }
    static int[] getsum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return new int[] { sum };
    }

    // calculate the average of given array
    static double getaverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        System.out.println(average);
        return average;
    }

    // print even number in array
    static void getevenOrodd(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("even number : " + arr[i]);
            }

            else {
                System.out.println("odd number : " + arr[i]);
            }
        }
    }

    // search a given number in array
    static boolean getsearch(int arr[]) {
        int target = 6;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                // javac cal.java
                // System.out.print("given number is fond : ");
                return true;
            }
        }
        return false;

    }
    // count given nuber in array is positive or negative

    static int[] getcount(int arr[]) {
        int pcount = 0;
        int ncount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pcount++;
            } else {
                ncount++;
            }
        }
        int res[] = { pcount, ncount };
        return res;

    }

    // second largest element in array
    static int getsecondLargest(int arr[]) {
        int max = arr[0];
        int secmax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            }

            if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];
            }
        }

        return secmax;
    }

    // find dduplicate elements in array
    static void getduplicate(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    // sort array in ascending order
    static void getsortA(int arr[]) {
        // int i=0;
        // int j=i+1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            for (int i = 0; i < arr.length; i++) {

            }
        }
    }

    static void main(String[] args) {
        int[] arr = { 2, 3, 5, 3, 2, 6, 7, 8, 90 };
        getduplicate(arr);

        // int res = getsecondLargest(arr);
        // System.out.println("second largest " + res);
        // Syst//em.out.println("positive count : " + res[0]);
        // System.out.println("negative count : " + res[1]);

        // getaverage(arr);
        // getevenOrodd(arr);
        // getsearch(arr);
        // int[] res = getsum(arr);
        // getarray(arr);
        // System.out.println(res[0]);

    }
}
