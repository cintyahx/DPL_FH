import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class Main extends JFrame {

	protected JPanel toolPanel = new JPanel();
	protected Canvas canvas = new Canvas();
	
	private JButton lineButton;
	private static final String lineText = "    Linha    ";

	// *** Initialization of atomic elements
	public void initAtoms() {
		original();
		lineButton = new JButton(lineText);
	}

	// Layout components declaration

	/** Initializes the content pane */
	public void initContentPane() {
		original();
		toolPanel.add(lineButton);
	}

	public void initListeners() {

		original();
		lineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.LINE);
			}
		});
	}
}
