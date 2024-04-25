package multithread;

public class MultiThread {
    public static void main(String[] args) {
        /*MyThread myThread1 = new MyThread("1");
        MyThread myThread2 = new MyThread("2");
        MyThread myThread3 = new MyThread("3");
        myThread1.start();
        myThread2.start();
        myThread3.start();*/
        /*MyRunnableClass myRunnableClass1 = new MyRunnableClass("1");
        Thread thread1 = new Thread(myRunnableClass1);
        Thread thread2 = new Thread(new MyRunnableClass("2"));
        Thread thread3 = new Thread(new MyRunnableClass("3"));
        thread1.start();
        thread2.start();
        thread3.start();*/
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("ЗАДАЧА №1 -" + i + "%");
                }
            }
        });
        Thread thread2 = new Thread(()->{
            for (int i = 1; i <= 100; i++) {
                System.out.println("ЗАДАЧА №2 -" + i + "%");
            }
        });
        Thread thread3 = new Thread(()->{
            for (int i = 1; i <= 100; i++) {
                System.out.println("ЗАДАЧА №3 -" + i + "%");
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyRunnableClass implements Runnable{
    public String task;

    public MyRunnableClass(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("ЗАДАЧА №"+task+" - " + i + "%");
        }
    }
}

class MyThread extends Thread{
    public String task;

    public MyThread(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 100; i++) {
            System.out.println("ЗАДАЧА №"+task+" - " + i + "%");
        }
    }
}