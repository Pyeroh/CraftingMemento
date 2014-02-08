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

public class FenPrincipale extends JFrame {

	private static final long serialVersionUID = 2540259731678095668L;


	private JTabbedPane onglet = new JTabbedPane();
	private JPanel ongletCraft=new JPanel();
	private JPanel ongletFour=new JPanel();
	private JPanel ongletPotion=new JPanel();
	private JPanel ongletCalcul=new JPanel();
	private JTextField txtObjetRecherch;
	private final JLabel caseCraft1 = new JLabel("New label");
	private final JLabel caseCraft2 = new JLabel("New label");
	private final JLabel caseCraft3 = new JLabel("New label");
	private final JLabel caseCraft4 = new JLabel("New label");
	private final JLabel caseCraft5 = new JLabel("New label");
	private final JLabel caseCraft6 = new JLabel("New label");
	private final JLabel caseCraft7 = new JLabel("New label");
	private final JLabel caseCraft8 = new JLabel("New label");
	private final JLabel caseCraft9 = new JLabel("New label");
	private final JLabel lblFondGrille = new JLabel("");
	private final JLabel lblFondFour = new JLabel("");


	public FenPrincipale() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(739,415);
		getContentPane().setLayout(null);
		getContentPane().add(onglet);
		onglet.setBounds(0, 0, 723, 377);
		caseCraft2.setBounds(138, 119, 55, 55);
		caseCraft2.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft1.setBounds(76, 119, 55, 55);
		caseCraft1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		
		
				//onglet Craft
		
				onglet.addTab("Craft", ongletCraft);
				
						JLabel labelCraft1 = new JLabel("Veuillez saisir le nom de l'objet recherché.");
						labelCraft1.setBounds(10, 11, 230, 22);
						
								txtObjetRecherch = new JTextField();
								txtObjetRecherch.setBounds(10, 39, 200, 29);
								txtObjetRecherch.setText("Objet recherch\u00E9...");
								txtObjetRecherch.setColumns(10);
								caseCraft3.setBounds(202, 119, 55, 55);
								caseCraft3.setBorder(new LineBorder(new Color(0, 0, 0)));
								ongletCraft.setLayout(null);
								ongletCraft.add(txtObjetRecherch);
								ongletCraft.add(labelCraft1);
								ongletCraft.add(caseCraft1);
								ongletCraft.add(caseCraft2);
								ongletCraft.add(caseCraft3);
								caseCraft4.setBorder(new LineBorder(new Color(0, 0, 0)));
								caseCraft4.setBounds(76, 181, 55, 55);
								
										ongletCraft.add(caseCraft4);
										caseCraft5.setBorder(new LineBorder(new Color(0, 0, 0)));
										caseCraft5.setBounds(138, 181, 55, 55);
										
												ongletCraft.add(caseCraft5);
												caseCraft6.setBorder(new LineBorder(new Color(0, 0, 0)));
												caseCraft6.setBounds(202, 181, 55, 55);
												
														ongletCraft.add(caseCraft6);
														caseCraft7.setBorder(new LineBorder(new Color(0, 0, 0)));
														caseCraft7.setBounds(76, 244, 55, 55);
														
																ongletCraft.add(caseCraft7);
																
																		JLabel caseCraft8_1 = new JLabel("New label");
																		caseCraft8_1.setBorder(new LineBorder(new Color(0, 0, 0)));
																		caseCraft8_1.setBounds(138, 244, 55, 55);
																		ongletCraft.add(caseCraft8_1);
																		
																				JLabel caseCraft9_1 = new JLabel("New label");
																				caseCraft9_1.setBorder(new LineBorder(new Color(0, 0, 0)));
																				caseCraft9_1.setBounds(202, 244, 55, 55);
																				ongletCraft.add(caseCraft9_1);
																				
																						JLabel caseCraftResultat = new JLabel("New label");
																						caseCraftResultat.setBorder(new LineBorder(new Color(0, 0, 0)));
																						caseCraftResultat.setBounds(391, 168, 86, 82);
																						ongletCraft.add(caseCraftResultat);
																						
																						lblFondGrille.setBounds(20, 80, 506, 261);
																						Image imgCraft = new ImageIcon(FenPrincipale.class.getResource("/gui/crafting_table.png")).getImage().getScaledInstance(lblFondGrille.getWidth(), lblFondGrille.getHeight(), Image.SCALE_AREA_AVERAGING);
																						lblFondGrille.setIcon(new ImageIcon(imgCraft));
																						
																						lblFondFour.setBounds(20, 80, 506, 261);
																						Image imgFour = new ImageIcon(FenPrincipale.class.getResource("/gui/four-minecraft.png")).getImage().getScaledInstance(lblFondGrille.getWidth(), lblFondFour.getHeight(), Image.SCALE_AREA_AVERAGING);
																						lblFondFour.setIcon(new ImageIcon(imgFour));
																						
																						
																						
																						
																						
																								ongletCraft.add(lblFondGrille);
																								ongletFour.add(lblFondFour);

		//onglet Four


		onglet.addTab("Four", ongletFour);




		//onglet Potion

		onglet.addTab("Potion", ongletPotion);




		//onglet Calcul

		onglet.addTab("Calcul", ongletCalcul);




	}



	public static void reset(){}


	public void craft(){}
	public void four(){}
	public void potion(){}
	public void calculateur(){}
}