package controller;

public class SoController {
	public SoController() {
		super();
	}
	
	public String os(){
		return System.getProperty("os.name");
	}
	
	public String Version(){
		return System.getProperty("os.version");
	}

}
