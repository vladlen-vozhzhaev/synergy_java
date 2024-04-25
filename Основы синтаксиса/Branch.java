import java.util.Scanner;

public class Branch {
    public static void main(String[] args) {
        boolean a = (true || false) && false;
        boolean b = (false || false) && true || true;
        // false && true = false
        System.out.println(b); // true


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        if (login.equals("admin") && pass.equals("123")){
            System.out.println("Доступ разрешен для ADMIN");
        }else if(login.equals("user") && pass.equals("321")){
            System.out.println("Доступ разрешен для USER");
        }else{
            System.out.println("Доступ запрещен");
        }*/

        /*System.out.println("Введите число:");
        int a = scanner.nextInt();
        System.out.println("Введите число:");
        int b = scanner.nextInt();
        if (a>b){
            System.out.println("Число "+a+" больше "+b);
        }else{
            System.out.println("Число "+b+" больше, либо равно "+a);
        }*/
    }
}
