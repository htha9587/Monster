package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster harryMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		String name = "Bernie.";
		int eyes = 3;
		int noses = 0;
		double legs = 2.0;
		double hair = 0.0;
		boolean hasBellyButton = false;
		
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		harryMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(harryMonster.toString());
		askQuestions();
		myDisplay.displayInfo("Updated monster info: " + harryMonster.toString());
	}

	private void askQuestions()
	{
		System.out.println("I want a new name for a monster,type one please!");
		String newMonsterName = monsterScanner.next();
		harryMonster.setMonsterName(newMonsterName);
	}
	
}