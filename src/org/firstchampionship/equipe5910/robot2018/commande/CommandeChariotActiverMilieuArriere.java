package org.firstchampionship.equipe5910.robot2018.commande;

import org.firstchampionship.equipe5910.robot2018.Robot;
import org.firstchampionship.equipe5910.robot2018.RobotMap.Bras;
import org.firstchampionship.equipe5910.robot2018.RobotMap.Chariot;

import edu.wpi.first.wpilibj.command.Command;

public class CommandeChariotActiverMilieuArriere extends Command{
	
	public CommandeChariotActiverMilieuArriere(){
		requires(Robot.chariot);
	}
	
	@Override
	protected void initialize() {
		System.out.println("CommandeChariotActiverMilieuArriere");
		//Robot.chariot.positionnerMilieuArriere();
	}
	
	@Override
	protected void execute() {
		Robot.bras.aller_position(Bras.POSITION.ARRIERE);
		Robot.chariot.aller_position(Chariot.POSITION.MILIEU);
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
	
	
}
