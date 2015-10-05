package marshmallows.controller;


import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterGUI;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster harryMonster; //Declares a Monster called harryMonster.
	private MarshmallowMonster userMonster; //Declares a Monster called userMonster.
	private MonsterDisplay myOutput;
	private Scanner monsterScanner;
	private MonsterGUI myPopups;
	
	public MonsterController()
	{
		String name = "Bernie.";
		int eyes = 3;
		int noses = 0;
		double legs = 2.0;
		double hair = 0.0;
		boolean hasBellyButton = false;
		
		myPopups= new MonsterGUI();
		
		monsterScanner = new Scanner(System.in);
		 myOutput = new MonsterDisplay();
		harryMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}
	
	public void start()
	{
		myOutput.displayMonsterConsole(harryMonster.toString());
		myOutput.displayMonsterGUI(harryMonster.toString());
		this.makeUserMonster();
		myOutput.displayMonsterGUI("New Monster Info" + userMonster.toString());
	}

	private void makeUserMonster() {
		// TODO Auto-generated method stub
		String name = myPopups
				.getAnswer("I want a new name for a monster,type one please!");

		myPopups.displayResponse("You typed in " + name);
		userMonster.setMonsterName(name);

		String tempnewMonsterEyes = myPopups
				.getAnswer("I want a new number of eyes please!");
		int newMonsterEyes;

		while (!isInteger(tempnewMonsterEyes)) {
			tempnewMonsterEyes = myPopups
					.getAnswer("Type in an integer value!!!");
		}

		if (isInteger(tempnewMonsterEyes)) {
			newMonsterEyes = Integer.parseInt(tempnewMonsterEyes);
		} else {
			newMonsterEyes = 12345678;

		}
		myPopups.displayResponse("You typed in" + newMonsterEyes);
		userMonster.setMonsterEyes(newMonsterEyes);

		String tempnewMonsterNoses = myPopups
				.getAnswer("I want a new number of noses please!");
		int newMonsterNoses;

		while (!isInteger(tempnewMonsterNoses)) {
			tempnewMonsterNoses = myPopups
					.getAnswer("Type in an integer value!!!");
		}

		if (isInteger(tempnewMonsterNoses)) {
			newMonsterNoses = Integer.parseInt(tempnewMonsterNoses);
		} else {
			newMonsterNoses = 12345678;
		}
		userMonster.setMonsterNoses(newMonsterNoses);
		myPopups.displayResponse("You typed in" + newMonsterNoses);

		String tempnewMonsterBellyButton = myPopups
				.getAnswer("I want to know if it has a bellybutton please!");
		boolean newMonsterBellyButton;
		while (!isDouble(tempnewMonsterBellyButton)) {
			tempnewMonsterBellyButton = myPopups
					.getAnswer("Type in an integer value!!!");
		}

		if (isDouble(tempnewMonsterBellyButton)) {
			newMonsterBellyButton = Boolean.parseBoolean(tempnewMonsterNoses);
		} else {
			newMonsterBellyButton = false;
		}
		myPopups.displayResponse("You typed in" + tempnewMonsterBellyButton);
		userMonster.setMonsterBellyButton(newMonsterBellyButton);

		String tempnewMonsterLegs = myPopups
				.getAnswer("I want to know how many legs it has please!");
		double newMonsterLegs;

		while (!isDouble(tempnewMonsterLegs)) {
			tempnewMonsterLegs = myPopups
					.getAnswer("Type in an integer value!!!");
		}

		if (isDouble(tempnewMonsterLegs)) {
			newMonsterLegs = Integer.parseInt(tempnewMonsterNoses);
		} else {
			newMonsterLegs = 12345678;
		}
		userMonster.setMonsterLegs(newMonsterLegs);
		myPopups.displayResponse("You typed in" + newMonsterLegs);

		double newMonsterHair;
		String tempnewMonsterHair = myPopups
				.getAnswer("I want to know if it has hair, please!");

		while (!isDouble(tempnewMonsterHair)) {
			tempnewMonsterHair = myPopups.getAnswer("Type in true or false!!!");
		}

		if (isDouble(tempnewMonsterHair)) {
			newMonsterHair = Double.parseDouble(tempnewMonsterHair);
		} else {
			newMonsterHair = -.0003;
		}
		userMonster.setMonsterHair(newMonsterHair);
		myPopups.displayResponse("You typed in" + newMonsterHair);
	}
	

	private void askQuestions()
	{
		String name = myPopups.getAnswer("I want a new name for a monster,type one please!");
		
		myPopups.displayResponse("You typed in " + name);
		harryMonster.setMonsterName(name);
		
		
		String tempnewMonsterEyes = myPopups.getAnswer("I want a new number of eyes please!");
		int newMonsterEyes;
		
		while(!isInteger(tempnewMonsterEyes))
		{
			tempnewMonsterEyes = myPopups.getAnswer("Type in an integer value!!!");
		}
		
		if(isInteger(tempnewMonsterEyes))
		{
			newMonsterEyes = Integer.parseInt(tempnewMonsterEyes);
		}
		else
		{
			newMonsterEyes = 12345678;

		}
		
		
		String tempnewMonsterNoses = myPopups.getAnswer("I want a new number of noses please!");
		int newMonsterNoses;
		harryMonster.setMonsterEyes(newMonsterEyes);
		myPopups.displayResponse("You typed in" + newMonsterEyes);
		
		while(!isInteger(tempnewMonsterNoses))
		{
			tempnewMonsterNoses = myPopups.getAnswer("Type in an integer value!!!");
		}
		
		if(isInteger(tempnewMonsterNoses))
		{
			newMonsterNoses = Integer.parseInt(tempnewMonsterNoses);
		}
		else
		{
			newMonsterNoses = 12345678;
		}
		harryMonster.setMonsterNoses(newMonsterNoses);
		myPopups.displayResponse("You typed in" + newMonsterNoses);
		
		String tempnewMonsterBellyButton = myPopups.getAnswer("I want to know if it has a bellybutton please!");
		boolean newMonsterBellyButton;
		while(!isDouble(tempnewMonsterBellyButton))
		{
			tempnewMonsterBellyButton = myPopups.getAnswer("Type in an integer value!!!");
		}
		
		if(isDouble(tempnewMonsterBellyButton))
		{
			newMonsterBellyButton = Boolean.parseBoolean(tempnewMonsterNoses);
		}
		else
		{
			newMonsterBellyButton = false;
		}
		myPopups.displayResponse("You typed in" + tempnewMonsterBellyButton);
		harryMonster.setMonsterBellyButton(newMonsterBellyButton);
		
		String tempnewMonsterLegs = myPopups.getAnswer("I want to know how many legs it has please!");
		double newMonsterLegs;
		
		while(!isDouble(tempnewMonsterLegs))
		{
			tempnewMonsterLegs = myPopups.getAnswer("Type in an integer value!!!");
		}
		
		if(isDouble(tempnewMonsterLegs))
		{
			newMonsterLegs = Integer.parseInt(tempnewMonsterNoses);
		}
		else
		{
			newMonsterLegs = 12345678;
		}
		harryMonster.setMonsterLegs(newMonsterLegs);
		myPopups.displayResponse("You typed in" + newMonsterLegs);
		
		double newMonsterHair;
		String tempnewMonsterHair= myPopups.getAnswer("I want to know if it has hair, please!");
		
		while(!isDouble(tempnewMonsterHair))
		{
			tempnewMonsterHair = myPopups.getAnswer("Type in true or false!!!");
		}
		
		if(isDouble(tempnewMonsterHair))
		{
			newMonsterHair= Double.parseDouble(tempnewMonsterHair);
		}
		else
		{
			newMonsterHair = -.0003;
		}
		harryMonster.setMonsterHair(newMonsterHair);
		myPopups.displayResponse("You typed in" + newMonsterHair);
	}
	/**
	 * Creates a MarshmallowMonster instance from user input.
	 */
		private void createUserMonster()
		{
			//Step one: Gather user information.
			System.out.println("What is your monster's name?");
			String userName;
			userName = monsterScanner.nextLine();
			System.out.println("How many legs will it have?");
			double userLegs = monsterScanner.nextDouble();
			System.out.println("How much hair does it have?");
			double userHair = monsterScanner.nextDouble();
			userHair = monsterScanner.nextDouble();
			System.out.println("Does it have a belly button?");
			boolean hasBellyButton = monsterScanner.nextBoolean();
			System.out.println("Number of eyes on the monster?");
			int userEyes = monsterScanner.nextInt();
			System.out.println("How many noses do I have?");
			int userNoses = monsterScanner.nextInt();
			
			//Step two: Build the monster using the constructor.
			userMonster = new MarshmallowMonster(userName, userEyes, userNoses, hasBellyButton, userLegs, userHair);
		}
			
			private boolean isInteger(String input)
			{
				boolean isInt = false;
				
				try
				{
					int validInteger = Integer.parseInt(input);
					isInt = true;
				}
				catch(NumberFormatException error)
				{
					myPopups.displayResponse("You did not return a valid Integer :(");
				}
				return isInt;
			}
			
			private boolean isDouble(String input)
			{
				boolean isDouble = false;
				
				try
				{
					double validDouble = Double.parseDouble(input);
					isDouble = true;
				}
				catch(NumberFormatException error)
				{
					myPopups.displayResponse("You did not type in a valid double.");
				}
				
				return isDouble;
			
			
		}
		
}