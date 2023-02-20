package units;

public class Villager extends Warrior {
    /**Семена */
    protected int seeds;
    /**Урожай */
    protected int crop;

    public Villager() {
        super("Villager__", "Green", 300, 300, 20, 3, 1, 
        2000, 3333, "Shovel", 90);
        this.seeds = 500;
        this.crop = 500;
    }

    public String addInfo() {
        return String.format("%s Seeds: %d Crop: %d", this.seeds, this.crop);      
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() {return "Я Крестьянин ";}



/**Поменять урожай на деньги, здоровье, ману*/
public void ChangeCrop(int crop) {}

/**Продать уражай */
public void SellCrop(int crop, int money){}

/**Посадить урожай */
public void PlantCrop(int seeds, int tool){}

/**Собрать урожай */
public void GatherCrop(int crop, int tool){}

}
