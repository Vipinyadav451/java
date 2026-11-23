public class secmax {
    static void getsecmax(int arr[]) {
        int max = arr[0];
        int secmax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                secmax = max;
                max = arr[i];
                // System.out.println("max : " + max);

            }
            if (arr[i] < secmax && arr[i] != max) {
                secmax = arr[i];
                // System.out.println("second max : " + secmax);
            }
        }
        System.out.println("max : " + max);
        System.out.println("second max : " + secmax);

        // System.out.println(arr);

    }

    static void getsecsmall(int arr[]) {
        int small = arr[0];
        int secsmall = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                secsmall = small;
                small = arr[i];
                // System.out.println("max : " + max);

            }
            if (arr[i] < secsmall && arr[i] != small) {
                secsmall = arr[i];
                // System.out.println("second max : " + secmax);
            }
        }
        System.out.println("small : " + small);
        System.out.println("second small : " + secsmall);

        // System.out.println(arr);

    }

    static void main(String[] args) {
        int arr[] = { 2, 5, 3, 7, 6, 9, 8 };
        // System.out.println( getsecmax(arr));
        getsecsmall(arr);
        // System.out.println(arr);

    }
}
