package view.components;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import model.enums.EItem;

import org.jdesktop.swingx.JXSearchField;

import sun.font.FontDesignMetrics;

public class JComboSearchField extends JXSearchField {

	private static final long serialVersionUID = 5987013368749228268L;
	@SuppressWarnings("unused")
	private JDropDownList list;

	public JComboSearchField() {

		setInstantSearchDelay(300);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!e.getActionCommand().equals("")) {
					
					ArrayList<EItem> searches = EItem.searchBy(e
							.getActionCommand());
					if (searches.size() > 1) {
						if (!(searches.get(0).getGuiName().equals(e.getActionCommand()))) {

							list = new JDropDownList(JComboSearchField.this, searches);

						}
					}
				}
			}
		});
	}

}

class JDropDownList extends JDialog {

	private static final long serialVersionUID = 4346096598210553609L;
	private JTextComponent parent;
	private JScrollPane scroll;
	private JHoverList<EItem> list;

	public JDropDownList(JTextComponent parent, ArrayList<EItem> results) {
		addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				dispose();
			}
		});
		setModalityType(ModalityType.MODELESS);
		setType(Type.POPUP);
		setUndecorated(true);
		setResizable(false);

		this.parent = parent;
		scroll = new JScrollPane();
		getContentPane().add(scroll, BorderLayout.CENTER);

		list = new JHoverList<>();
		scroll.setViewportView(list);

		DefaultListModel<EItem> model = new DefaultListModel<>();
		int mlength = 0;
		int max = this.parent.getWidth() + 70;
		for (EItem result : results) {
			model.addElement(result);
			int length = FontDesignMetrics.getMetrics(this.parent.getFont()).stringWidth(result.getGuiName());
			if (length > mlength) mlength = length;
		}
		if (mlength > max) mlength = max;
		list.setModel(model);

		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JDropDownList.this.parent.setText(list.getSelectedValue().getGuiName());
				dispose();
			}
		});

		setSize(mlength + 70, 150);
		setLocation(this.parent.getLocationOnScreen().x, this.parent.getLocationOnScreen().y + this.parent.getHeight() + 5);
		setVisible(true);
	}

}
