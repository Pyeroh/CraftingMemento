package view.components;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import model.enums.EItem;

public class HoverListCellRenderer extends DefaultListCellRenderer {  

	private static final long serialVersionUID = 9037091771053473873L;
	private static final Color HOVER_COLOR = new Color(208,233,253);
	private int hoverIndex = -1;
	private MouseAdapter handler;
	private JList<?> list;

	public HoverListCellRenderer(JList<?> list) {
		super();
		this.list = list;
	}

	@SuppressWarnings("rawtypes")
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {  
		super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);  

		/*JList thisvalue = (JList) value;
		thisvalue.setPreferredSize(new Dimension(list.getWidth()-20, thisvalue.getHeight()));
		thisvalue.setMinimumSize(thisvalue.getPreferredSize());
		thisvalue.setMaximumSize(thisvalue.getPreferredSize());*/

		if (!isSelected) {  
			setBackground(index == hoverIndex ? HOVER_COLOR : Color.white);
		}
		else {
			setBackground(new Color(247,212,170));
		}

		setForeground(Color.black);
		
		if (value != null) {
			if (value instanceof EItem) {
				EItem item = (EItem) value;
				setIcon(new ImageIcon(item.getImage()));
				setText(item.getGuiName());
			}
		}
		return this;  
	}  

	public MouseAdapter getHandler() {  
		if (handler == null) {  
			handler = new HoverMouseHandler(list);  
		}  
		return handler;  
	}

	/**
	 * Donne l'index survolé par la souris
	 * @return -1 s'il n'y a pas de survol, l'index survolé sinon
	 */
	public int getHoverIndex() {
		return hoverIndex;
	}

	class HoverMouseHandler extends MouseAdapter {  

		private final JList<?> flist;

		public HoverMouseHandler(JList<?> list) {  
			this.flist = list;  
		}  

		public void mouseExited(MouseEvent e) {  
			setHoverIndex(-1);  
		}  

		public void mouseMoved(MouseEvent e) {  
			if (flist.getModel().getSize()!=0) {
				int index = flist.locationToIndex(e.getPoint());
				setHoverIndex(flist.getCellBounds(index, index).contains(
						e.getPoint()) ? index : -1);
			}
		}  

		private void setHoverIndex(int index) {  
			if (hoverIndex == index) return;  
			hoverIndex = index;  
			flist.repaint();  
		}  
	}  
}