package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.LineBorder;

import view.components.JComboSearchField;

import model.enums.EItem;
import model.enums.ERecetteType;
import model.enums.Recette;

public class FenPrincipale extends JFrame {

	private static final long serialVersionUID = 2540259731678095668L;
	
	private ArrayList<Recette> recettes; 


	//initialisation onglets
	private JTabbedPane onglet = new JTabbedPane();
	private JPanel ongletCraft=new JPanel();
	private JPanel ongletFour=new JPanel();
	private JPanel ongletPotion=new JPanel();
	private JPanel ongletCalcul=new JPanel();
	private JComboSearchField txtObjetRecherch;


	//initialisation des éléments dans l'onglet "Craft"
	private JLabel labelRecherche = new JLabel("Veuillez saisir le nom de l'objet recherché.");
	private JLabel lblFondGrille = new JLabel();
	private JLabel caseCraft1 = new JLabel();
	private JLabel caseCraft2 = new JLabel();
	private JLabel caseCraft3 = new JLabel();
	private JLabel caseCraft4 = new JLabel();
	private JLabel caseCraft5 = new JLabel();
	private JLabel caseCraft6 = new JLabel();
	private JLabel caseCraft7 = new JLabel();
	private JLabel caseCraft8 = new JLabel();
	private JLabel caseCraft9 = new JLabel();
	private JLabel caseCraftResultat = new JLabel();

	//initialisation des éléments dans l'onglet "Four"
	private JLabel lblFondFour = new JLabel();
	private JLabel caseFour1 = new JLabel("1");
	private JLabel caseFourResultat = new JLabel("Res");

	//initialisation des éléments dans l'onglet "Potion"
	private JLabel labelFondAlambic = new JLabel();
	private JLabel caseAlambic1 = new JLabel("1");
	private JLabel caseAlambic2 = new JLabel("2");
	private JLabel caseAlambic3 = new JLabel("3");
	private JLabel caseIngredientAlambic = new JLabel("ingredient");
	private JTextField  txtQuantite = new JTextField();
	private JScrollPane scrollPane_NbIngredient = new JScrollPane();
	private JLabel lblFondCalcul = new JLabel();
	private JLabel lblImageObjet = new JLabel("image");



