package Inheritance;

public class GameCharacter {
    void move(){
        System.out.println("Character is moving");
    }

    void attack(){
        System.out.println("Attack...");
    }

    void defend(){
        System.out.println("Defend...");

    }
}
class Warrior extends GameCharacter{
    void useSward(){

        //dependency created inside in the method .

        GameCharacter ob= new GameCharacter();
        ob.move();
        ob.attack();
        ob.defend();
        System.out.println("Use sward.");
    }
}
class Archer extends GameCharacter{
    void shootArrow(){
        Warrior ob2=new Warrior();
        ob2.useSward();
        System.out.println("Arrow Shooting...");
    }

    void hide(){
        System.out.println("Hide....");
    }
}
class Wizard extends GameCharacter{
    void castSpell(){
        System.out.println("Spelling...");
    }

    void teleport(){
        System.out.println("Teleporting...");
    }

    public static void main(String[] args) {
        Wizard ob1= new Wizard();
        ob1.castSpell();
        ob1.teleport();

        Archer ob3= new Archer();
        ob3.shootArrow();
        ob3.hide();
    }
}
