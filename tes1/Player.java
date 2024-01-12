
public class Player {

    //atribut
    String name;
    int speed;
    int damage;
    int defense;
    int healtpoint;

    //method run
    void run(){
        System.out.println(name+" is runing...");
        System.out.println("speed: "+ speed);
        System.out.println("has damage of  " + damage + " and has armor as big as " + defense);
    }

    // metode isDead untuk cek nilai kesehatan(healtpoint)
    boolean isDead(){
        if(healtpoint <= 0) return true;
        return false;
    }
}