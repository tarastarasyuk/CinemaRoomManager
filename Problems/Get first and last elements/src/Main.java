import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] numbers) {
        int[] newArr = new int[2];
        newArr[0] = numbers[0];
        newArr[1] = numbers[numbers.length - 1];
        return newArr;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}