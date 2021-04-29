import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        line1 = line1.replaceAll(" ", "");
        line2 = line2.replaceAll(" ", "");
        System.out.println(line1.equals(line2));
    }
}
