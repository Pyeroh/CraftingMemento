package view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
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



	public FenPrincipale() {
		caseCraft2.setBounds(99, 109, 48, 47);
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
		caseCraft3.setBounds(157, 109, 48, 47);
		caseCraft3.setBorder(new LineBorder(new Color(0, 0, 0)));
		ongletCraft.setLayout(null);
		ongletCraft.add(txtObjetRecherch);
		ongletCraft.add(labelCraft1);
		ongletCraft.add(caseCraft1);
		ongletCraft.add(caseCraft2);
		ongletCraft.add(caseCraft3);
		caseCraft4.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft4.setBounds(41, 167, 48, 47);

		ongletCraft.add(caseCraft4);
		caseCraft5.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft5.setBounds(99, 167, 48, 47);

		ongletCraft.add(caseCraft5);
		caseCraft6.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft6.setBounds(157, 167, 48, 47);

		ongletCraft.add(caseCraft6);
		caseCraft7.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft7.setBounds(41, 225, 48, 47);

		ongletCraft.add(caseCraft7);

		JLabel caseCraft8 = new JLabel("New label");
		caseCraft8.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft8.setBounds(99, 225, 48, 47);
		ongletCraft.add(caseCraft8);

		JLabel caseCraft9 = new JLabel("New label");
		caseCraft9.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraft9.setBounds(157, 225, 48, 47);
		ongletCraft.add(caseCraft9);

		JLabel caseCraftResultat = new JLabel("New label");
		caseCraftResultat.setBorder(new LineBorder(new Color(0, 0, 0)));
		caseCraftResultat.setBounds(489, 167, 48, 47);
		ongletCraft.add(caseCraftResultat);
		lblFondGrille.setBounds(237, 97, 224, 175);
		Image img = new ImageIcon(FenPrincipale.class.getResource("/gui/crafting_table.png")).getImage().getScaledInstance(lblFondGrille.getWidth(), lblFondGrille.getHeight(), Image.SCALE_AREA_AVERAGING);
		lblFondGrille.setIcon(new ImageIcon(img));

		ongletCraft.add(lblFondGrille);


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