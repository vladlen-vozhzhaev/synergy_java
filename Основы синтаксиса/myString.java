import java.util.Scanner;

public class myString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println( login.equals("admin") );

        //String name = scanner.nextLine();
        //System.out.println("Привет "+name+"!");
        //System.out.println(name.toUpperCase());
        //System.out.println(name.toLowerCase());

    }
}
