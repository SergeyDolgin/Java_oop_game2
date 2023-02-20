package units;

/**Копейщик */
public class Spearman extends Warrior {

     public Spearman(){
        super("Spearman__", "Bredy", 100, 250, 40, 3, 1,
         2000, 3000, "Spear", 5000); 
    }



    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Копейщик ";}

}
