package view;

import java.awt.Color;

import javax.swing.UIManager;


public class Launch {

	public static void main(String[] args) throws Exception {

		UIManager.getDefaults().put("ToolTip.background", Color.RED);
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		UIManager.getDefaults().put("info", Color.RED);

		//(javax.swing.plaf.nimbus.ToolTipPainter)UIManager.getDefaults().get("ToolTip[Enabled].backgroundPainter")

		new FenPrincipale();
		//new FenetreTest_XSwing();
	}

}
