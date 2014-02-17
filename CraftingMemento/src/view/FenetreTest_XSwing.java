package view;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import model.enums.EItem;

import org.jdesktop.swingx.JXSearchField;

public class FenetreTest_XSwing extends JFrame {

	private static final long serialVersionUID = 534961305916486146L;
	private JXSearchField textField;

	public FenetreTest_XSwing() {
		getContentPane().setLayout(null);

		textField = new JXSearchField();
		textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<EItem> searches = EItem.searchBy(textField.getText());
				for(int i=0;i<searches.size();i++) {
					System.out.println(searches.get(i).getGuiName());
				}
			}
		});
		textField.setBounds(85, 60, 122, 28);
		textField.setInstantSearchDelay(50);
		getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnRecentSearches = new JButton("Recent searches");
		btnRecentSearches.addActionListener(textField.getFindAction());
		btnRecentSearches.setBounds(150, 128, 157, 28);
		getContentPane().add(btnRecentSearches);

		setVisible(true);
		setSize(388, 260);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
