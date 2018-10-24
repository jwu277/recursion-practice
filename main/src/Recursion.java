import java.util.Arrays;

public class Recursion {

    /**
     * Computes the factorial of a given number
     * @param n >= 0
     * @return n!
     */
    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }

    }

    public static int sumOfArray(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }
        else {
            return arr[0] + sumOfArray(Arrays.copyOfRange(arr, 1, arr.length));
        }

    }

    /**
     *
     * @param n >= 0
     * @return
     */
    public static int recaman(int n) {

        if (n == 0) {
            return 0;
        }

        int sub = recaman(n - 1);

        return ((sub - n > 0) && !alreadyInRecaman(sub - n, n)) ? sub - n : sub + n;

    }

    private static boolean alreadyInRecaman(int val, int n) {

        if (n == 0) {
            return false;
        }
        else {
            return (val == recaman(n - 1)) || alreadyInRecaman(val, n - 1);
        }

    }

    /**
     *
     * @param n >= 0
     * @return
     */
    public static int McCarthy91(int n) {

        if (n > 100) {
            return n - 10;
        }
        else {
            return McCarthy91(McCarthy91(n + 11));
        }

    }

    /**
     *
     * @param n >= 1
     * @return
     */
    public static int fibonacci(int n) {

        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

}
