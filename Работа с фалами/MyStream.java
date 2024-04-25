import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyStream {
    public static void main(String[] args) throws Exception{
        /*String str = "Hello";
        byte[] buff = str.getBytes();
        ByteArrayInputStream is = new ByteArrayInputStream(buff);
        int i;
        while ((i = is.read()) != -1){
            System.out.print( (char) i );
        }*/
        URL url = new URL("https://google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        InputStream inputStream = connection.getInputStream();
        int i;
        while ( (i = inputStream.read()) != -1 ){
            System.out.print( (char) i );
        }
    }
}
