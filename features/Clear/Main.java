
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class Main extends JFrame {

	protected JPanel toolPanel = new JPanel();
	protected Canvas canvas = new Canvas();

	private JButton wipeButton;
	private static final String wipeText = "   Limpar   ";

	// *** Initialization of atomic elements
	public void initAtoms() {
		original();
		wipeButton = new JButton(wipeText);
	}

	// Layout components declaration


	/** Initializes the content pane */
	public void initContentPane() {
		original();
		toolPanel.add(wipeButton);
	}

	public void initListeners() {
		original();

		wipeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.wipe();
			}
		});
	}
}
