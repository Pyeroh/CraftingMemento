package view;

import javax.swing.UIManager;

import model.Recette;


public class Launch {

	public static void main(String[] args) throws Exception {
		System.out.println(Recette.gres);
		
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		new FenPrincipale();
	}

}
