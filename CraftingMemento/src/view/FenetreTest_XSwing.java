package view;

import javax.swing.JFrame;

import view.components.JComboSearchField;

public class FenetreTest_XSwing extends JFrame {

	private static final long serialVersionUID = 534961305916486146L;
	private JComboSearchField TF;

	public FenetreTest_XSwing() {
		getContentPane().setLayout(null);
		
		TF = new JComboSearchField();
		TF.setBounds(6, 6, 171, 28);
		getContentPane().add(TF);
		TF.setColumns(10);

		setVisible(true);
		setSize(388, 260);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
	}
}
