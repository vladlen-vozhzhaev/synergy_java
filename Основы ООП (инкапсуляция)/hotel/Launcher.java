package hotel;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите команду: ");
            String command = scanner.nextLine();
            if(command.equals("/getFreeRooms")){
                hotel.getFreeRooms();
            } else if (command.equals("/reserve")) {
                hotel.reserve();
            } else if (command.equals("/filter")) {
                hotel.filter();
            } else if (command.equals("/exit")){
                break;
            }
        }
    }
}
