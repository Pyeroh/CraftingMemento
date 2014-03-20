package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import view.components.ShadowLabel;

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

		ShadowLabel lblTest = new ShadowLabel("Test");
		lblTest.setBackground(new Color(63, 63, 63));
		lblTest.setForeground(Color.white);
		lblTest.setFont(new Font("Minecraftia", lblTest.getFont().getStyle(),
				20));
		lblTest.setBounds(61, 42, 78, 49);
		// getContentPane().add(lblTest);


		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(Color.black);
		Point p = new Point(getWidth() - getContentPane().getWidth(),
				getHeight() - getContentPane().getHeight());
		g2.drawString("String", sliderX.getValue() + p.x, sliderY.getValue()
				+ p.y);
	}
}
