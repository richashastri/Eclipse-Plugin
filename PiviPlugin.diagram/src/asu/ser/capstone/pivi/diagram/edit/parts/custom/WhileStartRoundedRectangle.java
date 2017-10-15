package asu.ser.capstone.pivi.diagram.edit.parts.custom;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

public class WhileStartRoundedRectangle extends RoundedRectangle {
	public WhileStartRoundedRectangle() {
		super();
		setLineWidth(2);
	}

	public void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setLineStyle(Graphics.LINE_SOLID);
		graphics.setLineWidth(3);
		Rectangle r = getBounds();
		graphics.drawOval(r.x + (int)(r.width * 0.2), r.y + (int)(r.height * 0.2), 
						  (int)(r.width * 0.6), (int)(r.height * 0.6));
	}
}
