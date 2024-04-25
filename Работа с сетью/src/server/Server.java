package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        ArrayList<Socket> sockets = new ArrayList<>();
        try {
            ServerSocket serverSocket = new ServerSocket(9123);
            System.out.println("Сервер запущен");
            while (true){
                Socket socket = serverSocket.accept(); // Ожидаем подключения
                sockets.add(socket); // Сохраняем подключившегося клиента в коллекцию
                System.out.println("Клиент подключился");
                DataInputStream is = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            out.writeUTF("Введите имя: ");
                            String name = is.readUTF();
                            while (true){
                                String msg = is.readUTF();
                                System.out.println( msg );
                                for(Socket socket1 : sockets){
                                    DataOutputStream out = new DataOutputStream(socket1.getOutputStream());
                                    out.writeUTF(name+": "+msg);
                                }
                            }
                        }catch (IOException e){
                            System.out.println("Клиент отключился");
                            sockets.remove(socket);
                        }
                    }
                });
                thread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
