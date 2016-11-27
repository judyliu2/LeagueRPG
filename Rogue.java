//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-22

public class Rogue extends Character {

    private int energy; 
    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Rogue() {

	energy = 100;
	hp = 110;
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
    public Rogue( String n ) {
	this();
	name = n;
    }

    public void normalize(){
	strength = orig_strength;
	defense = orig_defense;
	energy += 5;
    }

    //A rogue uses specialize it has enough mana, else it regular attacks
    public int specialize(Character c){

	if (defense > 3){
	    defense -= 3;
	}
	
	if ( energy > 30 ){
	    hp +=2 ;
	    strength += 6;
	    energy -= 30;
	}
       
	return attack(c);
       
    }

    public  String about(){
	String retstr = "";
	retstr += "\n2: Rogue: \n \tHP: 110, Strength: 80, Defense: 30, Attack Rating: 0.4, Energy: 100";
	return retstr;
    }

}//end class
