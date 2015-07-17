package dta.ihm;

public class ArreterProgrammeAction implements Action {
	
	public  Integer getId(){
		return 0;
	}
	public  String getMenu(){
		return "Arrêter le programme";
	}
	public void execute(){
		System.exit(0);
	}
}
