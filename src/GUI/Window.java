package GUI;

import javax.swing.JFrame;

import RUSE.Game;

public class Window extends JFrame {

	public Window(Game game) {
		MainPanel mainPanel = new MainPanel(this, game);
		setTitle(mainPanel.windowTitle);
		add(mainPanel);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
