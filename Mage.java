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
	orig_strength = 80;
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
	System.out.println(mana);
    }

    public int specialize(Character c){
	int dmg = 0;
        if (mana >= 25){//if there is at least 25 mana
	    dmg += attack(c);
	    dmg += c.lowerHP(5);
	    mana -= 25;
	}
	else{//else just use regular attack
	    dmg += attack(c);
	}
	return dmg;
    }

    public String about(){
	String retstr = "";
	retstr += "\n1: Mage: \n \tHP: 100, Strength: 80, Defense: 30, Attack Rating: 0.5, Mana: 100";
	return retstr;
    }

}//end class
