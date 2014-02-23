package view;

import java.util.ArrayList;

import javax.swing.UIManager;

import model.enums.EItem;


public class Launch {

	public static void main(String[] args) throws Exception {
		/*ArrayList<Recette> recettes = Recette.getRecettes(EItem.white_wool);
		for(int i=0;i<recettes.size();i++) {
			System.out.println(recettes.get(i).toString());
		}*/
		
		/*ArrayList<EItem> searches = EItem.searchBy("r");
		for (EItem eItem : searches) {
			System.out.println(eItem.getGuiName());
		}*/
		
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		//new FenPrincipale();
		new FenetreTest_XSwing();
	}

}
