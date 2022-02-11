package GUI;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import RUSE.Game;

public abstract class DefaultPanel extends JPanel {

	protected DefaultPanel owner;

	public DefaultPanel(DefaultPanel owner) {
		this.owner = owner;
		Border blackline = BorderFactory.createLineBorder(Color.black);
		this.setBorder(blackline);
	}
	
	protected DefaultPanel getRoot() {
		if (owner != null) {
			return owner.getRoot();
		} else {
			return this;
		}
	}

	protected MainPanel getMainPanel() {
		DefaultPanel root = getRoot();
		if (root instanceof MainPanel) {
			return (MainPanel) root;
		} else {
			throw new RuntimeException("no main panel exists");
		}
	}
	
	protected Game getGame() {
		return getMainPanel().game;
	}

}
