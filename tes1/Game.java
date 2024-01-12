public class Game {
    public static void main(String[] args){

        // membuat objek player
        Player enemy = new Player();
        enemy.name = "nafisha";
        enemy.speed = 80;
        enemy.healtpoint = 50;
        enemy.damage = 80;
        enemy.defense= 70;

        enemy.run();
        if (enemy.isDead()) {
            System.out.println(enemy.name + "has died");
        } else {
            System.out.println(enemy.name + " is still alive with " + enemy.healtpoint + " healt points. ");
        }

        Player hero = new Player();
        // mengisi atribut player
        hero.name = "atha";
        hero.speed = 78;
        hero.healtpoint = 100;
        hero.damage = 50;
        hero.defense= 25;

        hero.run();

        if (hero.isDead()) {
            System.out.println(hero.name + "has died!");
        } else {
            System.out.println(hero.name + " is still alive with " + hero.healtpoint + " healt points. ");
        }


        if(hero.isDead()){
            System.out.println("Game Over!");
        }

    }
}