//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW31 -- Ye Olde Role Playing Game, improved
//2016-11-16

public class Monster extends Character {

    /*
      Default constructor
      initializes all values
     */
    public Monster() {
	hp = 150;
	orig_defense = 20;
	atkRating = 1;
	orig_strength = (int) (Math.random()*45) + 20;
	normalize();
    }
    
}
