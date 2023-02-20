package units;

public class Warrior extends BaseHero {
    protected int power;
    //*Оружие */
    protected String weapon;
    protected int hit;


public Warrior(String hero, String name, int health, int endurance, int speed, int life, int level, int money, int power, String weapon, int hit) {
    super(hero, name, health, endurance, speed, life, level, money);
    this.power = power;
    this.weapon = weapon;
    this.hit = hit;
}

public String getInfo() {
    return String.format("%s Power: %d Weapon: %s Hit:%d", super.getInfo(), this.power, this.weapon, this.hit);
  
}

/**Наносить удар */
public void GetStrike(int strike) { // Можно сделать через рандом количество ударов
    if (this.endurance - strike > 0) {
        this.endurance -= strike;
    } 
    // else { die(); }
}

/**Грабить */
public void GetRob(int rob) {
    if (this.money - rob > 0) {
        this.money -= rob;
    }
    // else { no money(); }
}

@Override
public void die() {
    // TODO Auto-generated method stub
    
}



}