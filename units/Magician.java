package units;

/**Колдун*/
public class Magician extends Priest {

    public Magician(){
        super("Magician__", "Harry", 300, 300, 99, 5, 1, 1500, 2000, 2000); 
    }


   
    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Колдун";}

}
