package org.firstchampionship.equipe5910.robot2018;

import org.firstchampionship.equipe5910.robot2018.auto.TrajetAuto1DDD;
import org.firstchampionship.equipe5910.robot2018.auto.TrajetAuto1DGD;
import org.firstchampionship.equipe5910.robot2018.auto.TrajetAuto1GDG;
import org.firstchampionship.equipe5910.robot2018.auto.TrajetAuto1GGG;
import org.firstchampionship.equipe5910.robot2018.interaction.LecteurAttributionsAutonomes;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ModeAutonome {

	public static int POSITION_DEPART_1 = 0;
	public static int POSITION_DEPART_2 = 1;
	public static int POSITION_DEPART_3 = 2;
	public static int GAUCHE = 0;
	public static int DROIT = 1;
	
	protected LecteurAttributionsAutonomes.Attribution attribution;
	protected int depart;
	
	protected CommandGroup[][][][] grille = new CommandGroup[3][2][2][2];
	
	public ModeAutonome()
	{
		this.grille[POSITION_DEPART_1][DROIT][DROIT][DROIT] = new TrajetAuto1DDD();
		this.grille[POSITION_DEPART_1][DROIT][GAUCHE][DROIT] = new TrajetAuto1DGD();
		this.grille[POSITION_DEPART_1][GAUCHE][DROIT][GAUCHE] = new TrajetAuto1GDG();
		this.grille[POSITION_DEPART_1][GAUCHE][GAUCHE][GAUCHE] = new TrajetAuto1GGG();

		this.grille[POSITION_DEPART_2][DROIT][DROIT][DROIT] = new CommandGroup();
		this.grille[POSITION_DEPART_2][DROIT][GAUCHE][DROIT] = new CommandGroup();
		this.grille[POSITION_DEPART_2][GAUCHE][DROIT][GAUCHE] = new CommandGroup();
		this.grille[POSITION_DEPART_2][GAUCHE][GAUCHE][GAUCHE] = new CommandGroup();
		
		this.grille[POSITION_DEPART_3][DROIT][DROIT][DROIT] = new CommandGroup();
		this.grille[POSITION_DEPART_3][DROIT][GAUCHE][DROIT] = new CommandGroup();
		this.grille[POSITION_DEPART_3][GAUCHE][DROIT][GAUCHE] = new CommandGroup();
		this.grille[POSITION_DEPART_3][GAUCHE][GAUCHE][GAUCHE] = new CommandGroup();

		
		// Combinaisons non utilisees - contiennent des commandes par defaut
		this.grille[POSITION_DEPART_1][DROIT][DROIT][GAUCHE] = new CommandGroup();
		this.grille[POSITION_DEPART_1][DROIT][GAUCHE][GAUCHE] = new CommandGroup();
		this.grille[POSITION_DEPART_1][GAUCHE][DROIT][DROIT] = new CommandGroup();
		this.grille[POSITION_DEPART_1][GAUCHE][GAUCHE][DROIT] = new CommandGroup();
		
		this.grille[POSITION_DEPART_2][DROIT][DROIT][GAUCHE] = new CommandGroup();
		this.grille[POSITION_DEPART_2][DROIT][GAUCHE][GAUCHE] = new CommandGroup();
		this.grille[POSITION_DEPART_2][GAUCHE][DROIT][DROIT] = new CommandGroup();
		this.grille[POSITION_DEPART_2][GAUCHE][GAUCHE][DROIT] = new CommandGroup();

		this.grille[POSITION_DEPART_3][DROIT][DROIT][GAUCHE] = new CommandGroup();
		this.grille[POSITION_DEPART_3][DROIT][GAUCHE][GAUCHE] = new CommandGroup();
		this.grille[POSITION_DEPART_3][GAUCHE][DROIT][DROIT] = new CommandGroup();
		this.grille[POSITION_DEPART_3][GAUCHE][GAUCHE][DROIT] = new CommandGroup();
	}
	
	public CommandGroup obtenirTrajet(int depart, LecteurAttributionsAutonomes.Attribution attribution)
	{
		this.depart = depart;
		this.attribution = attribution;
		return this.grille[depart][attribution.premier.ordinal()][attribution.second.ordinal()][attribution.troisieme.ordinal()];
	}
}
