package view;

import controller.SoController;

public class Main {
	public static void main(String args[]){
		SoController soController = new SoController();
		System.out.println(soController.os());
		System.out.println(soController.Version());
	}

}
