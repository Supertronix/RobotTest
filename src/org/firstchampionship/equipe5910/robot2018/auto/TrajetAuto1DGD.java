package org.firstchampionship.equipe5910.robot2018.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TrajetAuto1DGD extends CommandGroup{
	
	public TrajetAuto1DGD()
	{
		
	}
	
	protected void initialize(){
		System.out.println("Trajet1DDD");
		SmartDashboard.putString("Trajet", "1DGD");
	}
		
}
