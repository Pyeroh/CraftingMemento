package view;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import javax.swing.*;
import javax.swing.event.*;

import model.Ingredients;
import model.Item;
import model.enums.*;
import view.components.*;
import view.components.cells.CellListEItem;
import view.components.cells.CellListItem;
import view.event.SearchedItemChangeListener;

public class FenPrincipale extends JFrame {

	private static final long serialVersionUID = 2540259731678095668L;

	private ArrayList<Recette> recettes;
	private ArrayList<Recette> directRecettes;
	private ArrayList<Ingredients> calc;

	// initialisation onglets
	private JTabbedPane onglet = new JTabbedPane();
	private JPanel ongletCraft = new JPanel();
	private JPanel ongletFour = new JPanel();
	private JPanel ongletPotion = new JPanel();
	private JPanel ongletCalcul = new JPanel();
	private JComboSearchField txtObjetRecherch;

	// initialisation des éléments dans l'onglet "Craft"
	private JLabel lblFabrication;
	private JLabel labelRecherche = new JLabel(
			"Veuillez saisir le nom de l'objet recherché.");
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

	// initialisation des éléments dans l'onglet "Four"
	private JLabel lblFourneau;
	private JLabel lblFondFour = new JLabel();
	private MCImage caseFour1 = new MCImage(ongletFour);
	private MCImage caseFourResultat = new MCImage(ongletFour);

	// initialisation des éléments dans l'onglet "Potion"
	private JLabel lblAlambic;
	private JLabel labelFondAlambic = new JLabel();
	private MCImage caseAlambic1 = new MCImage(ongletPotion);
	private MCImage caseAlambic2 = new MCImage(ongletPotion);
	private MCImage caseAlambic3 = new MCImage(ongletPotion);
	private MCImage caseIngredientAlambic = new MCImage(ongletPotion);

	// initialisation des éléments dans l'onglet "Calcul"
	private JLabel lblCalculateur;
	private JLabel lblQte = new JLabel("qt\u00E9");
	private JFormattedTextField txtQuantite = new JFormattedTextField(NumberFormat.getIntegerInstance());
	private JScrollPane scrollPane_NbIngredient = new JScrollPane();
	private JLabel lblFondCalcul = new JLabel();
	private MCImage caseCalcul = new MCImage(ongletCalcul);

	/**
	 * <ul>
	 * <li>0 : craft</li>
	 * <li>1 : four</li>
	 * <li>2 : potion</li>
	 * <li>3 : position dans ingrédients calculés</li>
	 * </ul>
	 */
	private int[] indices = {-1, -1, -1, -1};
	private JButton btnFourAvant;
	private JButton btnFourApres;
	private JButton btnPotionAvant;
	private JButton btnPotionApres;
	private JHoverList<CellListEItem> listeSuggestion;
	private JScrollPane scrollPane_suggestion;
	private JSeparator separator;
	private JHoverList<CellListItem> listIngredient;
	private RoundedPanel pan_infos;
	private JLabel lblIDMC;
	private JLabel lblStack;
	private JLabel lblOnglet = new JLabel("Onglet cr\u00E9atif :");
	private JLabel lblVersion = new JLabel("Version :");
	private JLabel lblTransparent = new JLabel("Transparence :");
	private JLabel lblCarburant = new JLabel("Carburant :");
	private JLabel lblRenouvelable = new JLabel("Renouvelable :");
	private JLabel lblIDMCInfo;
	private JLabel lblStackInfo;
	private JLabel lblOngletInfo;
	private JLabel lblVersionInfo;
	private JCheckBox chkTransparentInfo;
	private JCheckBox chkCarburantInfo;
	private JCheckBox chkRenouvelableInfo;
	private JLabel lblMetadata = new JLabel("Metadata :");
	private JLabel lblMetadataInfo = new JLabel("");
	private JCheckBox chkIngredientsPrimaires;
	private JLabel lblShapeless;

