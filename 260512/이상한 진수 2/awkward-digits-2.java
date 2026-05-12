import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int[] arr = new int[a.length()];
        for (int i = 0; i < a.length(); i++)
            arr[i] = a.charAt(i) - '0';
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
            max = Math.max(trans(arr), max);
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        System.out.println(max);
    }
    public static int trans(int[] a) {
        int result = 0;
        int factor = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            result += factor * a[i];
            factor *= 2;
        }
        return result;
    }
}