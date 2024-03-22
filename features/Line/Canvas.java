import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.event.*;
import javax.swing.JComponent;

import java.awt.Point;

@SuppressWarnings("serial")
public class Canvas extends JComponent implements MouseListener, MouseMotionListener {

	Point start, end;
	protected List<Shape> shapes = new LinkedList<Shape>();
	public enum FigureTypes {NONE, LINE, RECT};
	public FigureTypes figureSelected = FigureTypes.NONE;
	
	/** Invoked when a mouse button has been pressed on a component. */
	public void mousePressed(MouseEvent e) {
		original(e);
		if (figureSelected == FigureTypes.LINE) {
			mousePressedLine(e);
		}		
	}
	

	/** Invoked when a mouse button has been released on a component. */
	public void mouseReleased(MouseEvent e) {
		original(e);
		if (figureSelected == FigureTypes.LINE) {
			mouseReleasedLine(e);
		}
	}

	/** Invoked when the mouse is dragged over a component */
	public void mouseDragged(MouseEvent e) {
		original(e);
		if (figureSelected == FigureTypes.LINE) {
			mouseDraggedLine(e);
		}
	}

	protected Line newLine = null;

	public void mousePressedLine(MouseEvent e) {
		// If there is no line being created
		if (newLine == null) {
			start = new Point(e.getX(), e.getY());
			newLine = new Line(start);
			shapes.add(newLine);
		}
	}

	/** Updates the end point coordinates and repaints figure */
	public void mouseDraggedLine(MouseEvent e) {
		newLine.setEnd(new Point(e.getX(), e.getY()));
		repaint();
	}

	/** Clears the reference to the new line */
	public void mouseReleasedLine(MouseEvent e) {
		newLine = null;
	}

}
