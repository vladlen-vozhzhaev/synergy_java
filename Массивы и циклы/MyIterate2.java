public class MyIterate2 {
    public static void main(String[] args) {
        String[] cars = {"bmw", "audi", "kia", "vaz"};
        /*for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            break;
        }*/
        for(String car : cars){
            System.out.println(car.toUpperCase());
        }
    }
}
