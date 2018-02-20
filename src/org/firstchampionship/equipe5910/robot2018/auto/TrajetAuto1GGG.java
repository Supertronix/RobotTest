package org.firstchampionship.equipe5910.robot2018.auto;

import org.firstchampionship.equipe5910.robot2018.commande.CommandeBrasAllonger;
import org.firstchampionship.equipe5910.robot2018.commande.CommandeBrasRetrecir;
import org.firstchampionship.equipe5910.robot2018.commande.CommandeChariotActiverHome;
import org.firstchampionship.equipe5910.robot2018.commande.CommandeChariotActiverHautAvant;
import org.firstchampionship.equipe5910.robot2018.commande.CommandeChariotActiverMilieuAvant;
import org.firstchampionship.equipe5910.robot2018.commande.CommandePause;
import org.firstchampionship.equipe5910.robot2018.commande.CommandePinceFermer;
import org.firstchampionship.equipe5910.robot2018.commande.CommandePinceOuvrir;
import org.firstchampionship.equipe5910.robot2018.commande.CommandeRouesAvancer;
import org.firstchampionship.equipe5910.robot2018.commande.CommandeRouesAvancerAngle;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TrajetAuto1GGG extends CommandGroup{
	
	public TrajetAuto1GGG()
	{
		addSequential(new CommandeRouesAvancer(5000));
		addParallel(new CommandeChariotActiverHautAvant());
		addParallel(new CommandeBrasAllonger());
		addSequential(new CommandeRouesAvancerAngle(1300, 45));
		addSequential(new CommandeRouesAvancerAngle(800, -30));
		addSequential(new CommandePinceOuvrir());
		addSequential(new CommandePause(0.450));
		addSequential(new CommandePinceFermer());
		addSequential(new CommandeBrasRetrecir());
		addSequential(new CommandeChariotActiverHome());
	}
	
	protected void initialize(){
		System.out.println("Trajet1GGG");
	}
		
}
