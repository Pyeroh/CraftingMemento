package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.BorderFactory;
import javax.swing.UIManager;


public class Launch {

	public static void main(String[] args) throws Exception {

		Font mcFont = Font.createFont(Font.TYPE1_FONT, Launch.class.getResourceAsStream("/gui/MinecraftFont.pfa"));
		//Font mcFont = Font.createFont(Font.TRUETYPE_FONT, Launch.class.getResourceAsStream("/gui/MinecraftFont.ttf"));
		GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(mcFont);

		/*UIManager.put("info", new Color(29,14,29));
		UIManager.put("ToolTip.font", mcFont.deriveFont(Font.PLAIN).deriveFont(16f));
		UIManager.put("ToolTip.border", BorderFactory.createEmptyBorder(10, 10, 10, 10));*/

		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");






		new FenPrincipale();
		//new FenetreTest_XSwing();

	}

}
