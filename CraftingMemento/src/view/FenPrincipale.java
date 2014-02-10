package view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class FenPrincipale extends JFrame {

	private static final long serialVersionUID = 2540259731678095668L;


	//initialisation onglets
		private JTabbedPane onglet = new JTabbedPane();
		private JPanel ongletCraft=new JPanel();
		private JPanel ongletFour=new JPanel();
		private JPanel ongletPotion=new JPanel();
		private JPanel ongletCalcul=new JPanel();
		private JTextField txtObjetRecherch;


	//initialisation des éléments dans l'onglet "Craft"
		private final JLabel labelRecherche = new JLabel("Veuillez saisir le nom de l'objet recherché.");
		private final JLabel lblFondGrille = new JLabel("");
		private final JLabel caseCraft1 = new JLabel("1");
		private final JLabel caseCraft2 = new JLabel("2");
		private final JLabel caseCraft3 = new JLabel("3");
		private final JLabel caseCraft4 = new JLabel("4");
		private final JLabel caseCraft5 = new JLabel("5");
		private final JLabel caseCraft6 = new JLabel("6");
		private final JLabel caseCraft7 = new JLabel("7");
		private final JLabel caseCraft8 = new JLabel("8");
		private final JLabel caseCraft9 = new JLabel("9");
		private final JLabel caseCraftResultat = new JLabel("Res");

	//initialisation des éléments dans l'onglet "Four"
		private final JLabel lblFondFour = new JLabel("");
		private final JLabel caseFour1 = new JLabel("1");
		private final JLabel caseFourResultat = new JLabel("Res");

	//initialisation des éléments dans l'onglet "Potion"
		private final JLabel labelFondAlambic = new JLabel("");
		private final JLabel caseAlambic1 = new JLabel("1");
		private final JLabel caseAlambic2 = new JLabel("2");
		private final JLabel caseAlambic3 = new JLabel("3");
		JLabel caseIngredientAlambic = new JLabel("ingredient");
		

	//initialisation des éléments dans l'onglet "Calcul"

		private final JLabel lblQuantite = new JLabel("Saisir la quantité désirée : ");
		private JTextField  txtQuantite = new JTextField();
		private final JScrollPane scrollPane_NbIngredient = new JScrollPane();
		
		


	public FenPrincipale() {

			//Objets de la fenêtre principale
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setSize(665,682);
			getContentPane().setLayout(null);
			getContentPane().add(onglet);
			onglet.setBounds(10, 32, 626, 345);


				labelRecherche.setBounds(10, 9, 257, 22);
				getContentPane().add(labelRecherche);


					txtObjetRecherch = new JTextField();
					txtObjetRecherch.setBounds(261, 6, 200, 29);
					getContentPane().add(txtObjetRecherch);
					txtObjetRecherch.setText("Objet recherch\u00E9...");
					txtObjetRecherch.setColumns(10);
					
						JSeparator separator = new JSeparator();
						separator.setBounds(0, 376, 615, 14);
						getContentPane().add(separator);
		
							JScrollPane scrollPane = new JScrollPane();
							scrollPane.setBounds(10, 384, 626, 254);
							getContentPane().add(scrollPane);
		
								JList listeSuggestion = new JList();
								scrollPane.setViewportView(listeSuggestion);

		
		

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
			
				caseFourResultat.setVerticalAlignment(SwingConstants.TOP);
				caseFourResultat.setBounds(400, 127, 80, 80);					
				caseFourResultat.setBorder(new LineBorder(new Color(0, 0, 0)));	

					ongletFour.setLayout(null);
					
					ongletFour.add(caseFour1);
					ongletFour.add(caseFourResultat);
					ongletFour.add(lblFondFour);
		
						lblFondFour.setBounds(24, 20, 590, 261);
						lblFondFour.setVerticalAlignment(SwingConstants.BOTTOM);

		Image imgFour = new ImageIcon(FenPrincipale.class.getResource("/gui/four-minecraft.png")).getImage().getScaledInstance(lblFondFour.getWidth(), lblFondFour.getHeight(), Image.SCALE_AREA_AVERAGING);
		lblFondFour.setIcon(new ImageIcon(imgFour));





		//onglet Potion

		onglet.addTab("Potion", ongletPotion);
		ongletPotion.setLayout(null);
		
		labelFondAlambic.setBounds(24, 20, 590, 261);
		
		
				caseIngredientAlambic.setVerticalAlignment(SwingConstants.TOP);
				caseIngredientAlambic.setBounds(288, 78, 54, 54);
				caseIngredientAlambic.setBorder(new LineBorder(new Color(0, 0, 0)));
				
					caseAlambic1.setVerticalAlignment(SwingConstants.TOP);
					caseAlambic1.setBounds(211, 178, 54, 54);
					caseAlambic1.setBorder(new LineBorder(new Color(0, 0, 0)));
					
						caseAlambic2.setVerticalAlignment(SwingConstants.TOP);
						caseAlambic2.setBounds(288, 203, 54, 54);
						caseAlambic2.setBorder(new LineBorder(new Color(0, 0, 0)));
						
							caseAlambic3.setVerticalAlignment(SwingConstants.TOP);
							caseAlambic3.setBounds(365, 178, 54, 54);
							caseAlambic3.setBorder(new LineBorder(new Color(0, 0, 0)));
		
						ongletPotion.add(caseIngredientAlambic);
						ongletPotion.add(caseAlambic1);
						ongletPotion.add(caseAlambic2);
						ongletPotion.add(caseAlambic3);
						ongletPotion.add(labelFondAlambic);
		
		Image imgAlambic = new ImageIcon(FenPrincipale.class.getResource("/gui/alambic-minecraft.png")).getImage().getScaledInstance(labelFondAlambic.getWidth(), labelFondAlambic.getHeight(), Image.SCALE_AREA_AVERAGING);
		labelFondAlambic.setIcon(new ImageIcon(imgAlambic));
		
		
		//onglet Calcul

		onglet.addTab("Calcul", ongletCalcul);
		ongletCalcul.add(txtQuantite);
		ongletCalcul.setLayout(null);
		ongletCalcul.add(lblQuantite);
		lblQuantite.setBounds(6, 87, 161, 16);
		
		txtQuantite.setBounds(179, 81, 62, 28);
		txtQuantite.setColumns(10);
		scrollPane_NbIngredient.setBounds(283, 81, 337, 210);
		
		ongletCalcul.add(scrollPane_NbIngredient);
		
		JList listIngredient = new JList();
		scrollPane_NbIngredient.setViewportView(listIngredient);
		
		
		
		






	}



	public static void reset(){}
	public void craft(){}
	public void four(){}
	public void potion(){}
	public void calculateur(){}
}