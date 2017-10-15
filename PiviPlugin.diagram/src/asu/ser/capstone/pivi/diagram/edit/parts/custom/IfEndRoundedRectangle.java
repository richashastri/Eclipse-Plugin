package asu.ser.capstone.pivi.diagram.edit.parts.custom;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class IfEndRoundedRectangle extends RoundedRectangle {
	public IfEndRoundedRectangle() {
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
		// vertical line
		graphics.drawLine(new Point(r.x + r.width / 2, r.y + r.height * 0.2),
				new Point(r.x + r.width / 2, r.y + r.height * 0.8));
		// top horizontal line
		graphics.drawLine(new Point(r.x + r.width * 0.2, r.y + r.height * 0.2),
				new Point(r.x + r.width / 2, r.y + r.height * 0.2));
		// bottom horizontal line
		graphics.drawLine(new Point(r.x + r.width * 0.2, r.y + r.height * 0.8),
				new Point(r.x + r.width / 2, r.y + r.height * 0.8));
		// centre horizontal line
		graphics.drawLine(new Point(r.x + r.width / 2, r.y + r.height / 2),
				new Point(r.x + r.width * 0.8, r.y + r.height / 2));
	}
}
