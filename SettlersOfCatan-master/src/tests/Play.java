package tests;

import java.util.ArrayList;

import guiClasses.setupGameOfficial;
import players.Player;

public class Play {

	public static void main(String[] args) 
	{
		ArrayList<Player> players = new ArrayList<Player>();
		setupGameOfficial setup = new setupGameOfficial();
		players = setup.initiateGame();
		

	}

}
