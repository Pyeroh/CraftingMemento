package view.components;

import java.awt.*;
import java.awt.event.*;

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

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pan.setLabelText(text);
				pan.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pan.setVisible(false);
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pan.setLocation(new Point(e.getPoint().x + 20, e.getPoint().y + 25));
			}
		});
		
	}

}

class MCPanel extends JPanel {

	private static final long serialVersionUID = -3879589255803613800L;

	private JLabel lib = new JLabel();

	public MCPanel() {
		init();
	}

	public MCPanel(LayoutManager layout) {
		super(layout);
		init();
	}

	public MCPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		init();
	}

	public MCPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		init();
	}

	private void init() {
		lib.setHorizontalAlignment(SwingConstants.CENTER);
		lib.setVerticalAlignment(SwingConstants.TOP);
		lib.setFont(MCLabel.MINECRAFTIA_FONT);
		lib.setForeground(Color.WHITE);
		setVisible(false);
	}
	
	public void setLabelText(String text) {
		lib.setText(text);
	}
	
	public String getLabelText() {
		return lib.getText();
	}

}