package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.enums.EItem;
import model.enums.ERecetteType;
import model.enums.Recette;
import view.components.JComboSearchField;
import view.components.MCImage;
import view.components.ShadowLabel;
import view.event.SearchedItemChangeListener;

public class FenPrincipale extends JFrame {

	private static final long serialVersionUID = 2540259731678095668L;

	private ArrayList<Recette> recettes;

	// initialisation onglets
	private JTabbedPane onglet = new JTabbedPane();
	private JPanel ongletCraft = new JPanel();
	private JPanel ongletFour = new JPanel();
	private JPanel ongletPotion = new JPanel();
	private JPanel ongletCalcul = new JPanel();
	private JComboSearchField txtObjetRecherch;

	// initialisation des �l�ments dans l'onglet "Craft"
	private JLabel lblFabrication;
	private JLabel labelRecherche = new JLabel(
			"Veuillez saisir le nom de l'objet recherch�.");
	private JLabel lblFondGrille = new JLabel();
	private MCImage caseCraft1 = new MCImage(ongletCraft);
	private MCImage caseCraft2 = new MCImage(ongletCraft);
	private MCImage caseCraft3 = new MCImage(ongletCraft);
	private MCImage caseCraft4 = new MCImage(ongletCraft);
	private MCImage caseCraft5 = new MCImage(ongletCraft);
	private MCImage caseCraft6 = new MCImage(ongletCraft);
	private MCImage caseCraft7 = new MCImage(ongletCraft);
	private MCImage caseCraft8 = new MCImage(ongletCraft);
	private MCImage caseCraft9 = new MCImage(ongletCraft);
	private MCImage caseCraftResultat = new MCImage(ongletCraft);
	private ShadowLabel lblCraftNbItems;
	private JButton btnCraftAvant;
	private JButton btnCraftApres;

	// initialisation des �l�ments dans l'onglet "Four"
	private JLabel lblFourneau;
	private JLabel lblFondFour = new JLabel();
	private MCImage caseFour1 = new MCImage(ongletFour);
	private MCImage caseFourResultat = new MCImage(ongletFour);

	// initialisation des �l�ments dans l'onglet "Potion"
	private JLabel lblAlambic;
	private JLabel labelFondAlambic = new JLabel();
	private MCImage caseAlambic1 = new MCImage(ongletPotion);
	private MCImage caseAlambic2 = new MCImage(ongletPotion);
	private MCImage caseAlambic3 = new MCImage(ongletPotion);
	private MCImage caseIngredientAlambic = new MCImage(ongletPotion);

	// initialisation des �l�ments dans l'onglet "Calcul"
	private JLabel lblCalculateur;
	private JLabel lblQte = new JLabel("qt\u00E9");
	private JFormattedTextField txtQuantite = new JFormattedTextField(NumberFormat.getIntegerInstance());
	private JScrollPane scrollPane_NbIngredient = new JScrollPane();
	private JLabel lblFondCalcul = new JLabel();
	private MCImage caseCalcul = new MCImage(ongletCalcul);

	private int[] indices = {-1, -1, -1};
	private JButton btnFourAvant;
	private JButton btnFourApres;
	private JButton btnPotionAvant;
	private JButton btnPotionApres;

	public FenPrincipale() {

		// Objets de la fen�tre principale
		setTitle("CraftingMemento - V1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(665, 682);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		MouseAdapter switchListener = new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				JButton btn = (JButton) e.getSource();
				if (btn == btnCraftAvant) {
					craft(Recette.getPrevious(indices[0], recettes));
				}
				if (btn == btnCraftApres) {
					craft(Recette.getNext(indices[0], recettes));
				}
				if (btn == btnFourAvant) {
					four(Recette.getPrevious(indices[1], recettes));
				}
				if (btn == btnFourApres) {
					four(Recette.getNext(indices[1], recettes));
				}
				if (btn == btnPotionAvant) {
					potion(Recette.getPrevious(indices[2], recettes));
				}
				if (btn == btnPotionApres) {
					potion(Recette.getNext(indices[2], recettes));
				}
			}
		};

