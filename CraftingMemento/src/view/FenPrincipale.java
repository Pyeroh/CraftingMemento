package view;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class FenPrincipale extends JFrame {

	private static final long serialVersionUID = 2540259731678095668L;
	
	
		JTabbedPane onglet = new JTabbedPane();
		JPanel ongletCraft=new JPanel();
		JPanel ongletFour=new JPanel();
		JPanel ongletPotion=new JPanel();
		JPanel ongletCalcul=new JPanel();
		private JTextField txtObjetRecherch;
		private final JLabel caseCraft1 = new JLabel("New label");
		private final JLabel caseCraft2 = new JLabel("New label");
		private final JLabel caseCraft3 = new JLabel("New label");
		private final JLabel caseCraft4 = new JLabel("New label");
		private final JLabel caseCraft5 = new JLabel("New label");
		private final JLabel caseCraft6 = new JLabel("New label");
		private final JLabel caseCraft7 = new JLabel("New label");
		private final JLabel lblNewLabel = new JLabel("");
	
	
	public FenPrincipale() {
		caseCraft2.setBounds(97, 109, 48, 47);
		caseCraft2.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft1.setBounds(41, 109, 48, 47);
		caseCraft1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(739,415);
		getContentPane().setLayout(null);
		getContentPane().add(onglet);
		onglet.setBounds(0, 0, 723, 377);
		
		
		
		//onglet Craft
		
		onglet.addTab("Craft", ongletCraft);
		
		JLabel labelCraft1 = new JLabel("Veuillez saisir le nom de l'objet recherché.");
		labelCraft1.setBounds(10, 11, 200, 22);
		
		txtObjetRecherch = new JTextField();
		txtObjetRecherch.setBounds(10, 39, 200, 29);
		txtObjetRecherch.setText("Objet recherch\u00E9...");
		txtObjetRecherch.setColumns(10);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(250, 138, 1, 1);
		caseCraft3.setBounds(157, 109, 48, 47);
		caseCraft3.setBorder(new LineBorder(new Color(0, 0, 0)));
		ongletCraft.setLayout(null);
		ongletCraft.add(txtObjetRecherch);
		ongletCraft.add(labelCraft1);
		ongletCraft.add(caseCraft1);
		ongletCraft.add(caseCraft2);
		ongletCraft.add(caseCraft3);
		ongletCraft.add(layeredPane);
		caseCraft4.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft4.setBounds(41, 167, 48, 47);
		
		ongletCraft.add(caseCraft4);
		caseCraft5.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft5.setBounds(97, 167, 48, 47);
		
		ongletCraft.add(caseCraft5);
		caseCraft6.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft6.setBounds(157, 167, 48, 47);
		
		ongletCraft.add(caseCraft6);
		caseCraft7.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft7.setBounds(41, 225, 48, 47);
		
		ongletCraft.add(caseCraft7);
		
		JLabel caseCraft8 = new JLabel("New label");
		caseCraft8.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft8.setBounds(97, 225, 48, 47);
		ongletCraft.add(caseCraft8);
		
		JLabel caseCraft9 = new JLabel("New label");
		caseCraft9.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft9.setBounds(157, 226, 48, 47);
		ongletCraft.add(caseCraft9);
		
		JLabel caseCraftResultat = new JLabel("New label");
		caseCraftResultat.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraftResultat.setBounds(500, 167, 48, 47);
		ongletCraft.add(caseCraftResultat);
		lblNewLabel.setIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/crafting_table.png")));
		lblNewLabel.setBounds(239, 109, 144, 75);
		
		ongletCraft.add(lblNewLabel);
		
		
		//onglet Four
		
		
		onglet.addTab("Four", ongletFour);
		
		
		
		
		//onglet Potion
		
		onglet.addTab("Potion", ongletPotion);
		
		
		
		
		//onglet Calcul
		
		onglet.addTab("Calcul", ongletCalcul);
		
		
		
				   
	}
	
	
	//fonction de quentin
	public static Image scaleImage(Image source, JComponent component) {
        int height = component.getHeight();
        int width = component.getWidth();
        return source.getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
    }
	
	
	
	
	
	
	public static void reset(){}
	
	
	public void craft(){}
	public void four(){}
	public void potion(){}
	public void calculateur(){}
}
