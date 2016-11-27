//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-22

public class Warrior extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Warrior() {
	hp = 125;
	orig_strength = 100;
	orig_defense = 40;
	atkRating = .4;
	normalize(); //sets strength and defense
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Warrior( String n ) {
	this();
	name = n;
    }

    public void normalize(){
	strength = orig_strength;
	defense = orig_strength;
    }

    //Special attack: one massive attack, then lose stats
    public int specialize(Character c){
	strength += 20;
	int dmg = attack(c);
	strength -= 25;
	defense -= 5;
	return dmg;
    }

    public String about(){
	String retstr = "";
	retstr += "\n0:  Warrior: \n \tHP: 125, Strength: 100, Defense: 40, Attack Rating: 0.4";
	return retstr;
    }

}//end class Warrior

