package user_interface;

import java.awt.*;

import javax.swing.JFrame;

public class Window extends JFrame {
private SearchPanel sp;
private PlayerPanel pp;

public Window() {
	setTitle("FIBA by: Cristian Gironza, Nicolas Salazar, Camilo ");
	setLayout(new BorderLayout());
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);
	sp = new SearchPanel();
	pp = new PlayerPanel();
	sp.setBackground(new Color(236, 124, 38));
	pp.setBackground(new Color(236, 124, 38));
	add(pp,BorderLayout.NORTH);
	add(sp,BorderLayout.SOUTH);
	pack();
	setVisible(true);
}
	public static void main(String[] args) {
		Window w = new Window();
	}
}
