package view.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JToolTip;
import javax.swing.UIDefaults;
import javax.swing.border.LineBorder;

import model.enums.EItem;

public class JImage extends JLabel {

	public JImage() {
		super();
	}

	public JImage(Icon image, int horizontalAlignment) {
		super(image, horizontalAlignment);
	}

	public JImage(Icon image) {
		super(image);
	}

	public JImage(String text, Icon icon, int horizontalAlignment) {
		super(text, icon, horizontalAlignment);
	}

	public JImage(String text, int horizontalAlignment) {
		super(text, horizontalAlignment);
	}

	public JImage(String text) {
		super(text);
	}

	private static final long serialVersionUID = -7642955776379478770L;

	private EItem item = EItem.air;

	@Override
	public JToolTip createToolTip() {
		final MCToolTip tooltip = new MCToolTip();
		tooltip.setToolTipText(item.getGuiName());
		return tooltip;
	}

	public EItem getItem() {
		return item;
	}

	public void setItem(EItem item) {
		setToolTipText(item.getGuiName());

		this.item = item;
	}

}

class MCToolTip extends JToolTip {

	private static final long serialVersionUID = 4320351221644676925L;

	public MCToolTip() {
		setBorder(new LineBorder(new Color(44, 9, 98), 2, true));
		setBackground(new Color(29, 14, 29));
		setForeground(Color.white);
		//setFont();

		UIDefaults tooltipDefaults = new UIDefaults();
		tooltipDefaults.put("info", new Color(29, 14, 29));
		tooltipDefaults.put("ToolTip.contentMargins", new Insets(100, 100, 4, 4));
		tooltipDefaults.put("ToolTip.font", Font.decode("MinecraftFont plain").deriveFont(15f));


		this.putClientProperty("Nimbus.Overrides", tooltipDefaults);
		this.putClientProperty("Nimbus.Overrides.InheritDefaults", true);
	}

	@Override
	public String getToolTipText(MouseEvent event) {
		return getTipText();
	}

	@Override
	public Point getToolTipLocation(MouseEvent event) {
		Point p = event.getPoint();
		p.y += 15;
		return p;
	}

}