	public FenPrincipale() {

		//Objets de la fenêtre principale
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(665,682);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		getContentPane().add(onglet);
		onglet.setBounds(10, 32, 626, 345);


		labelRecherche.setBounds(10, 9, 257, 22);
		getContentPane().add(labelRecherche);


		txtObjetRecherch = new JComboSearchField();
		txtObjetRecherch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = e.getActionCommand();
				ArrayList<EItem> results = EItem.searchBy(search);
				if(results.size()>0) {
					if(results.get(0).getGuiName().equals(search)) {
						
						recettes = Recette.getRecettes(results.get(0));
						
						reset();
						afficheOnglet();
						
					}
				}
			}
		});
		txtObjetRecherch.setPrompt("Objet recherché...");
		txtObjetRecherch.setInstantSearchDelay(250);
		txtObjetRecherch.setBounds(261, 6, 200, 29);
		txtObjetRecherch.setMargin(new Insets(0, 4, 0, 0));
		getContentPane().add(txtObjetRecherch);
		txtObjetRecherch.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 376, 649, 14);
		getContentPane().add(separator);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 384, 626, 254);
		getContentPane().add(scrollPane);

		JList listeSuggestion = new JList();
		scrollPane.setViewportView(listeSuggestion);




		//onglet Craft

		onglet.addTab("Craft", ongletCraft);


		lblFondGrille.setBounds(24, 20, 593, 261);
		caseCraft1.setBorder(null);
		caseCraft1.setBounds(130, 84, 42, 42);
		caseCraft2.setBorder(null);

		caseCraft2.setBounds(191, 84, 42, 42);

		caseCraft3.setBounds(251, 84, 42, 42);
		caseCraft3.setBorder(null);

		caseCraft4.setBounds(130, 145, 42, 42);
		caseCraft4.setBorder(null);

		caseCraft5.setBounds(191, 145, 42, 42);
		caseCraft5.setBorder(null);

		caseCraft6.setBounds(251, 145, 42, 42);
		caseCraft6.setBorder(null);

		caseCraft7.setBounds(130, 206, 42, 42);
		caseCraft7.setBorder(null);

		caseCraft8.setBounds(191, 206, 42, 42);
		caseCraft8.setBorder(null);

		caseCraft9.setBounds(251, 206, 42, 42);
		caseCraft9.setBorder(null);

		caseCraftResultat.setBounds(433, 130, 70, 70);
		caseCraftResultat.setBorder(null);


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

		caseFour1.setBounds(216, 84, 42, 42);	
		caseFour1.setBorder(new LineBorder(new Color(0, 0, 0)));

		caseFourResultat.setVerticalAlignment(SwingConstants.TOP);
		caseFourResultat.setBounds(404, 132, 70, 70);					
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
		caseIngredientAlambic.setBounds(294, 84, 42, 42);
		caseIngredientAlambic.setBorder(new LineBorder(new Color(0, 0, 0)));

		caseAlambic1.setVerticalAlignment(SwingConstants.TOP);
		caseAlambic1.setBounds(219, 188, 42, 42);
		caseAlambic1.setBorder(new LineBorder(new Color(0, 0, 0)));

		caseAlambic2.setVerticalAlignment(SwingConstants.TOP);
		caseAlambic2.setBounds(296, 212, 42, 42);
		caseAlambic2.setBorder(new LineBorder(new Color(0, 0, 0)));

		caseAlambic3.setVerticalAlignment(SwingConstants.TOP);
		caseAlambic3.setBounds(373, 188, 42, 42);
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
		txtQuantite.setBorder(null);
		ongletCalcul.add(txtQuantite);
		ongletCalcul.setLayout(null);
		scrollPane_NbIngredient.setBorder(null);
		ongletCalcul.add(scrollPane_NbIngredient);
		ongletCalcul.add(lblImageObjet);
		
		txtQuantite.setBounds(162, 107, 80, 25);
		txtQuantite.setColumns(10);
		txtQuantite.setBackground(new Color(139,139,139));
		
		JList listIngredient = new JList();
		listIngredient.setBorder(null);
		listIngredient.setBackground(new Color(139, 139, 139));
											
		scrollPane_NbIngredient.setBounds(325, 85, 260, 170);
		scrollPane_NbIngredient.setViewportView(listIngredient);
		
		
		lblImageObjet.setVerticalAlignment(SwingConstants.TOP);
		lblImageObjet.setBounds(98, 177, 70, 70);
		lblImageObjet.setBorder(new LineBorder(new Color(0, 0, 0)));
		ongletCalcul.add(lblFondCalcul);
		
		lblFondCalcul.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFondCalcul.setBounds(24, 20, 590, 261);
		
		Image imgCalcul = new ImageIcon(FenPrincipale.class.getResource("/gui/calculateur-minecraft.png")).getImage().getScaledInstance(lblFondCalcul.getWidth(), lblFondCalcul.getHeight(), Image.SCALE_AREA_AVERAGING);
		lblFondCalcul.setIcon(new ImageIcon(imgCalcul));
		
		





		listeSuggestion.requestFocus();
		setVisible(true);

	}



	public void reset(){
		caseCraft1.setIcon(null);
		caseCraft2.setIcon(null);
		caseCraft3.setIcon(null);
		caseCraft4.setIcon(null);
		caseCraft5.setIcon(null);
		caseCraft6.setIcon(null);
		caseCraft7.setIcon(null);
		caseCraft8.setIcon(null);
		caseCraft9.setIcon(null);
		caseCraftResultat.setIcon(null);
		
		caseFour1.setIcon(null);
		caseFourResultat.setIcon(null);
		
		caseAlambic1.setIcon(null);
		caseAlambic2.setIcon(null);
		caseAlambic3.setIcon(null);
		
		 caseIngredientAlambic.setIcon(null);
	}
	
	public void afficheOnglet() {
		switch (onglet.getSelectedIndex()) {
		case 0:
			craft(Recette.getFirst(ERecetteType.craft, recettes));
			break;
		case 1:
			four(Recette.getFirst(ERecetteType.four, recettes));
			break;
		case 2:
			potion(Recette.getFirst(ERecetteType.alambic, recettes));
			break;
		default:
			break;
		}
	}
	
	public void craft(int index){
		Recette r = recettes.get(index);
		
		switch (r.getForme()) {
		case forme:
			if (r.getRecette()[0][0]!=EItem.air) caseCraft1.setIcon(scaleImage(caseCraft1, r.getRecette()[0][0]));
			if (r.getRecette()[0][1]!=EItem.air) caseCraft2.setIcon(scaleImage(caseCraft2, r.getRecette()[0][1]));
			if (r.getRecette()[0][2]!=EItem.air) caseCraft3.setIcon(scaleImage(caseCraft3, r.getRecette()[0][2]));
			if (r.getRecette()[1][0]!=EItem.air) caseCraft4.setIcon(scaleImage(caseCraft4, r.getRecette()[1][0]));
			if (r.getRecette()[1][1]!=EItem.air) caseCraft5.setIcon(scaleImage(caseCraft5, r.getRecette()[1][1]));
			if (r.getRecette()[1][2]!=EItem.air) caseCraft6.setIcon(scaleImage(caseCraft6, r.getRecette()[1][2]));
			if (r.getRecette()[2][0]!=EItem.air) caseCraft7.setIcon(scaleImage(caseCraft7, r.getRecette()[2][0]));
			if (r.getRecette()[2][1]!=EItem.air) caseCraft8.setIcon(scaleImage(caseCraft8, r.getRecette()[2][1]));
			if (r.getRecette()[2][2]!=EItem.air) caseCraft9.setIcon(scaleImage(caseCraft9, r.getRecette()[2][2]));
			
			break;
		case sansforme:
			
			int i = 0;
			ArrayList<EItem> ingredients = r.getIngredients();
			while(i<ingredients.size()) {
				switch (i) {
				case 0:
					caseCraft1.setIcon(scaleImage(caseCraft1, ingredients.get(i)));
					break;
				case 1:
					caseCraft2.setIcon(scaleImage(caseCraft2, ingredients.get(i)));
					break;
				case 2:
					caseCraft3.setIcon(scaleImage(caseCraft3, ingredients.get(i)));
					break;
				case 3:
					caseCraft4.setIcon(scaleImage(caseCraft4, ingredients.get(i)));
					break;
				case 4:
					caseCraft5.setIcon(scaleImage(caseCraft5, ingredients.get(i)));
					break;
				case 5:
					caseCraft6.setIcon(scaleImage(caseCraft6, ingredients.get(i)));
					break;
				case 6:
					caseCraft7.setIcon(scaleImage(caseCraft7, ingredients.get(i)));
					break;
				case 7:
					caseCraft8.setIcon(scaleImage(caseCraft8, ingredients.get(i)));
					break;
				case 8:
					caseCraft9.setIcon(scaleImage(caseCraft9, ingredients.get(i)));
					break;
				default:
					break;
				}
				i++;
			}
			
			break;
		default:
			break;
		}
		
		caseCraftResultat.setIcon(scaleImage(caseCraftResultat, r.getItem().getItem()));
		
	}
	
	public void four(int index){
		
	}
	
	public void potion(int index){
		
	}
	
	public void calculateur(){}
	
	private Icon scaleImage(JComponent component, EItem eItem){
		Image img = eItem.getImage().getScaledInstance(component.getWidth(), component.getHeight(), Image.SCALE_AREA_AVERAGING);
		return new ImageIcon(img);
	}
}