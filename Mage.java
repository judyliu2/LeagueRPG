//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-22

public class Mage extends Character {
    
    int mana;

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Mage() {
	hp = 100;
	orig_strength = 90;
	orig_defense = 30;
	atkRating = .4;
	normalize();
	mana = 100;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Mage( String n ) {
	this();
	name = n;
    }

    public void normalize(){
        if (Math.random() > .9){
	    mana = 100;
	}
	defense = orig_defense;
	orig_strength += 10;
	strength = orig_strength;
    }

    public int specialize(Character c){
	int dmg = 0;
	dmg += attack(c);
        if (mana >= 25){//if there is at least 25 mana
	    c.lowerHP(25);
	    dmg += 25;
	    mana -= 25;
	}
	return dmg;
    }

    public String about(){
	String retstr = "";
	retstr += "\n1: Mage: \n \tHP: 100, Strength: 80, Defense: 30, Attack Rating: 0.5, Mana: 100";
	return retstr;
    }

}//end class
