//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded
//2016-11-18


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

}
