//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-22

public class Monster extends Character {

    /*
      Default constructor
      initializes all values
     */
    public Monster() {
	hp = (int)(Math.random() * 20) + 80;
	orig_defense = 20;
	atkRating = 1;
	orig_strength = (int) (Math.random()*3) + 20;
	normalize();
    }

    
    public  void normalize(){
	strength = orig_strength;
	defense = orig_strength;
    }

    public int specialize(Character c){
	if ( Math.random() > .7 ){
	    strength += 5;
	    defense += 2;
	}
	
	else {
	strength += 1;
	defense -= 1;
	}

	return attack(c);
    }

    public String about(){
	String retstr = "";
	retstr += "\nStats of Monster: \n \tHP: 80-179, Strength: 20-23, Defense: 20, Attack Rating: 1";
	return retstr;
    }

    
}
