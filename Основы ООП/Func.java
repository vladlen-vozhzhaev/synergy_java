public class Func {
    public static void main(String[] args) {
        int a = f(7);
        System.out.println(a);
        System.out.println( f(5) );
    }
    static void sayHi(){
        System.out.println("Hello world!");
    }
    static int f(int a){
        return (a*a);
    }
}