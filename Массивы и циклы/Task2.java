/*
* Имеется набор символов String[] chars {"К", "Л", "М", "Н"};
* Задача:
* 1) Составить все возможные комбинации 4х символьных слов из этих символов
* 2) Все строки должны быть пронумерованы от 1 до N
* 3) Вывести на экран номер строки на которой находится слово "МЛКН"
* */
public class Task2 {
    public static void main(String[] args) {
        String[] chars = {"К", "Л", "М", "Н"};
        int number = 1;
        int findNum = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < chars.length; k++) {
                    for (int l = 0; l < chars.length; l++) {
                        String word = chars[i]+chars[j]+chars[k]+chars[l];
                        if(word.equals("МЛКН")){
                            findNum = number;
                        }
                        System.out.println((number++)+") "+word);
                    }
                }
            }
        }
        System.out.println("Строка МЛКН находится на строке "+findNum);
    }
}
