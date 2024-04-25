package animals;

public class Cat extends Animal {
    public Cat(String nickname, int age, String breed) {
        super(nickname, age, breed);
    }

    public void run(){
        System.out.println(this.getNickname()+" побежал(а)");
    }
}
