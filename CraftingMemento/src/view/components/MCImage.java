package view.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.enums.EItem;
import sun.font.FontDesignMetrics;

public class MCImage extends JLabel {

	private static final long serialVersionUID = -2326467037839641043L;

	private static MCPanel pan = MCPanel.getInstance();

	private EItem item = EItem.air;
	private JPanel container;

	public MCImage(JPanel container) {
		super();
		this.container = container;		init();
	}

	public MCImage(JPanel container ,EItem item) {
		this(container);
		this.item = item;
	}

	public void setItem(EItem item) {
		this.item = item;
		scaleImage();
	}

	public EItem getItem() {
		return item;
	}

	@Override
	public void setSize(int width, int height) {
		super.setSize(width, height);
		scaleImage();
	}

	@Override
	public void setSize(Dimension d) {
		super.setSize(d);
		scaleImage();
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		super.setBounds(x, y, width, height);
		scaleImage();
	}

	@Override
	public void setBounds(Rectangle r) {
		super.setBounds(r);
		scaleImage();
	}

	private void scaleImage() {
		if (item != EItem.air) {
			Image img = this.item.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_AREA_AVERAGING);
			setIcon(new ImageIcon(img));
		}
		else setIcon(null);
	}

	private void init() {

		MouseAdapter adapter = new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (item != EItem.air) {
					container.add(pan);
					container.setComponentZOrder(pan, 0);
					pan.setLabelText(item.getGuiName());
					pan.setVisible(true);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				//if (item != EItem.air) {
					pan.setVisible(false);
					container.remove(pan);
				//}
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				Point p = new Point(getX() + e.getX() + 12, getY() + e.getY() + 19);
				if (item != EItem.air) {
					if (p.x + pan.getWidth() > container.getWidth()) {
						p.setLocation(p.x - pan.getWidth() - 14, p.y);
					}
					if (p.y + pan.getHeight() > container.getHeight()) {
						p.setLocation(p.x, p.y - pan.getHeight() - 21);
					}
					pan.setLocation(p);
				} else {
					mouseExited(e);
				}
			}

		};

		addMouseListener(adapter);
		addMouseMotionListener(adapter);

	}

}

class MCPanel extends RoundedPanel {

	private static final long serialVersionUID = -3879589255803613800L;

	private static ShadowLabel lib = new ShadowLabel();

	private static MCPanel pan;

	private static final Font MINECRAFTIA_FONT = new Font("Minecraftia", Font.PLAIN, 12);

	private MCPanel() {
		super();
	}

	public static MCPanel getInstance() {
		if(pan == null) {
			pan = new MCPanel();
			init();
		}

		return pan;
	}

	private static void init() {
		pan.setArcs(new Dimension(15, 15));
		pan.setShady(false);
		pan.setBorder(new LineBorder(new Color(44, 9, 98), 3, true));
		pan.setBackground(new Color(29,14,29));
		pan.setFont(MINECRAFTIA_FONT);
		pan.setLayout(new BorderLayout(0,0));

		pan.add(lib, BorderLayout.CENTER);
		lib.setHorizontalAlignment(SwingConstants.CENTER);
		lib.setVerticalAlignment(SwingConstants.CENTER);
		lib.setFont(MINECRAFTIA_FONT);
		lib.setBackground(new Color(63, 63, 63));
		lib.setForeground(Color.WHITE);

	}

	public void setLabelText(String text) {
		FontMetrics fm = FontDesignMetrics.getMetrics(MINECRAFTIA_FONT);
		Rectangle2D limit = fm.getStringBounds(text, pan.getGraphics());
		pan.setSize((int)limit.getWidth() + 17, (int)limit.getHeight() + 17);
		lib.setText(text);
	}

	public String getLabelText() {
		return lib.getText();
	}

}