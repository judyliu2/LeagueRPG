//Team League RPG -- Shakil Rafi, Henry Zheng, Judy Liu
//APCS1 pd3
//HW33 -- Ye Olde Role Playing Game, Unchained
//2016-11-22

public abstract class Character {
    
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
    public abstract void specialize();

    //reset strength and defense to default values
    public abstract void normalize();

    public String getName() {
	return name;
    }

    public abstract String about();
}
