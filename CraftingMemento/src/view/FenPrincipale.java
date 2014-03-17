package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.enums.EItem;
import model.enums.ERecetteType;
import model.enums.Recette;
import view.components.JComboSearchField;

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
	private JLabel caseFour1 = new JLabel();
	private JLabel caseFourResultat = new JLabel();

	//initialisation des éléments dans l'onglet "Potion"
	private JLabel labelFondAlambic = new JLabel();
	private JLabel caseAlambic1 = new JLabel();
	private JLabel caseAlambic2 = new JLabel();
	private JLabel caseAlambic3 = new JLabel();
	private JLabel caseIngredientAlambic = new JLabel();
	private JTextField  txtQuantite = new JTextField();
	private JScrollPane scrollPane_NbIngredient = new JScrollPane();
	private JLabel lblFondCalcul = new JLabel();
	private JLabel lblImageObjet = new JLabel("image");
	private JLabel lblCraftNbItems;



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

		lblCraftNbItems = new JLabel();
		lblCraftNbItems.setBounds(483, 172, 20, 28);
		ongletCraft.add(lblCraftNbItems);

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
		caseFour1.setBorder(null);

		caseFourResultat.setVerticalAlignment(SwingConstants.TOP);
		caseFourResultat.setBounds(404, 132, 70, 70);
		caseFourResultat.setBorder(null);

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
		caseIngredientAlambic.setBorder(null);

		caseAlambic1.setVerticalAlignment(SwingConstants.TOP);
		caseAlambic1.setBounds(211, 177, 56, 56);
		caseAlambic1.setBorder(null);

		caseAlambic2.setVerticalAlignment(SwingConstants.TOP);
		caseAlambic2.setBounds(287, 201, 56, 56);
		caseAlambic2.setBorder(null);

		caseAlambic3.setVerticalAlignment(SwingConstants.TOP);
		caseAlambic3.setBounds(365, 177, 56, 56);
		caseAlambic3.setBorder(null);

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

			try {
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {

						int result = i*3 + j + 1;
						Field f = this.getClass().getDeclaredField("caseCraft"+result);
						boolean access = f.isAccessible();
						f.setAccessible(true);
						JLabel l = (JLabel) f.get(this);
						f.setAccessible(access);
						if (r.getRecette()[i][j]!=EItem.air) l.setIcon(scaleImage(l, r.getRecette()[i][j]));

					}
				}
			}
			catch (Exception e) {}

			break;
		case sansforme:

			int i = 0;
			ArrayList<EItem> ingredients = r.getIngredients();
			try {
				while(i<ingredients.size()) {

					Field f = this.getClass().getDeclaredField("caseCraft"+(i+1));
					boolean access = f.isAccessible();
					f.setAccessible(true);
					JLabel l = (JLabel) f.get(this);
					f.setAccessible(access);
					l.setIcon(scaleImage(l, ingredients.get(i)));

					i++;
				}
			}
			catch (Exception e) {}

			break;
		default:
			break;
		}

		caseCraftResultat.setIcon(scaleImage(caseCraftResultat, r.getItem().getItem()));
		if(r.getItem().getQuantite()>1) {
			lblCraftNbItems.setIcon(scaleImage(lblCraftNbItems, r.getItem().getQuantite()));
		}

	}

	private Icon scaleImage(JLabel component, int quantite) {
		Image img = Toolkit.getDefaultToolkit().getImage(FenPrincipale.class.getResource("/gui/"+quantite+".png")).getScaledInstance(component.getWidth(), component.getHeight(), Image.SCALE_AREA_AVERAGING);
		return new ImageIcon(img);
	}



	public void four(int index){
		Recette r = recettes.get(index);

		caseFour1.setIcon(scaleImage(caseFour1, r.getIngredients().get(0)));
		caseFourResultat.setIcon(scaleImage(caseFourResultat, r.getItem().getItem()));
	}

	public void potion(int index){
		Recette r = recettes.get(index);

		EItem result = r.getItem().getItem();

		caseIngredientAlambic.setIcon(scaleImage(caseIngredientAlambic, r.getIngredients().get(0)));

		caseAlambic1.setIcon(scaleImage(caseAlambic1, result));
		caseAlambic2.setIcon(scaleImage(caseAlambic2, result));
		caseAlambic3.setIcon(scaleImage(caseAlambic3, result));

	}

	public void calculateur(){}

	private Icon scaleImage(JComponent component, EItem eItem){
		Image img = eItem.getImage().getScaledInstance(component.getWidth(), component.getHeight(), Image.SCALE_AREA_AVERAGING);
		return new ImageIcon(img);
	}
}