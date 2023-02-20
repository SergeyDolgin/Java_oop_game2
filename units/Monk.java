package units;

/**Монах*/
public class Monk extends Priest {

    public Monk(){
        super("Monk______", "Polit", 900, 555, 30, 5, 1,
         1000, 2222, 555);
        
    }


    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Монах ";}

}