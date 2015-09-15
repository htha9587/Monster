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
	public String getMonsterName()
	{
		return monsterName;
	}
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	 
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	public double getMonsterlegs()
	{
		return monsterLegs;
	}
	public double getMonsterHair()
	{
		return monsterHair;
	}
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}
	
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
	public String toString()
	{
		String monsterInfo = "My monster has " 
								+ monsterLegs + " legs and its' name is " + monsterName + " He has " + monsterEyes + " eyes, and has no Bellybutton. ";
		
		return monsterInfo;
	}
}