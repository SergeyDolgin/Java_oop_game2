package units;

public class Raider extends Warrior {

  

    public Raider(){
        super("Raider____", "Piter", 100, 300, 60, 3, 1, 
        2000, 3000, "Knife", 5000);
        
    }


    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Разбойник";}

}