
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

@SuppressWarnings("serial")

public  class  Main  extends JFrame {
	

	private static final int WIDTH = 800;

	
	private static final int HEIGHT = 600;

	

	protected JPanel toolPanel  = new JPanel();

	
	protected Canvas canvas  = new Canvas();

	
	private Container contentPane;

	

	// *** Initialization of atomic elements
	 private void  initAtoms__wrappee__Base  () {
	}

	

	// *** Initialization of atomic elements
	 private void  initAtoms__wrappee__Line  () {
		initAtoms__wrappee__Base();
		lineButton = new JButton(lineText);
	}

	

	// *** Initialization of atomic elements
	 private void  initAtoms__wrappee__Rectangle  () {
		initAtoms__wrappee__Line();
		rectButton = new JButton(rectText);
	}

	

	// *** Initialization of atomic elements
	public void initAtoms() {
		initAtoms__wrappee__Rectangle();
		wipeButton = new JButton(wipeText);
	}

	

	// Layout components declaration

	/** Initializes layout . No need to change */
	public void initLayout() {
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		toolPanel.setLayout(new BoxLayout(toolPanel, BoxLayout.Y_AXIS));
	}

	

	/** Initializes the content pane */
	 private void  initContentPane__wrappee__Base  () {
		contentPane.add(toolPanel, BorderLayout.WEST);
		contentPane.add(canvas, BorderLayout.CENTER);
	}

	

	// Layout components declaration

	/** Initializes the content pane */
	 private void  initContentPane__wrappee__Line  () {
		initContentPane__wrappee__Base();
		toolPanel.add(lineButton);
	}

	

	// Layout components declaration


	/** Initializes the content pane */
	 private void  initContentPane__wrappee__Rectangle  () {
		initContentPane__wrappee__Line();
		toolPanel.add(rectButton);
	}

	

	// Layout components declaration


	/** Initializes the content pane */
	public void initContentPane() {
		initContentPane__wrappee__Rectangle();
		toolPanel.add(wipeButton);
	}

	

	 private void  initListeners__wrappee__Base  () {
	}

	

	 private void  initListeners__wrappee__Line  () {

		initListeners__wrappee__Base();
		lineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.LINE);
			}
		});
	}

	

	 private void  initListeners__wrappee__Rectangle  () {

		initListeners__wrappee__Line();
		rectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.RECT);
			}
		});
	}

	

	public void initListeners() {
		initListeners__wrappee__Rectangle();

		wipeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.wipe();
			}
		});
	}

	

	// Initializes entire containment hierarchy
	public void init() {
		initAtoms();
		initLayout();
		initContentPane();
		initListeners();
	}

	

	/* Constructor. No need to modify */
	public Main(String appTitle) {
		super(appTitle);
		init();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
		setSize(WIDTH, HEIGHT);
		setResizable(true);
		validate();
	}

	

	/** main method */
	public static void main(String[] args) {
		new Main("Draw Product Line");
	}

	
	
	private JButton lineButton;

	
	private static final String lineText = "    Linha    ";

	
	
	private JButton rectButton;

	
	private static final String rectText = "Retângulo";

	

	private JButton wipeButton;

	
	private static final String wipeText = "   Limpar   ";


}
