package units;

public class Priest extends BaseHero {
    protected int mana;
    protected int elixir; 


public Priest(String hero, String name, int health, int endurance, int speed, int life, int level, int money,int mana, int elixir) {
    super(hero, name, health, endurance, speed, life, level, money);
    this.elixir = elixir;
    this.mana = mana;
}

public String getInfo() {
    return String.format("%s Mana: %d Elixir: %d", super.getInfo(), this.mana, this.elixir); 
}



public void ChangeMana(int mana, int crop){

}
public void ChangeElixir(int elixir, int crop){
    
}
/**Исцелить */
public void GetHeal(int mana, int life){

}
/**Вылечить */
public void GetTreatment(int elixir, int health){

}     

public int getMana() {
    return mana;
}
public void setMana(int mana) {
    this.mana = mana;
}
public int getElixir() {
    return elixir;
}
public void setElixir(int elixir) {
    this.elixir = elixir;
}

@Override
public void die() {
    // TODO Auto-generated method stub
    
}


}
