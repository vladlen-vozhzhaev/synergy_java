package hotel;

import java.util.Scanner;

public class Hotel {
    private Room[] rooms = {
            new Room(11, true, false, 2),
            new Room(12, false, false, 1),
            new Room(13, true, true, 1),
            new Room(21, true, true, 3),
            new Room(22, false, false, 2),
            new Room(23, true, true, 2),
            new Room(31, false, true, 4),
            new Room(32, true, true, 4),
            new Room(33, false, false, 3)
    };
    public void getFreeRooms(){
        // Показываем свободные комнаты
        for (Room room : rooms){
            if(!room.isReserved()){
                System.out.println(room.getNumber());
            }
        }
    }
    public void reserve(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер комнаты для бронирования: ");
        int number = scanner.nextInt();
        for(Room room : rooms){
            if(room.getNumber() == number){
                room.setReserved(true);
            }
        }
    }
    public void free(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер комнаты:");
        int number = scanner.nextInt();
        for(Room room : rooms){
            if(room.getNumber() == number){
                room.setReserved(false);
            }
        }
    }
    public void filter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нужен ли гостю телевизор?");
        String answer = scanner.nextLine();
        System.out.println("Сколько нужно спальных мест?");
        String stringPlace = scanner.nextLine();
        int place = Integer.parseInt(stringPlace);
        boolean tv = false;
        if(answer.equals("да")){
            tv = true;
        }
        for (Room room : rooms){
            if(((room.isTv() && tv) || (!room.isTv() && !tv)) && room.getPlace() == place){
                System.out.println(room.getNumber());
            }
        }
    }
}
