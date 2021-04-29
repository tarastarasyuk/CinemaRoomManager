import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int n = sc.nextInt();
        for (int a : arr) {
            if (a == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}