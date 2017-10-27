package asu.ser.capstone.pivi.diagram.edit.parts.custom;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class PrintStatementRoundedRectangle extends RoundedRectangle{
	public PrintStatementRoundedRectangle() {
		super();
		setLineWidth(2);
	}

	@SuppressWarnings("deprecation")
	public void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);
		graphics.setForegroundColor(ColorConstants.cyan);
		graphics.setLineStyle(Graphics.LINE_SOLID);
		graphics.setLineWidth(5);
		Rectangle r = getBounds();
		
		graphics.drawLine(new Point(r.x + r.width * 0.4, r.y + r.height * 0.2),
				new Point(r.x + r.width * 0.4, r.y + r.height * 0.8));
		graphics.drawLine(new Point(r.x + r.width * 0.6, r.y + r.height * 0.2),
				new Point(r.x + r.width * 0.6, r.y + r.height * 0.8));
		
		
	}

}
