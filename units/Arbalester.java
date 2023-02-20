package units;

public class Arbalester extends Shooter {

    public Arbalester(){
        super("Arbalester", "Mikle", 100, 200, 20, 3, 1, 
        1000, 3300, "Arbalest", 95);
        
    }


    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Арбалетчик"; }

}
