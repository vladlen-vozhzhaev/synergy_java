package calc;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите число a: ");
            int a = scanner.nextInt();
            System.out.println("Введите число b: ");
            int b = scanner.nextInt();
            Calc calc = new Calc(a, b);
            calc.handlerCommand();
        }
    }
}
