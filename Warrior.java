//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded
//2016-11-18

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

}//end class Warrior

