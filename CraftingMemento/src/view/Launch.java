package view;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

import javax.swing.UIManager;

import model.enums.EItem;
import model.enums.Recette;


public class Launch {

	public static void main(String[] args) throws Exception {

		Font minecraftia = Font.createFont(Font.TRUETYPE_FONT, Launch.class.getResourceAsStream("/gui/Minecraftia.ttf"));
		GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(minecraftia);

		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

		//new FenPrincipale();
		//new FenetreTest_XSwing();

		EItem[] values = EItem.values();
		LinkedHashMap<EItem, ArrayList<Recette>> associations = new LinkedHashMap<>();

		for (EItem eItem : values) {
			ArrayList<Recette> recettes = Recette.getRecettes(eItem);
			@SuppressWarnings("unchecked")
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

		for (Iterator<EItem> it = associations.keySet().iterator(); it.hasNext();) {
			EItem type = (EItem) it.next();
			System.out.println(type);
			System.out.println(associations.get(type));
			System.out.println();
		}

//		EItemInfo[] values = EItemInfo.values();
//		for (EItemInfo eItemInfo : values) {
//			System.out.println(eItemInfo.getItem().getGuiName() + " est primaire ? " + eItemInfo.isPrimaire());
//		}

		System.out.println(Recette.calcule(Recette.potion_splash_faiblesse, 10, true));
		//System.out.println(Recette.calcule(Recette.faux_bois, 5, true));
		//System.out.println(Recette.calcule(Recette.panneau, 10, true));
		//System.out.println(Recette.calcule(Recette.epee_bois, 8, true));

	}

}
