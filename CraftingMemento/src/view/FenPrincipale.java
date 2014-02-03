package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JList;

public class FenPrincipale extends JFrame {

	private static final long serialVersionUID = 2540259731678095668L;
	
	
		JTabbedPane onglet = new JTabbedPane();
		JPanel ongletCraft=new JPanel();
		JPanel ongletFour=new JPanel();
		JPanel ongletPotion=new JPanel();
		JPanel ongletCalcul=new JPanel();
		private JTextField txtObjetRecherch;
	
	
	public FenPrincipale() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(739,415);
		getContentPane().setLayout(null);
		getContentPane().add(onglet);
		onglet.setBounds(0, 0, 723, 377);
		
		
		
		//onglet Craft
		
		onglet.addTab("Craft", ongletCraft);
		
		JLabel labelCraft1 = new JLabel("Veuillez saisir le nom de l'objet recherché.");
		
		txtObjetRecherch = new JTextField();
		txtObjetRecherch.setText("Objet recherch\u00E9...");
		txtObjetRecherch.setColumns(10);
		
		JButton btnNewButton = new JButton("rechercher");
		
		
		
		//généré automatiquement par eclipse
		GroupLayout gl_ongletCraft = new GroupLayout(ongletCraft);
		gl_ongletCraft.setHorizontalGroup(
			gl_ongletCraft.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ongletCraft.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_ongletCraft.createParallelGroup(Alignment.LEADING)
						.addComponent(txtObjetRecherch, 200, 200, 200)
						.addComponent(labelCraft1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton)
					.addContainerGap(413, Short.MAX_VALUE))
		);
		gl_ongletCraft.setVerticalGroup(
			gl_ongletCraft.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ongletCraft.createSequentialGroup()
					.addContainerGap()
					.addComponent(labelCraft1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_ongletCraft.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtObjetRecherch, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addContainerGap(281, Short.MAX_VALUE))
		);
		ongletCraft.setLayout(gl_ongletCraft);
		
		
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