		onglet.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (isVisible()) {
					afficheOnglet();
				}
			}
		});
		getContentPane().add(onglet);
		onglet.setBounds(0, 32, 649, 345);

		labelRecherche.setBounds(10, 9, 257, 22);
		getContentPane().add(labelRecherche);

		txtObjetRecherch = new JComboSearchField();
		txtObjetRecherch.addSearchedItemChangeListener(new SearchedItemChangeListener() {

			@Override
			public void searchedItemChanged(EItem item) {
				recettes = Recette.getRecettes(item);

				reset();
				afficheOnglet();

			}
		});
		txtObjetRecherch.setPrompt("Objet recherch�...");
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

		// onglet Craft

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

		btnCraftAvant = new JButton();
		btnCraftAvant.setVisible(false);
		btnCraftAvant.setBorder(null);
		btnCraftAvant.setIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_avant.png")));
		btnCraftAvant.setPressedIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_avant_push.png")));
		btnCraftAvant.setBounds(74, 38, 32, 32);
		btnCraftAvant.addMouseListener(switchListener);
		ongletCraft.add(btnCraftAvant);

		btnCraftApres = new JButton();
		btnCraftApres.setVisible(false);
		btnCraftApres.setIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_apres.png")));
		btnCraftApres.setPressedIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_apres_push.png")));
		btnCraftApres.setBorder(null);
		btnCraftApres.setBounds(319, 38, 32, 32);
		btnCraftApres.addMouseListener(switchListener);
		ongletCraft.add(btnCraftApres);

		lblFabrication = new JLabel("Fabrication");
		lblFabrication.setHorizontalAlignment(SwingConstants.CENTER);
		lblFabrication.setFont(new Font("Minecraftia", Font.PLAIN, 27));
		lblFabrication.setForeground(new Color(86, 86, 86));
		lblFabrication.setBounds(118, 38, 189, 27);
		ongletCraft.add(lblFabrication);

		lblCraftNbItems = new ShadowLabel();
		lblCraftNbItems.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCraftNbItems.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCraftNbItems.setFont(new Font("Minecraftia", Font.PLAIN, 16));
		lblCraftNbItems.setBackground(new Color(63, 63, 63));
		lblCraftNbItems.setForeground(Color.white);
		lblCraftNbItems.setBounds(461, 164, 42, 36);
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

		Image imgCraft = new ImageIcon(FenPrincipale.class.getResource("/gui/tablecraft-minecraft.png")).getImage().getScaledInstance(lblFondGrille.getWidth(),lblFondGrille.getHeight(), Image.SCALE_AREA_AVERAGING);
		lblFondGrille.setIcon(new ImageIcon(imgCraft));

		// onglet Four

		onglet.addTab("Four", ongletFour);

		caseFour1.setBounds(216, 84, 42, 42);
		caseFour1.setBorder(null);

		caseFourResultat.setVerticalAlignment(SwingConstants.TOP);
		caseFourResultat.setBounds(404, 132, 70, 70);
		caseFourResultat.setBorder(null);

		ongletFour.setLayout(null);

		btnFourAvant = new JButton();
		btnFourAvant.setVisible(false);
		btnFourAvant.setBorder(null);
		btnFourAvant.setBounds(177, 37, 32, 32);
		btnFourAvant.setIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_avant.png")));
		btnFourAvant.setPressedIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_avant_push.png")));
		btnFourAvant.addMouseListener(switchListener);
		ongletFour.add(btnFourAvant);

		btnFourApres = new JButton();
		btnFourApres.setVisible(false);
		btnFourApres.setBorder(null);
		btnFourApres.setBounds(422, 37, 32, 32);
		btnFourApres.setIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_apres.png")));
		btnFourApres.setPressedIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_apres_push.png")));
		btnFourApres.addMouseListener(switchListener);
		ongletFour.add(btnFourApres);

		lblFourneau = new JLabel("Fourneau");
		lblFourneau.setHorizontalAlignment(SwingConstants.CENTER);
		lblFourneau.setForeground(new Color(86, 86, 86));
		lblFourneau.setFont(new Font("Minecraftia", Font.PLAIN, 27));
		lblFourneau.setBounds(237, 37, 162, 27);
		ongletFour.add(lblFourneau);

		ongletFour.add(caseFour1);
		ongletFour.add(caseFourResultat);
		ongletFour.add(lblFondFour);

		lblFondFour.setBounds(24, 20, 590, 261);
		lblFondFour.setVerticalAlignment(SwingConstants.BOTTOM);

		Image imgFour = new ImageIcon(
				FenPrincipale.class.getResource("/gui/four-minecraft.png"))
		.getImage().getScaledInstance(lblFondFour.getWidth(),
				lblFondFour.getHeight(), Image.SCALE_AREA_AVERAGING);
		lblFondFour.setIcon(new ImageIcon(imgFour));

		// onglet Potion

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

		btnPotionAvant = new JButton();
		btnPotionAvant.setVisible(false);
		btnPotionAvant.setIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_avant.png")));
		btnPotionAvant.setPressedIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_avant_push.png")));
		btnPotionAvant.setBorder(null);
		btnPotionAvant.setBounds(197, 36, 32, 32);
		btnPotionAvant.addMouseListener(switchListener);
		ongletPotion.add(btnPotionAvant);

		btnPotionApres = new JButton();
		btnPotionApres.setVisible(false);
		btnPotionApres.setIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_apres.png")));
		btnPotionApres.setPressedIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/fleche_apres_push.png")));
		btnPotionApres.setBorder(null);
		btnPotionApres.setBounds(405, 36, 32, 32);
		btnPotionApres.addMouseListener(switchListener);
		ongletPotion.add(btnPotionApres);

		lblAlambic = new JLabel("Alambic");
		lblAlambic.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlambic.setForeground(new Color(86, 86, 86));
		lblAlambic.setFont(new Font("Minecraftia", Font.PLAIN, 27));
		lblAlambic.setBounds(262, 36, 117, 27);

		ongletPotion.add(lblAlambic);

		ongletPotion.add(caseIngredientAlambic);
		ongletPotion.add(caseAlambic1);
		ongletPotion.add(caseAlambic2);
		ongletPotion.add(caseAlambic3);
		ongletPotion.add(labelFondAlambic);

		Image imgAlambic = new ImageIcon(
				FenPrincipale.class.getResource("/gui/alambic-minecraft.png"))
		.getImage().getScaledInstance(labelFondAlambic.getWidth(),
				labelFondAlambic.getHeight(),
				Image.SCALE_AREA_AVERAGING);
		labelFondAlambic.setIcon(new ImageIcon(imgAlambic));

		// onglet Calcul

		onglet.addTab("Calcul", ongletCalcul);

		lblCalculateur = new JLabel("Calculateur");
		lblCalculateur.setBounds(119, 38, 194, 27);
		ongletCalcul.add(lblCalculateur);
		lblCalculateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculateur.setForeground(new Color(86, 86, 86));
		lblCalculateur.setFont(new Font("Minecraftia", Font.PLAIN, 27));
		lblQte.setHorizontalAlignment(SwingConstants.CENTER);
		lblQte.setForeground(new Color(86, 86, 86));
		lblQte.setFont(new Font("Minecraftia", Font.PLAIN, 27));
		lblQte.setBounds(85, 97, 54, 36);

		ongletCalcul.add(lblQte);
		txtQuantite.setBorder(null);
		ongletCalcul.add(txtQuantite);
		ongletCalcul.setLayout(null);
		scrollPane_NbIngredient.setBorder(null);
		ongletCalcul.add(scrollPane_NbIngredient);
		ongletCalcul.add(caseCalcul);

		txtQuantite.setBounds(165, 111, 75, 18);
		txtQuantite.setColumns(10);
		txtQuantite.setBackground(new Color(139, 139, 139));

		JList listIngredient = new JList();
		listIngredient.setBorder(null);
		listIngredient.setBackground(new Color(139, 139, 139));

		scrollPane_NbIngredient.setBounds(325, 85, 260, 170);
		scrollPane_NbIngredient.setViewportView(listIngredient);

		caseCalcul.setVerticalAlignment(SwingConstants.TOP);
		caseCalcul.setBounds(98, 177, 70, 70);
		ongletCalcul.add(lblFondCalcul);

		lblFondCalcul.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFondCalcul.setBounds(24, 20, 590, 261);

		Image imgCalcul = new ImageIcon(
				FenPrincipale.class
				.getResource("/gui/calculateur-minecraft.png"))
		.getImage().getScaledInstance(lblFondCalcul.getWidth(),
				lblFondCalcul.getHeight(), Image.SCALE_AREA_AVERAGING);
		lblFondCalcul.setIcon(new ImageIcon(imgCalcul));

		listeSuggestion.requestFocus();
		setVisible(true);

	}

	public void reset() {
		resetCraft();

		resetFour();

		resetPotion();

		indices[0] = -1;
		indices[1] = -1;
		indices[2] = -1;
	}

	private void resetCraft() {
		caseCraft1.setItem(EItem.air);
		caseCraft2.setItem(EItem.air);
		caseCraft3.setItem(EItem.air);
		caseCraft4.setItem(EItem.air);
		caseCraft5.setItem(EItem.air);
		caseCraft6.setItem(EItem.air);
		caseCraft7.setItem(EItem.air);
		caseCraft8.setItem(EItem.air);
		caseCraft9.setItem(EItem.air);
		caseCraftResultat.setItem(EItem.air);
		lblCraftNbItems.setText(null);
	}

	private void resetFour() {
		caseFour1.setItem(EItem.air);
		caseFourResultat.setItem(EItem.air);
	}

	private void resetPotion() {
		caseAlambic1.setItem(EItem.air);
		caseAlambic2.setItem(EItem.air);
		caseAlambic3.setItem(EItem.air);
		caseIngredientAlambic.setItem(EItem.air);
	}

	public void afficheOnglet() {
		if (recettes == null) return;

		int index;
		switch (onglet.getSelectedIndex()) {
		case 0:
			index = Recette.getFirst(ERecetteType.craft, recettes);
			boolean autre = Recette.getNext(index, recettes) != index;
			btnCraftAvant.setVisible(autre);
			btnCraftApres.setVisible(autre);
			craft(index);
			break;
		case 1:
			index = Recette.getFirst(ERecetteType.four, recettes);
			autre = Recette.getNext(index, recettes) != index;
			btnFourAvant.setVisible(autre);
			btnFourApres.setVisible(autre);
			four(index);
			break;
		case 2:
			index = Recette.getFirst(ERecetteType.alambic, recettes);
			autre = Recette.getNext(index, recettes) != index;
			btnPotionAvant.setVisible(autre);
			btnPotionApres.setVisible(autre);
			potion(index);
			break;
		case 3:
			calculateur();
			break;
		default:
			System.out.println("Onglet rajout� et non-g�r� !");
			break;
		}
	}

	public void craft(int index) {

		resetCraft();

		if (index == -1) return;
		indices[0] = index;

		Recette r = recettes.get(index);

		switch (r.getForme()) {
		case forme:

			try {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {

						int result = i * 3 + j + 1;
						Field f = this.getClass().getDeclaredField(
								"caseCraft" + result);
						boolean access = f.isAccessible();
						f.setAccessible(true);
						MCImage l = (MCImage) f.get(this);
						f.setAccessible(access);
						l.setItem(r.getRecette()[i][j]);

					}
				}
			} catch (Exception e) {
			}

			break;
		case sansforme:

			int i = 0;
			ArrayList<EItem> ingredients = r.getIngredients();
			try {
				while (i < ingredients.size()) {

					Field f = this.getClass().getDeclaredField(
							"caseCraft" + (i + 1));
					boolean access = f.isAccessible();
					f.setAccessible(true);
					MCImage l = (MCImage) f.get(this);
					f.setAccessible(access);
					l.setItem(ingredients.get(i));

					i++;
				}
			} catch (Exception e) {
			}

			break;
		default:
			break;
		}

		caseCraftResultat.setItem(r.getItem().getItem());
		if (r.getItem().getQuantite() > 1) {
			lblCraftNbItems.setText(r.getItem().getQuantite() + "");
		}

	}

	public void four(int index) {

		resetFour();

		if (index == -1) return;
		indices[1] = index;

		Recette r = recettes.get(index);

		caseFour1.setItem(r.getIngredients().get(0));
		caseFourResultat.setItem(r.getItem().getItem());
	}

	public void potion(int index) {

		resetPotion();

		if (index == -1) return;
		indices[2] = index;

		Recette r = recettes.get(index);

		EItem result = r.getItem().getItem();

		caseIngredientAlambic.setItem(r.getIngredients().get(0));

		caseAlambic1.setItem(result);
		caseAlambic2.setItem(result);
		caseAlambic3.setItem(result);

	}

	public void calculateur() {
		caseCalcul.setItem(txtObjetRecherch.getItem());
	}
}