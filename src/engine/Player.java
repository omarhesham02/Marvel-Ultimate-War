package engine;

import java.util.ArrayList;

import model.world.Champion;

public class Player {
	
	private final String name;
	private Champion leader;
	private final ArrayList<Champion> team = new ArrayList<>();
	
	
	public Player(String name) {
		
		this.name = name;

	}


	public Champion getLeader() {
		return leader;
	}


	public void setLeader(Champion leader) {
		this.leader = leader;
	}


	public String getName() {
		return name;
	}


	public ArrayList<Champion> getTeam() {
		return team;
	} 
	
	
	
	
}
