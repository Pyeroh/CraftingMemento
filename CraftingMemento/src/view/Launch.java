package view;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.UIManager;


public class Launch {

	public static void main(String[] args) throws Exception {

		Font minecraftia = Font.createFont(Font.TRUETYPE_FONT, Launch.class.getResourceAsStream("/gui/Minecraftia.ttf"));
		GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(minecraftia);

		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

		new FenPrincipale();
		//new FenetreTest_XSwing();

	}

}
