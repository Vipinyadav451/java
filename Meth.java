public class Meth {
    // second largest number
    // int max=arr[0];
    // int secmax=arr[0];
    int getsecmax(int arr[]) {
        int max = 0;
        int secmax = 0;
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

    // reverse of array
    int[] getreverse(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return arr;
    }

    // type casting in java
    static void getcasting() {
        // implict typecasting
        byte b = 6;
        int c = b;
        System.out.println("casting is :" + c);
        // explicit typecasting
        double u = 8.93;
        byte m = (byte) (short) (int) (float) (long) u;
        System.out.println("explicit typecasting is: " + m);
        char k = 'a';
        int v = (int) k;
        System.out.println(v);
        // ncreament anddecrement oprator
        int f = 12;
        int x = 40;
        System.out.println("post increment : " + f++);
        System.out.println("pre increment : " + ++f);
        System.out.println("post decrement : " + f--);
        System.out.println("pre decrement : " + --f);

    }

    static void main(String[] args) {
        getcasting();
        // int arr[] = { 8, 4, 6, 2, 9, 5 };
        // Meth m = new Meth();
        // int ans[] = m.getreverse(arr);// instanse method calling
        // // System.out.println("secmax : " + ans);
        // for (int k : ans) {
        // System.out.println(k);
        // }
    }
}