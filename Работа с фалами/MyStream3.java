import java.io.*;

public class MyStream3 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*try {
            FileInputStream fis = new FileInputStream("test.txt");
            int i;
            while ((i = fis.read()) != -1){
                System.out.print( (char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
