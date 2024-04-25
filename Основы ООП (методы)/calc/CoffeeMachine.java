package calc;
/*
* Имеется автомат продающий кофе, после приготовления напитка автомат должен выдать сдачу
* Сдача выдаётся монетами номиналом российских рублей [1,2,5,10]
* Задача:
* Реализовать метод принимающий в качестве параметра число (сдача) которое необходимо разложить на монеты
* и напечатать результат на экран
* Например: 38
* Результат: 10 10 10 5 2 1
*
* */
public class CoffeeMachine {
    public static void main(String[] args) {
        getChange(23);
    }
    static void getChange(int number){
        //int coin = (number>=10)?10:(number>=5)?5:(number>=2)?2:(number>=1)?1:0;
        int coin = 0;
        if(number >= 10) coin = 10;
        else if(number >= 5) coin =  5;
        else if (number >= 2) coin = 2;
        else if(number >= 1) coin = 1;

        if(coin != 0){
            System.out.println(coin);
            getChange(number - coin);
        }
    }
}
