package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.UIManager;


public class Launch {

	public static void main(String[] args) throws Exception {

		GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(Font.createFont(Font.TRUETYPE_FONT, Launch.class.getResourceAsStream("/gui/MinecraftFont.ttf")));

		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		UIManager.getDefaults().put("info", Color.cyan);
		UIManager.getDefaults().put("ToolTip.font", new Font("MinecraftFont.ttf", Font.PLAIN, 12));


		//(javax.swing.plaf.nimbus.ToolTipPainter)UIManager.getDefaults().get("ToolTip[Enabled].backgroundPainter")

		new FenPrincipale();
		//new FenetreTest_XSwing();

	}

}
