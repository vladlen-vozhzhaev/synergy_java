package proxyChecker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

public class ProxyChecker {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ip.txt");
            int i;
            String socket = "";
            while ((i = fis.read()) != -1){
                if(i == 13) continue;
                else if (i == 10) {
                    String ip = socket.split(":")[0];
                    int port = Integer.parseInt(socket.split(":")[1]);
                    System.out.println("Проверяю: "+ip+":"+port);
                    Thread thread = new Thread(()->{
                        checkProxy(ip, port);
                    });
                    thread.start();
                    /*Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
                                URL url = new URL("https://vozhzhaev.ru/test.php");
                                HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
                                InputStream is = connection.getInputStream();
                                int i;
                                while ((i = is.read()) != -1){
                                    System.out.print((char) i);
                                }
                                System.out.println(" - Работает");
                            }catch (IOException e){
                                System.out.println(ip+":"+port+" не работает");
                            }
                        }
                    });
                    thread.start();*/
                    /*MyThreadProxy threadProxy = new MyThreadProxy(ip, port);
                    threadProxy.start();*/
                    /*Thread thread = new Thread(new MyThreadRunnableProxy(ip, port));
                    thread.start();*/
                    //checkProxy(ip, port);
                    socket = "";
                }else{
                    socket += (char) i;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    static void checkProxy(String ip, int port){
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
            InputStream is = connection.getInputStream();
            int i;
            while ((i = is.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println(" - Работает");
        }catch (IOException e){
            System.out.println(ip+":"+port+" не работает");
        }
    }
}


class MyThreadRunnableProxy implements Runnable{
    private String ip;
    private int port;

    public MyThreadRunnableProxy(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
            InputStream is = connection.getInputStream();
            int i;
            while ((i = is.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println(" - Работает");
        }catch (IOException e){
            System.out.println(ip+":"+port+" не работает");
        }
    }
}

/*class MyThreadProxy extends Thread{
    private String ip;
    private int port;

    public MyThreadProxy(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        super.run();
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
            InputStream is = connection.getInputStream();
            int i;
            while ((i = is.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println(" - Работает");
        }catch (IOException e){
            System.out.println(ip+":"+port+" не работает");
        }
    }
}*/
