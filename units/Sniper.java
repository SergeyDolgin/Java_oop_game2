package units;

public class Sniper extends Shooter {

    public Sniper(){
        super("Sniper____", "Eagle", 100, 200, 70, 3, 1,
         1000, 3333, "Rifle", 90);
             
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Снайпер";}

}