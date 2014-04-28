package view;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Locale;

import javax.swing.UIManager;

public class Launch {

	public static void main(String[] args) throws Exception {

		Font minecraftia = Font.createFont(Font.TRUETYPE_FONT, Launch.class.getResourceAsStream("/gui/Minecraftia.ttf"));
		GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(minecraftia);

		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

		System.out.println(Locale.FRENCH.getLanguage());

		// new FenPrincipale();
		// new FenetreTest_XSwing();

	}

}
