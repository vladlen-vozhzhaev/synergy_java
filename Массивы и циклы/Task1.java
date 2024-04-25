/*
Задача 1
Найти среднее арифметическое значение массива
int[] marks = {4,5,4,4,3,4,5,5,5};
Задача 2
Найти максимальный нечетный элемент для массива
int[] nums = {34,25,345,234,36,234,5,32,42,342};
int[] nums = {-34,-25,-345,-234,-36,-234,-5,-32,-42,-342};
* */
public class Task1 {
    public static void main(String[] args) {
        int[] nums = {-34,-25,-345,-234,-36,-234,-5,-32,-42,-342};
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max && nums[i]%2 != 0){
                max = nums[i];
            }
        }
        System.out.println(max);

        /*int[] marks = {4,5,4,5,5,4,5,5,5};
        double summ = 0;
        for (int i = 0; i < marks.length; i++) {
            summ = summ + marks[i];
        }
        System.out.println(Math.round(summ / marks.length));*/
    }
}
