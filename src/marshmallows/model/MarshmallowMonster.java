package marshmallows.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	
	
	private MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, boolean monsterBellyButton, double monsterLegs, double monsterHair)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterBellyButton = monsterBellyButton;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs= monsterLegs;
	}	

	public String toString()
	{
		String monsterInfo = "My monster has " 
								+ monsterLegs + " legs and its' name is " + monsterName + " He has " + monsterEyes + " eyes, and has no Bellybutton. ";
		
		return monsterInfo;
	}
}