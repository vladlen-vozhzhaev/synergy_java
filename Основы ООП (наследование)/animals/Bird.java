package animals;

public class Bird extends Animal{
    public Bird(String nickname, int age, String breed) {
        super(nickname, age, breed);
    }
    public void fly(){
        System.out.println(this.getNickname()+" полетел(а)");
    }
}
