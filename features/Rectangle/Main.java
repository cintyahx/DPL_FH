import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class Main extends JFrame {

	protected JPanel toolPanel = new JPanel();
	protected Canvas canvas = new Canvas();
	
	private JButton rectButton;
	private static final String rectText = "Retângulo";

	// *** Initialization of atomic elements
	public void initAtoms() {
		original();
		rectButton = new JButton(rectText);
	}

	// Layout components declaration


	/** Initializes the content pane */
	public void initContentPane() {
		original();
		toolPanel.add(rectButton);
	}

	public void initListeners() {

		original();
		rectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.RECT);
			}
		});
	}
}
