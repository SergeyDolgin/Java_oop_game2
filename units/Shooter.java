package units;

public class Shooter extends BaseHero{
    /**Боеприпасы*/
    protected int ammunition;
    protected String gun;
    /**Меткая стрельба*/
    protected int markmanship;

    public Shooter(String hero, String name, int health, int endurance, int speed, int life, 
        int level, int money, int ammunition, String gun, int markmanship) {
        super(hero, name, health, endurance, speed, life, level, money);
        this.ammunition = ammunition;
        this.gun = gun;
        this.markmanship = markmanship;
    }

    
    public String getInfo() {
        return String.format("%s Ammunition: %d Gun: %s Markmanship: %d", 
        super.getInfo(), this.ammunition, this.gun, this.markmanship);       
    }

    /**Делать выстрел */
    public void GetShoot(int shoot) { // Можно сделать через рандом если меткость 1 то попал если 0, то нет
        if (this.life - shoot > 0) {
            this.life -= shoot;
        }
        // else { die(); }
    }

    protected boolean aiming() {
        if (endurance < 100) {
            return false;
        }
        else return true;
    }

    @Override
    public void die() {
        // TODO Auto-generated method stub
        
    }

    
}