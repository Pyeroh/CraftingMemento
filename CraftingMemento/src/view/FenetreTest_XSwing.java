package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import sun.font.FontDesignMetrics;
import view.components.RoundedPanel;

public class FenetreTest_XSwing extends JFrame {

	private static final Font MINECRAFTIA_FONT = new Font("Minecraftia", Font.PLAIN, 11);
	private static final long serialVersionUID = 534961305916486146L;
	private JLabel lib;

	public FenetreTest_XSwing() {
		getContentPane().setLayout(null);

		final RoundedPanel pan = new RoundedPanel();
		pan.setArcs(new Dimension(15, 15));
		pan.setShady(false);
		pan.setBorder(new LineBorder(new Color(44, 9, 98), 3, true));
		pan.setBackground(new Color(29,14,29));
		pan.setBounds(78, 88, 175, 64);
		getContentPane().add(pan);

		JLabel lblTest = new JLabel("Bidule machin truc");

		lblTest.setHorizontalAlignment(SwingConstants.CENTER);
		lblTest.setVerticalAlignment(SwingConstants.TOP);
		lblTest.setFont(MINECRAFTIA_FONT);
		pan.add(lblTest);
		lblTest.setForeground(Color.WHITE);

		FontMetrics fm = FontDesignMetrics.getMetrics(MINECRAFTIA_FONT);
		pan.setBounds(0, 0, fm.stringWidth(lblTest.getText()) + 20, (fm.getMaxAscent() + fm.getMaxDescent())*2);
		pan.setVisible(false);


		lib = new JLabel();
		lib.setBounds(6,6,32,32);
		Image img = Toolkit.getDefaultToolkit().getImage(FenetreTest_XSwing.class.getResource("/gui/eitems/blocks/58_0.png"));
		lib.setIcon(new ImageIcon(img.getScaledInstance(lib.getWidth(), lib.getHeight(), Image.SCALE_AREA_AVERAGING)));
		getContentPane().add(lib);

		lib.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pan.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pan.setVisible(false);
			}
		});
		lib.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				pan.setLocation(new Point(e.getPoint().x + 20, e.getPoint().y + 25));
			}
		});


		setVisible(true);
		setSize(388, 260);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);
	}
}
