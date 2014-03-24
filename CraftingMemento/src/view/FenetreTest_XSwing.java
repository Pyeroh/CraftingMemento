package view;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import sun.font.FontDesignMetrics;

public class FenetreTest_XSwing extends JFrame {

	private static final long serialVersionUID = 534961305916486146L;
	private JSlider sliderX;
	private JSlider sliderY;
	private JLabel libX;
	private JLabel libY;

	public FenetreTest_XSwing() {
		getContentPane().setLayout(null);
		setSize(388, 260);
		setVisible(true);

		ChangeListener changeur = new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider sliderSource = (JSlider) e.getSource();
				JLabel lib = sliderSource == sliderX ? libX : libY;
				lib.setText(sliderSource.getValue() + "");
				FenetreTest_XSwing.this.repaint();
			}
		};

		libX = new JLabel("");
		libX.setBounds(220, 145, 46, 14);
		getContentPane().add(libX);

		libY = new JLabel("");
		libY.setBounds(220, 179, 46, 14);
		getContentPane().add(libY);

		sliderX = new JSlider();
		sliderX.addChangeListener(changeur);
		sliderX.setMaximum(getContentPane().getWidth());
		sliderX.setBounds(10, 145, 200, 23);
		getContentPane().add(sliderX);

		sliderY = new JSlider();
		sliderY.addChangeListener(changeur);
		sliderY.setMaximum(getContentPane().getHeight());
		sliderY.setBounds(10, 179, 200, 23);
		getContentPane().add(sliderY);

		JPanel panel = new JPanel() {
			private static final long serialVersionUID = -6383977616335383963L;

			@Override
			public void paint(Graphics g) {
				super.paint(g);
				g.setColor(Color.black);
				FontMetrics fm = FontDesignMetrics.getMetrics(this.getFont());
				Rectangle limit = fm.getStringBounds("String", g).getBounds();
				g.drawString("String", 0, (int) limit.getHeight());
			}
		};
		panel.setBounds(10, 11, 200, 123);
		panel.setBorder(new LineBorder(Color.black, 1));
		getContentPane().add(panel);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (sliderX != null && sliderY != null) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setPaint(Color.black);
			int largeur = (getWidth() - getContentPane().getWidth()) / 2;
			int hauteur = getHeight() - getContentPane().getHeight() - largeur;
			Point p = new Point(largeur, hauteur);
			g2.drawString("String", sliderX.getValue() + p.x,
					sliderY.getValue() + p.y);
			g2.fillRect(sliderX.getValue() + p.x, sliderY.getValue() + p.y, 3,
					3);
		}
	}
}
