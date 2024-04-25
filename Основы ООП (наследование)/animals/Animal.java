package animals;

abstract public class Animal{
    private String nickname;
    private int age;
    private String breed;

    public Animal(String nickname, int age, String breed) {
        this.nickname = nickname;
        this.age = age;
        this.breed = breed;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }
}
