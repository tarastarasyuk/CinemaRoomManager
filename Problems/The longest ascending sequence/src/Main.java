import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 1;
        int longest = 0;
        if (size != 1) {
            for (int i = 1; i < arr.length; i++) {
                if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
                    index++;
                    if (index < longest) {
                        break;
                    } else {
                        longest = index;
                        break;
                    }
                }
                if (arr[i] > arr[i - 1]) {
                    index++;
                } else {
                    if (index < longest) {
                        continue;
                    } else {
                        longest = index;
                    }
                    index = 1;
                }
            }
            System.out.println(longest);
        } else {
            System.out.println(1);
        }

    }
}