	public FenPrincipale() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FenPrincipale.class.getResource("/gui/eitems/blocks/58_0.png")));

		// Objets de la fenêtre principale
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

		MouseAdapter displayedItemsListener = new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				MCImage image = (MCImage) e.getSource();
				if (image.getItem() != EItem.air) {
					txtObjetRecherch.setText(image.getItem().getGuiName());
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
				directRecettes = Recette.getDirectRecettes(item);

				afficheInfos(item);

				reset();
				afficheOnglet();

				actualiseLinkedRecettes();

			}
		});
		txtObjetRecherch.setPrompt("Objet recherché...");
		txtObjetRecherch.setInstantSearchDelay(250);
		txtObjetRecherch.setBounds(261, 6, 200, 29);
		txtObjetRecherch.setMargin(new Insets(0, 4, 0, 0));
		getContentPane().add(txtObjetRecherch);
		txtObjetRecherch.setColumns(10);

		separator = new JSeparator();
		separator.setBounds(0, 376, 649, 14);
		getContentPane().add(separator);

		scrollPane_suggestion = new JScrollPane();
		scrollPane_suggestion.setBounds(10, 384, 314, 254);
		getContentPane().add(scrollPane_suggestion);

		listeSuggestion = new JHoverList<>();
		listeSuggestion.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting() && listeSuggestion.isFocusOwner() && listeSuggestion.getSelectedIndex() != -1) {
					txtObjetRecherch.setText(listeSuggestion.getSelectedValue().getEItem().getGuiName());
				}
			}
		});
		scrollPane_suggestion.setViewportView(listeSuggestion);

		// onglet Craft

		onglet.addTab("Craft", ongletCraft);

		lblFondGrille.setBounds(24, 20, 593, 261);

		caseCraft1.setBorder(null);
		caseCraft1.addMouseListener(displayedItemsListener);
		caseCraft1.setBounds(130, 84, 42, 42);

		caseCraft2.setBorder(null);
		caseCraft2.addMouseListener(displayedItemsListener);
		caseCraft2.setBounds(191, 84, 42, 42);

		caseCraft3.setBounds(251, 84, 42, 42);
		caseCraft3.addMouseListener(displayedItemsListener);
		caseCraft3.setBorder(null);

		caseCraft4.setBounds(130, 145, 42, 42);
		caseCraft4.addMouseListener(displayedItemsListener);
		caseCraft4.setBorder(null);

		caseCraft5.setBounds(191, 145, 42, 42);
		caseCraft5.addMouseListener(displayedItemsListener);
		caseCraft5.setBorder(null);

		caseCraft6.setBounds(251, 145, 42, 42);
		caseCraft6.addMouseListener(displayedItemsListener);
		caseCraft6.setBorder(null);

		caseCraft7.setBounds(130, 206, 42, 42);
		caseCraft7.addMouseListener(displayedItemsListener);
		caseCraft7.setBorder(null);

		caseCraft8.setBounds(191, 206, 42, 42);
		caseCraft8.addMouseListener(displayedItemsListener);
		caseCraft8.setBorder(null);

		caseCraft9.setBounds(251, 206, 42, 42);
		caseCraft9.addMouseListener(displayedItemsListener);
		caseCraft9.setBorder(null);

		caseCraftResultat.setBounds(433, 130, 70, 70);
		caseCraftResultat.addMouseListener(displayedItemsListener);
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

		lblShapeless = new JLabel("");
		lblShapeless.setToolTipText("Les ingr\u00E9dients peuvent \u00EAtre pla\u00E7\u00E9s n'importe o\u00F9 sur la grille");
		lblShapeless.setIcon(new ImageIcon(FenPrincipale.class.getResource("/gui/shapeless.png")));
		lblShapeless.setBounds(361, 206, 19, 15);
		lblShapeless.setVisible(false);
		ongletCraft.add(lblShapeless);

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
		caseFour1.addMouseListener(displayedItemsListener);
		caseFour1.setBorder(null);

		caseFourResultat.addMouseListener(displayedItemsListener);
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

		Image imgFour = new ImageIcon(FenPrincipale.class.getResource("/gui/four-minecraft.png")).getImage().getScaledInstance(lblFondFour.getWidth(), lblFondFour.getHeight(), Image.SCALE_AREA_AVERAGING);
		lblFondFour.setIcon(new ImageIcon(imgFour));

		// onglet Potion

		onglet.addTab("Potion", ongletPotion);
		ongletPotion.setLayout(null);

		labelFondAlambic.setBounds(24, 20, 590, 261);

		caseIngredientAlambic.addMouseListener(displayedItemsListener);
		caseIngredientAlambic.setBounds(294, 84, 42, 42);
		caseIngredientAlambic.setBorder(null);

		caseAlambic1.addMouseListener(displayedItemsListener);
		caseAlambic1.setBounds(211, 177, 56, 56);
		caseAlambic1.setBorder(null);

		caseAlambic2.addMouseListener(displayedItemsListener);
		caseAlambic2.setBounds(287, 201, 56, 56);
		caseAlambic2.setBorder(null);

		caseAlambic3.addMouseListener(displayedItemsListener);
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
		ongletCalcul.add(txtQuantite);
		ongletCalcul.setLayout(null);
		ongletCalcul.add(scrollPane_NbIngredient);

		chkIngredientsPrimaires = new JCheckBox("Ingr\u00E9dients primaires");
		chkIngredientsPrimaires.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				afficheOnglet();
			}
		});
		chkIngredientsPrimaires.setBounds(437, 51, 148, 18);
		ongletCalcul.add(chkIngredientsPrimaires);
		ongletCalcul.add(caseCalcul);

		txtQuantite.setBorder(null);
		txtQuantite.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Object oldValue = txtQuantite.getValue();
				try {
					txtQuantite.commitEdit();
				}
				catch (ParseException e1) {
				}
				if (txtQuantite.getValue() != null && !txtQuantite.getValue().equals(oldValue)) {
					afficheOnglet();
				}
			}
		});
		txtQuantite.setBounds(165, 111, 75, 18);
		txtQuantite.setColumns(10);
		txtQuantite.setBackground(new Color(139, 139, 139));

		listIngredient = new JHoverList<>();
		listIngredient.setBorder(null);
		listIngredient.setBackground(new Color(139, 139, 139));

		scrollPane_NbIngredient.setBounds(325, 85, 260, 170);
		scrollPane_NbIngredient.setViewportView(listIngredient);
		scrollPane_NbIngredient.setBorder(null);

		caseCalcul.setVerticalAlignment(SwingConstants.TOP);
		caseCalcul.setBounds(98, 177, 70, 70);
		ongletCalcul.add(lblFondCalcul);

		lblFondCalcul.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFondCalcul.setBounds(24, 20, 590, 261);

		Image imgCalcul = new ImageIcon(FenPrincipale.class.getResource("/gui/calculateur-minecraft.png")).getImage().getScaledInstance(lblFondCalcul.getWidth(), lblFondCalcul.getHeight(), Image.SCALE_AREA_AVERAGING);
		lblFondCalcul.setIcon(new ImageIcon(imgCalcul));

		pan_infos = new RoundedPanel();
		pan_infos.setBounds(336, 389, 307, 249);
		getContentPane().add(pan_infos);
		pan_infos.setLayout(null);

		lblIDMC = new JLabel("ID Minecraft :");
		lblIDMC.setBounds(6, 6, 95, 16);
		pan_infos.add(lblIDMC);
		lblMetadata.setBounds(6, 34, 95, 16);

		pan_infos.add(lblMetadata);

		lblStack = new JLabel("Stackable par :");
		lblStack.setBounds(6, 62, 95, 16);
		pan_infos.add(lblStack);
		lblOnglet.setBounds(6, 90, 95, 16);

		pan_infos.add(lblOnglet);
		lblVersion.setBounds(6, 118, 95, 16);

		pan_infos.add(lblVersion);
		lblTransparent.setBounds(6, 146, 95, 16);

		pan_infos.add(lblTransparent);
		lblCarburant.setBounds(6, 174, 95, 16);

		pan_infos.add(lblCarburant);
		lblRenouvelable.setBounds(6, 202, 95, 16);

		pan_infos.add(lblRenouvelable);

		lblIDMCInfo = new JLabel("");
		lblIDMCInfo.setBounds(113, 6, 160, 16);
		pan_infos.add(lblIDMCInfo);
		lblMetadataInfo.setBounds(113, 34, 160, 16);

		pan_infos.add(lblMetadataInfo);

		lblStackInfo = new JLabel("");
		lblStackInfo.setBounds(113, 62, 160, 16);
		pan_infos.add(lblStackInfo);

		lblOngletInfo = new JLabel("");
		lblOngletInfo.setBounds(113, 90, 160, 16);
		pan_infos.add(lblOngletInfo);

		lblVersionInfo = new JLabel("");
		lblVersionInfo.setBounds(113, 118, 160, 16);
		pan_infos.add(lblVersionInfo);

		ItemListener readOnlyListener = new ItemListener() {

			private boolean focus = false;

			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox source = (JCheckBox) e.getSource();
				focus = !focus;
				if (focus && source.hasFocus()) {
					source.setSelected(!source.isSelected());
				}
			}
		};

		chkTransparentInfo = new JCheckBox("");
		chkTransparentInfo.addItemListener(readOnlyListener);
		chkTransparentInfo.setBounds(113, 146, 18, 16);
		pan_infos.add(chkTransparentInfo);

		chkCarburantInfo = new JCheckBox("");
		chkCarburantInfo.addItemListener(readOnlyListener);
		chkCarburantInfo.setBounds(113, 174, 18, 16);
		pan_infos.add(chkCarburantInfo);

		chkRenouvelableInfo = new JCheckBox("");
		chkRenouvelableInfo.addItemListener(readOnlyListener);
		chkRenouvelableInfo.setBounds(113, 202, 18, 16);
		pan_infos.add(chkRenouvelableInfo);

		setVisible(true);

	}

	public void afficheInfos(EItem item) {

		EItemInfo info = EItemInfo.getBy(item);

		lblIDMCInfo.setText(item.getRealName());
		lblMetadataInfo.setText(item.getMeta() + "");
		lblStackInfo.setText(info.getSize() + "");
		lblOngletInfo.setText(item.getCategory().getGui_name());
		lblVersionInfo.setText(info.getVersion());
		chkTransparentInfo.setSelected(info.isTransparent());
		chkCarburantInfo.setSelected(info.isCarburant());
		chkRenouvelableInfo.setSelected(info.isRenouvelable());

	}

	public void actualiseLinkedRecettes() {

		DefaultListModel<CellListEItem> model = new DefaultListModel<>();
		LinkedHashSet<EItem> lhsModel = new LinkedHashSet<>();

		for (Recette recette : recettes) {

			lhsModel.add(recette.getItem().getItem());
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					switch (recette.getForme()) {
					case forme:
						lhsModel.add(recette.getRecette()[j][k]);
						break;
					case sansforme:
						int result = j * 3 + k;
						if (result < recette.getIngredients().size()) {
							lhsModel.add(recette.getIngredients().get(result));
						}
						break;
					default:
						break;
					}
				}
			}

		}

		lhsModel.remove(EItem.air);
		lhsModel.remove(txtObjetRecherch.getItem());

		for (EItem item : lhsModel) {
			model.addElement(new CellListEItem(item));
		}

		listeSuggestion.setModel(model);

	}

	public void reset() {
		resetCraft();

		resetFour();

		resetPotion();

		indices = new int[]{-1, -1, -1, -1};

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
		lblShapeless.setVisible(false);
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

	private void resetCalc() {

		listIngredient.setModel(new DefaultListModel<CellListItem>());

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
			if (directRecettes.size() == 0) {
				index = -1;
			} else {
				index = indices[2];
			}

			calculateur(index);

			break;
		default:
			System.out.println("Onglet rajouté et non-géré !");
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
			} catch (Exception e) {}

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
			} catch (Exception e) {}
			lblShapeless.setVisible(true);

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

	public void calculateur(int index) {

		caseCalcul.setItem(txtObjetRecherch.getItem());

		resetCalc();
		if (index == -1) return;
		indices[3] = index;

		if (txtQuantite.getValue() != null) {
			calc = Recette.calcule(txtObjetRecherch.getItem(), ((Number)txtQuantite.getValue()).intValue(), chkIngredientsPrimaires.isSelected());

			DefaultListModel<CellListItem> model = new DefaultListModel<>();
			if (!calc.isEmpty()) {
				for (Item item : calc.get(0)) {
					model.addElement(new CellListItem(item));
				}
			}

			listIngredient.setModel(model);

		}

	}
}