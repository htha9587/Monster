package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;


public class MonsterController
{
	private MarshmallowMonster harryMonster;
	private MonsterDisplay myDisplay;

	public MonsterController()
	{
		String name = "Bernie.";
		int eyes = 3;
		int noses = 0;
		double legs = 2.0;
		double hair = 0.0;
		boolean hasBellyButton = false;
		
		myDisplay = new MonsterDisplay();
		harryMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(harryMonster.toString());
	}

}