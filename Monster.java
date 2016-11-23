//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-22

public class Monster extends Character {

    public  void normalize(){
	strength = orig_strength;
	defense = orig_strength;
    }

    public void specialize(){
	strength += 1;
	defense -= 1;
    }

    public String about(){
	String retstr = "";
	retstr += "\nStats of Monster: \n \tHP: 150, Strength: 20-65, Defense: 20, Attack Rating: 1";
	return retstr;
    }

    /*
      Default constructor
      initializes all values
     */
    public Monster() {
	hp = 150;
	orig_defense = 20;
	atkRating = 1;
	orig_strength = (int) (Math.random()*45) + 20;
	normalize();
    }
    
}
