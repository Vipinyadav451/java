public class math {
    static void main(String[] args) {
        int n = 121;
        int reverse = 0;
        for (int i = n; i > 0; i = i / 10) {
            int rem = i % 10;
            reverse = reverse * 10 + rem;
        }
        if (reverse == n) {
            System.out.println(n + " is a palindrome number");
        } else {
            System.out.println(n + " is not a palindrome number");
        }
        System.out.println("Reverse of " + n + " is " + reverse);
    }
}