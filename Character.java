//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW32 -- Ye Olde Role Playing Game, Expanded
//2016-11-18

public class Character {
    
    protected int hp, strength, defense;
    protected double atkRating;
    protected int orig_strength;
    protected int orig_defense;
    protected String name;

    public boolean isAlive() {
	return hp > 0;
    }

    public int getDefense() {
	return defense;
    }
    
    public int lowerHP(int amt) {
	hp -= amt;
	return hp;
    }

    public int attack(Character c) {
	int dmg = (int) (strength * atkRating) - c.getDefense();
	if (dmg < 0) dmg = 0;
	c.lowerHP(dmg);
	return dmg;
    }

    //increment strength and decrement defense for next attack
    public void specialize() {
	strength += 1;
	defense -= 1;
    }

    //reset strength and defense to default values
    public void normalize() {
	strength = orig_strength;
	defense = orig_defense;
    }

    public String getName() {
	return name;
    }

    public static String about(){
	String retstr = "";
	retstr += "\n0: Warrior: 125 hp, 100 strength, 40 defense, 0.4 atkRating";
	retstr += "\n1: Mage: 100 hp, 80 strength, 30 defense, 0.5 atkRating";
	retstr += "\n2: Rogue: 110 hp, 80 strength, 30 defense, 0.4 atkRating";
	retstr += "\n3: Tank: 150 hp, 70 strength, 50 defense, 0.4 atkRating";
	retstr += "\n4: Marksman: 80 hp, 110 strength, 30 defense, 0.6 atkRating";
	retstr += "\nMonster: 150 hp, 20-65 strength, 20 defense, atkRating: 1";
	return retstr;
    }
}
