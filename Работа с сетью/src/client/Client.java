package client;
// YoOQ19CcIQN&
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 9123);
            Scanner scanner = new Scanner(System.in);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream is = new DataInputStream(socket.getInputStream());
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true){
                            String response = is.readUTF();
                            System.out.println(response);
                        }
                    }catch (IOException e){
                        System.out.println("Потеряно соединение с сервером");
                    }
                }
            });
            thread.start();
            while (true){
                String msg = scanner.nextLine();
                out.writeUTF(msg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
