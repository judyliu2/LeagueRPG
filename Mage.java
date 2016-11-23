//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-22

public class Mage extends Character {

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

    public  void normalize(){
	strength = orig_strength;
	defense = orig_strength;
    }

    public void specialize(){
	strength +=2;
	defense -= 2;
    }

    public String about(){
	String retstr = "";
	retstr += "\n1: Mage: \n \tHP: 100, Strength: 80, Defense: 30, Attack Rating: 0.5";
	return retstr;
    }

}//end class
