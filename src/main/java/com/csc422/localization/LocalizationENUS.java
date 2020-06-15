package com.csc422.localization;

/**
 * EN-US Localization
 */
public class LocalizationENUS implements ILocalization {
	public String getUnitKilled ()
	{
		return "\t%s Killed %s";
	}
	
	public String getSurvivorStatus ()
	{
		return "We have %d survivors trying to make it to safety: " +
			   "( %d children, %d teachers, %d soldiers )";
	}
	
	public String getZombieStatus ()
	{
		return "But there are %d zombies waiting for them. ( %d common infected, %d tanks )";
	}
	
	public String getSurvivorsWon ()
	{
		return "It seems %d have made it to safety";
	}
	
	public String getZombiesWon ()
	{
		return "None of the survivors made it";
	}
}
