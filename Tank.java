//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded
//2016-11-18

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
    
}

