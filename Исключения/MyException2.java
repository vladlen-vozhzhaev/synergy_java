import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class MyException2 {
    public static void main(String[] args) throws Exception {
        print("Hello");
    }
    static void connect() throws IOException {
        URL url = new URL("https://vozhzhaev.ru");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    }
    static void print(String msg) throws Exception {
        if(msg.charAt( msg.length()-1 ) == "!".charAt(0))
            System.out.println(msg);
        else
            throw new Exception("Сообщение не содержит символ !");

    }
}
