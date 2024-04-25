package animals;

public final class Horse extends Animal{
    public Horse(String nickname, int age, String breed) {
        super(nickname, age, breed);
    }
    public void run(){
        System.out.println(this.getNickname()+" побежал(а)");
    }
}
