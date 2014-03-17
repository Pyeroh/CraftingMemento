package view.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MCLabel extends JLabel {

	private static final long serialVersionUID = -2326467037839641043L;

	private static MCPanel pan = new MCPanel();
	protected static final Font MINECRAFTIA_FONT = new Font("Minecraftia", Font.PLAIN, 12);

	/**
	 * @see JLabel#JLabel()
	 */
	public MCLabel() {
		super();		init();
	}

	/**
	 * @see JLabel#JLabel(Icon, int)
	 * @param image
	 * @param horizontalAlignment
	 */
	public MCLabel(Icon image, int horizontalAlignment) {
		super(image, horizontalAlignment);
		init();
	}

	/**
	 * @see JLabel#JLabel(Icon)
	 * @param image
	 */
	public MCLabel(Icon image) {
		super(image);
		init();
	}

	/**
	 * @see JLabel#JLabel(String, Icon, int)
	 * @param text
	 * @param icon
	 * @param horizontalAlignment
	 */
	public MCLabel(String text, Icon icon, int horizontalAlignment) {
		super(text, icon, horizontalAlignment);
		init();
	}

	/**
	 * @see JLabel#JLabel(String, int)
	 * @param text
	 * @param horizontalAlignment
	 */
	public MCLabel(String text, int horizontalAlignment) {
		super(text, horizontalAlignment);
		init();
	}

	/**
	 * @see JLabel#JLabel(String)
	 * @param text
	 */
	public MCLabel(String text) {
		super(text);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub

	}

}

class MCPanel extends JPanel {

	private static final long serialVersionUID = -3879589255803613800L;

	private JLabel lib = new JLabel();

	public MCPanel() {
	}

	public MCPanel(LayoutManager layout) {
		super(layout);
	}

	public MCPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
	}

	public MCPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
	}

	private void init() {
		lib.setHorizontalAlignment(SwingConstants.CENTER);
		lib.setVerticalAlignment(SwingConstants.TOP);
		lib.setFont(MCLabel.MINECRAFTIA_FONT);
		lib.setForeground(Color.WHITE);
		setVisible(false);
	}

}