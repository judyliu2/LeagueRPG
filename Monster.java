//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-26

public class Monster extends Character {

    /*
      Default constructor
      initializes all values
     */
    public Monster() {
	hp = (int)(Math.random() * 20) + 80;
	orig_defense = 20;
	atkRating = 2;
	orig_strength = (int) (Math.random()*10) + 20;
	normalize();
    }

    
    public  void normalize(){
	strength = orig_strength;
	defense = orig_defense;
    }

    public int specialize(Character c){
	if ( Math.random() > .7 ){
	    strength += 1;
	    defense += 1;
	} else {
	    strength -= 1;
	    defense -= 1;
	}

	return attack(c);
    }

    public String about(){
	String retstr = "";
	retstr += "\nStats of Monster: \n \tHP: 80-179, Strength: 20-28, Defense: 20, Attack Rating: 2";
	return retstr;
    }

    
}
