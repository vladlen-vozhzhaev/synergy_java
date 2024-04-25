import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        /*String cars[] = {"bmw", "audi", "kia"};
        try {
            System.out.println(cars[0]);
            System.out.println(cars[4]);
            System.out.println(cars[2]);
        }catch (Exception e){
            e.printStackTrace();
        }*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        System.out.println("Введите число:");
        int b = scanner.nextInt();
        try {
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println("Делить на ноль нельзя");
        }*/
        try {
            URL url = new URL("https://vozhzhaev.ru");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Программа завершена");
    }

    /*static void f(){
        f();
    }*/
}
