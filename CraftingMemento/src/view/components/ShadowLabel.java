package view.components;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import sun.font.FontDesignMetrics;

public class ShadowLabel extends JLabel {

	private static final long serialVersionUID = 2440262551845259703L;

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

	public void paint(Graphics g) {
		FontMetrics fm = FontDesignMetrics.getMetrics(getFont());

		int x = 2;
		int y = fm.getMaxAscent() + fm.getMaxDescent() + 2;

		if (getText() != null) {
			if (!getText().isEmpty()) {

				switch (getHorizontalAlignment()) {
				case SwingConstants.LEADING:
				case SwingConstants.LEFT:
					x = getInsets().left + 6;
					break;
				case SwingConstants.TRAILING:
				case SwingConstants.RIGHT:
					x = getWidth() - fm.stringWidth(getText())
							- getInsets().right - x;
					break;
				case SwingConstants.CENTER:
					x = ((getWidth() - getInsets().left - getInsets().right
							- fm.stringWidth(getText()) - x) / 2)
							+ getInsets().left;
					break;
				default:
					x = 0;
					break;
				}

				switch (getVerticalAlignment()) {
				case SwingConstants.TOP:
					y = y + getInsets().top + 6;
					break;
				case SwingConstants.CENTER:
					y = ((getHeight() - getInsets().top - getInsets().bottom + y) / 2)
							+ getInsets().top;
					break;
				case SwingConstants.BOTTOM:
					y = getHeight() - y - getInsets().bottom;
					break;
				default:
					y = 0;
					break;
				}

				Graphics2D g1 = (Graphics2D) g;
				TextLayout textLayout = new TextLayout(getText(), getFont(),
						g1.getFontRenderContext());
				g1.setPaint(getBackground());
				textLayout.draw(g1, x + 2, y + 2);
				g1.setPaint(getForeground());
				textLayout.draw(g1, x, y);
			}
		}

	}

}
