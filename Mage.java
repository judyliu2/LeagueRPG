//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded
//2016-11-18

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

}//end class
