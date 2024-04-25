import java.util.Scanner;

public class Friendly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        System.out.println("Введите число:");
        int b = scanner.nextInt();
        System.out.println("Результат сложения:");
        System.out.println(a/b);
    }
}
