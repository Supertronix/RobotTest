package org.firstchampionship.equipe5910.robot2018.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TrajetAuto1GDG extends CommandGroup{
	
	public TrajetAuto1GDG()
	{
		
	}
	
	protected void initialize(){
		System.out.println("Trajet1GDG");
		SmartDashboard.putString("Trajet", "1GDG");
	}
		
}
