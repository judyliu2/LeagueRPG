//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW35 -- Ye Olde Role Playing Game, Realized
//2016-11-28

public class Tank extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Tank() {
	hp = 150;
	orig_strength = 70;
	orig_defense = 50;
	atkRating = .3;
	normalize();
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Tank( String n ) {
	this();
	name = n;
    }

    public void normalize(){
	orig_strength += 5;
	strength = orig_strength;
	defense = orig_defense;
    }

    //Special attack: hit with massive power, then lose defense
    public int specialize(Character c) {
	defense -= 3;
	atkRating += .1;
	return attack(c);
    }

    public String about(){
	String retstr = "";
	retstr += "\n3: Tank: \n \tHP: 150, Strength: 70, Defense: 50, Attack Rating: 0.3";
	return retstr;
    }
}

