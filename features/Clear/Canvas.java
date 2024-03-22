import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.event.*;
import javax.swing.JComponent;

import java.awt.Point;

@SuppressWarnings("serial")
public class Canvas extends JComponent implements MouseListener, MouseMotionListener {

	protected List<Shape> shapes = new LinkedList<Shape>();

	public void wipe() {
		original();
		this.shapes.clear();
		this.repaint();
	}
}
