package view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class FenPrincipale extends JFrame {

	private static final long serialVersionUID = 2540259731678095668L;


	private JTabbedPane onglet = new JTabbedPane();
	private JPanel ongletCraft=new JPanel();
	private JPanel ongletFour=new JPanel();
	private JPanel ongletPotion=new JPanel();
	private JPanel ongletCalcul=new JPanel();
	private JTextField txtObjetRecherch;
	
	private final JLabel labelRecherche = new JLabel("Veuillez saisir le nom de l'objet recherché.");
	private final JLabel caseCraft1 = new JLabel("New label");
	private final JLabel caseCraft2 = new JLabel("New label");
	private final JLabel caseCraft3 = new JLabel("New label");
	private final JLabel caseCraft4 = new JLabel("New label");
	private final JLabel caseCraft5 = new JLabel("New label");
	private final JLabel caseCraft6 = new JLabel("New label");
	private final JLabel caseCraft7 = new JLabel("New label");
	private final JLabel caseCraft8 = new JLabel("New label");
	private final JLabel caseCraft9 = new JLabel("New label");
	private final JLabel caseCraftResultat = new JLabel("New label");

	private final JLabel lblFondGrille = new JLabel("");
	private final JLabel caseFourResultat = new JLabel("");
	private final JLabel caseFour1 = new JLabel("");
	private final JLabel label = new JLabel("New label");

	public FenPrincipale() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(665,682);
		getContentPane().setLayout(null);
		getContentPane().add(onglet);
		onglet.setBounds(0, 32, 636, 345);
		
		
		
		
		labelRecherche.setBounds(10, 9, 257, 22);
		getContentPane().add(labelRecherche);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 376, 615, 14);
		getContentPane().add(separator);
		
		JList list = new JList();
		list.setBounds(10, 402, 626, 236);
		getContentPane().add(list);
		
		txtObjetRecherch = new JTextField();
		txtObjetRecherch.setBounds(261, 6, 200, 29);
		getContentPane().add(txtObjetRecherch);
		txtObjetRecherch.setText("Objet recherch\u00E9...");
		txtObjetRecherch.setColumns(10);
				
		
		
		
		
		
				//onglet Craft
		
				onglet.addTab("Craft", ongletCraft);
						
				
						lblFondGrille.setBounds(24, 20, 593, 261);
						caseCraft1.setBounds(125, 78, 54, 54);
						caseCraft1.setBorder(new LineBorder(new Color(0, 0, 0)));
						caseCraft2.setBounds(185, 78, 54, 54);
						caseCraft2.setBorder(new LineBorder(new Color(0, 0, 0)));
						caseCraft3.setBounds(245, 78, 54, 54);
						caseCraft3.setBorder(new LineBorder(new Color(0, 0, 0)));
						caseCraft4.setBounds(125, 139, 55, 54);
						caseCraft4.setBorder(new LineBorder(new Color(0, 0, 0)));
						caseCraft5.setBounds(185, 139, 55, 54);
						caseCraft5.setBorder(new LineBorder(new Color(0, 0, 0)));
						caseCraft6.setBounds(245, 139, 55, 54);
						caseCraft6.setBorder(new LineBorder(new Color(0, 0, 0)));
						caseCraft7.setBounds(125, 200, 55, 54);
						caseCraft7.setBorder(new LineBorder(new Color(0, 0, 0)));
						caseCraft8.setBounds(185, 200, 55, 54);
						caseCraft8.setBorder(new LineBorder(new Color(0, 0, 0)));
						caseCraft9.setBounds(245, 200, 55, 54);
						caseCraft9.setBorder(new LineBorder(new Color(0, 0, 0)));
						caseCraftResultat.setBounds(428, 125, 80, 80);
						caseCraftResultat.setBorder(new LineBorder(new Color(0, 0, 0)));
						
						
								ongletCraft.setLayout(null);
								ongletCraft.add(caseCraft1);
								ongletCraft.add(caseCraft2);
								ongletCraft.add(caseCraft3);
								ongletCraft.add(caseCraft4);
								ongletCraft.add(caseCraft5);
								ongletCraft.add(caseCraft6);
								ongletCraft.add(caseCraft7);
								ongletCraft.add(caseCraft8);
								ongletCraft.add(caseCraft9);								
								ongletCraft.add(caseCraftResultat);
								ongletCraft.add(lblFondGrille);
								
								Image imgCraft = new ImageIcon(FenPrincipale.class.getResource("/gui/tablecraft-minecraft.png")).getImage().getScaledInstance(lblFondGrille.getWidth(), lblFondGrille.getHeight(), Image.SCALE_AREA_AVERAGING);
								lblFondGrille.setIcon(new ImageIcon(imgCraft));
																						
																						
																							
						//onglet Four
								
								
						onglet.addTab("Four", ongletFour);
										
						caseFour1.setBounds(210, 78, 55, 54);	
						caseFour1.setBorder(new LineBorder(new Color(0, 0, 0)));
						caseFourResultat.setBounds(24, 20, 592, 261);					
						
											ongletFour.setLayout(null);
											ongletFour.add(caseFour1);
											ongletFour.add(caseFourResultat);
											
											Image imgFour = new ImageIcon(FenPrincipale.class.getResource("/gui/four-minecraft.png")).getImage().getScaledInstance(caseFourResultat.getWidth(), caseFourResultat.getHeight(), Image.SCALE_AREA_AVERAGING);
											caseFourResultat.setIcon(new ImageIcon(imgFour));
											label.setBounds(401, 128, 79, 79);
											
											ongletFour.add(label);
																											




		//onglet Potion

		onglet.addTab("Potion", ongletPotion);
		GroupLayout gl_ongletPotion = new GroupLayout(ongletPotion);
		gl_ongletPotion.setHorizontalGroup(
			gl_ongletPotion.createParallelGroup(Alignment.LEADING)
				.addGap(0, 723, Short.MAX_VALUE)
		);
		gl_ongletPotion.setVerticalGroup(
			gl_ongletPotion.createParallelGroup(Alignment.LEADING)
				.addGap(0, 347, Short.MAX_VALUE)
		);
		ongletPotion.setLayout(gl_ongletPotion);




		//onglet Calcul
		
		onglet.addTab("Calcul", ongletCalcul);
		ongletCalcul.setLayout(null);
		
		
		
		
				
				
			
								




	}



	public static void reset(){}


	public void craft(){}
	public void four(){}
	public void potion(){}
	public void calculateur(){}
}