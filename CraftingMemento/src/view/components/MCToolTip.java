package view.components;

import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JToolTip;

public class MCToolTip extends JToolTip {

	public MCToolTip() {

		setSize(150, 44);
        setToolTipText("");
	}

	private static final long serialVersionUID = -6732722551518041530L;

	@Override
	public Point getToolTipLocation(MouseEvent event) {
		return super.getToolTipLocation(event);
	}

	@Override
	public String getToolTipText(MouseEvent event) {
		return super.getToolTipText(event);


	}

}
