//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-22


public class Marksman extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Marksman() {
	hp = 80;
	orig_strength = 110;
	orig_defense = 30;
	atkRating = .6;
	normalize();
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Marksman( String n ) {
	this();
	name = n;
    }

    public void normalize(){
	strength = orig_strength;
	defense = orig_defense;
    }

    public int specialize(Character c){
	int dmg = 0;
        if (Math.random() > .3){
	    dmg += attack(c);
	    dmg += attack(c);
	}
	else{
	    dmg += attack(c) / 2;
	    c.lowerHP(-1 * dmg);
	}
	return dmg;
    }

    public String about(){
	String retstr = "";
	retstr += "\n4: Marksman: \n \tHP: 80, Strength: 110, Defense: 30, Attack Rating: 0.6";
	return retstr;
    }
    
}
