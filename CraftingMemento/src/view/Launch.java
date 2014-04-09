package view;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.UIManager;

import model.enums.EItem;
import model.enums.Recette;


public class Launch {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {

		Font minecraftia = Font.createFont(Font.TRUETYPE_FONT, Launch.class.getResourceAsStream("/gui/Minecraftia.ttf"));
		GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(minecraftia);

		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

		//new FenPrincipale();
		//new FenetreTest_XSwing();

		EItem[] values = EItem.values();
		HashMap<EItem, ArrayList<Recette>> associations = new HashMap<>();

		for (EItem eItem : values) {
			ArrayList<Recette> recettes = Recette.getRecettes(eItem);
			ArrayList<Recette> recettes2 = (ArrayList<Recette>) recettes.clone();
			for (Recette recette : recettes) {
				if (recette.getItem().getItem() != eItem) {
					recettes2.remove(recette);
				}
			}
			if (recettes2.size() >= 2) {
				associations.put(eItem, recettes2);
			}
		}

		System.out.println(associations);

	}

}
