package view.components;

import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JLabel;

import sun.font.FontDesignMetrics;

public class ShadowLabel extends JLabel {

	private static final long serialVersionUID = 2440262551845259703L;

	private int decalage = 2;

	public ShadowLabel() {
		super("");
	}

	public ShadowLabel(String text, int horizontalAlignment) {
		super(text, horizontalAlignment);
	}

	public ShadowLabel(String text) {
		super(text);
	}

	@Override
	public void setText(String text) {
		super.setText(text);
		repaint();
	}

	public int getDecalage() {
		return decalage;
	}

	public void setDecalage(int decalage) {
		this.decalage = decalage;
	}

	public void paint(Graphics g) {
		super.paint(g);
		FontMetrics fm = FontDesignMetrics.getMetrics(getFont());

		/*int x = 2;
		int y = fm.getMaxAscent() + fm.getMaxDescent() + 2;

		if (getText() != null) {
			if (!getText().isEmpty()) {

				Graphics2D g1 = (Graphics2D) g;
				TextLayout textLayout = new TextLayout(getText(), getFont(),
						g1.getFontRenderContext());
				g1.setPaint(getBackground());
				textLayout.draw(g1, x + 2, y + 2);
				g1.setPaint(getForeground());
				textLayout.draw(g1, x, y);
			}
		}*/

	}

}
