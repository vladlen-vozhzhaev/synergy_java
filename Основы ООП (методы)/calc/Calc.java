package calc;

import java.util.Scanner;

public class Calc {
    int a;
    int b;
    String param; // "+", "-", "*", "/"
    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void handlerCommand(){
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оператор: + - * /");
        this.param = scanner.nextLine();
        if(this.param.equals("+")){
            result = this.summ(this.a, this.b);
        }else if(this.param.equals("-")){
            result = this.subtract(this.a, this.b);
        }else if (this.param.equals("*")) {
            result = this.mult(this.a, this.b);
        }else if(this.param.equals("/")){
            result = this.division(this.a, this.b);
        }else{
            System.out.println("Неверный оператор");
            return;
        }
        System.out.println("Результат: "+result);
    }
    double summ(int a, int b){
        return a+b;
    }
    double subtract(int a, int b){
        return a-b;
    }
    double mult(int a, int b){
        return a*b;
    }
    double division(int a, int b){
        if(b == 0){
            System.out.println("Делить на ноль нельзя!");
            return 0;
        }else{
            return a/b;
        }
    }
}
