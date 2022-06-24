package model.world;

import java.util.ArrayList;

public class Villain extends Champion {

	public Villain (String name, int maxHP, int mana, int maxActions, int speed, int attackRange, int attackDamage) throws Exception {
		super(name, maxHP, mana, maxActions, speed, attackRange, attackDamage);
	
	}
	

	public void useLeaderAbility(ArrayList<Champion> targets) {
		

		for (Champion c : targets) {
				c.setCondition(Condition.KNOCKEDOUT);
				c.setCurrentActionPoints(0);
		}
	
		
	}
}