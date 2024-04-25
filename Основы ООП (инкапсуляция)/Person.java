/* Значение hp не может превышать 100ед. */
public class Person {
    private String name;
    private String lastname;
    private int age;
    private int hp;
    static String type = "Человек";

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hp = 100;
    }

    public void setHp(int hp) {
        if(this.hp + hp >= 100){
            this.hp = 100;
        }else{
            //this.hp = this.hp + hp;
            this.hp +=  hp;
        }
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void sayHi(String name){
        System.out.println("Привет "+name+", меня зовут "+this.name);
    }

    void sayHi(){
        System.out.println("Привет, меня зовут "+this.name);
    }
    int getDamage(){
        int damage = 30;
        this.hp = this.hp - damage;
        return this.hp;
    }


}
