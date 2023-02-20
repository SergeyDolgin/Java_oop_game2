package units;

import java.util.Random;

public abstract class BaseHero {
    protected String hero;
    protected String name;
    protected int health;
    /**Выносливость*/
    protected int endurance;
    protected int speed;
    protected int life;
    protected int level;
    protected int money;
    protected static Random r;



/**Конструктор который отвечает за инициализацию */
public BaseHero(String hero, String name, int health, int endurance, int speed, int life, int level, int money) {
    this.hero = hero;
    this.name = name;
    this.health = health;
    this.endurance = endurance;
    this.speed = speed;
    this.life = life;
    this.level = level;
    this.money = money;
}

/**Метод получения информации */
public String getInfo() {
    return String.format("Hero: %s Name: %s Health: %d Endurance: %d Speed: %d Life: %d Level: %d Money: %d",
            this.hero, this.name, this.health, this.endurance, this.speed, this.life, this.level, this.money, this.getClass().getSimpleName());           
}

/**Атакуем */
public void Attack(BaseHero target) {
    int damage = BaseHero.r.nextInt(10, 20);  // генерим случайное число урона
    target.GetDamage(damage);  // и передаем в метод GetDamage
}
public void GetDamage(int damage) {
    if (this.health - damage > 0) {
        this.health -= damage;
    }
    else { die(); }
}
public void die() {
    
System.out.printf("Hero: %s Name: %s is DEAD \n", this.hero, this.name); 
}
}
// Поведение - ходьба, бег, спать, атака, защита
// Лечить будем увеличением жизней