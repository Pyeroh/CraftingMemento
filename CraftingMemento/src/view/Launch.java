package view;

import javax.swing.UIManager;

import model.enums.Recette;


public class Launch {

	public static void main(String[] args) throws Exception {
		Recette[] values = Recette.values();
		int max = 0;
		for (int i=0;i<values.length-1;i++) {
			Recette recette = values[i];
			try {
				max = recette.getItem().getQuantite()>max ? recette.getItem().getQuantite() : max;
			} catch (Exception e) {
				throw new ArrayIndexOutOfBoundsException(recette.toString());
			}
		}
		System.out.println(max);
		
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		new FenPrincipale();
		//new FenetreTest_XSwing();
	}

}
