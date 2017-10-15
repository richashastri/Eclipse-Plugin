package asu.ser.capstone.pivi.diagram.edit.parts.custom;

import java.util.List;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;

import asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart;

public class MethodStartCompartmentFigureListener implements FigureListener {
	private ListCompartmentEditPart compartmentEditPart = null;
	private RoundedRectangle roundedRectangle = null;
 
	public static final double MARGIN = 20; // The margin to apply before drawing our operator
	public static final double R = 100; // The base length
	public static final double REF_W = 2 * MARGIN + R * 6; // Reference width
	public static final double REF_H = 2 * MARGIN + R * 5; // Reference height
 
	public MethodStartCompartmentFigureListener(ListCompartmentEditPart compartmentEditPart, RoundedRectangle roundedRectangle) {
		this.compartmentEditPart = compartmentEditPart;
		this.roundedRectangle = roundedRectangle;
	}
	
	@Override
	public void figureMoved(IFigure f) {
		ResizableCompartmentFigure figure = (ResizableCompartmentFigure) f;
		if (figure.getSize().width != 0) {
			IFigure contentPane = figure.getContentPane();
			Insets is = figure.getInsets();
			// Determine the scale to apply
			double xScale = ((double) figure.getSize().width - is.left - is.right) / REF_W;
			double yScale = ((double) figure.getSize().height - is.top - is.bottom) / REF_H;
 
			// Set the constraints (bounds) for the rounded rectangle
			Rectangle constraint = new Rectangle(
					(int) ((MARGIN + R) * xScale),
					(int) ((MARGIN) * yScale), 
					(int) (R * 4 * xScale),
					(int) (R * 5 * yScale));
			contentPane.setConstraint(roundedRectangle, constraint);
 
			// Set the constraints for the input and output nodes
			List<AbstractEditPart> childs = compartmentEditPart.getChildren();
			for (AbstractEditPart child : childs) {
				if (child instanceof AbstractGraphicalEditPart) {
					AbstractGraphicalEditPart gEditPart = (AbstractGraphicalEditPart) child;
					if (gEditPart instanceof OutputPortEditPart) {
						constraint = new Rectangle(
								(int) ((REF_W - MARGIN - R) * xScale),
								(int) ((REF_H - R) / 2 * yScale),
								(int) (R * xScale), 
								(int) (R * yScale));
						contentPane.setConstraint(gEditPart.getFigure(), constraint);
					}
					else if (gEditPart instanceof StartPortEditPart) {
						constraint = new Rectangle(
								(int) (MARGIN * xScale),
								(int) ((MARGIN + R) * yScale),
								(int) (R * xScale), 
								(int) (R * yScale));
						contentPane.setConstraint(gEditPart.getFigure(), constraint);
					}					
					else if (gEditPart instanceof InputPortEditPart) {
						constraint = new Rectangle(
								(int) (MARGIN * xScale),
								(int) ((MARGIN + 3 * R) * yScale),
								(int) (R * xScale), 
								(int) (R * yScale));
						contentPane.setConstraint(gEditPart.getFigure(), constraint);
					}
				}
			}
		}
	}
}
