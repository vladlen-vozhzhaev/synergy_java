package animals;

public class Pegasus extends Animal{
    public Pegasus(String nickname, int age, String breed) {
        super(nickname, age, breed);
    }
    public void fly(){
        System.out.println(this.getNickname()+" полетел(а)");
    }
}
