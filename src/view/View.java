package view;

import javax.swing.JFrame;

public class View extends JFrame{
	private static final long serialVersionUID = 1L;

		public View() {
			setTitle("Pet Rescue Saga Game");
			setSize(800,600);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setVisible(true);
		}
}
