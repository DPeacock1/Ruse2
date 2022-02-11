package GUI;

import java.awt.BorderLayout;

import RUSE.Game;


public class MainPanel extends DefaultPanel {

	private Window window;
	public String windowTitle;
	protected Game game;

	public MainPanel(Window window, Game game) {
		super(null);
		this.window = window;
		this.game = game;
		this.setLayout(new BorderLayout(10, 10));
	}
	
}