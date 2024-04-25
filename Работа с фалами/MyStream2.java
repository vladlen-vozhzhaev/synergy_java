import java.io.*;

public class MyStream2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt", true);
            fw.append("!");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*String str = "\nHello!";
        byte[] buff = str.getBytes();
        try {
            FileOutputStream out = new FileOutputStream("test.txt", true);
            out.write(buff);
            System.out.println("Файл успешно записан!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
