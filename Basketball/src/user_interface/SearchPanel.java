package user_interface;

import java.awt.BorderLayout;

import javax.swing.*;

public class SearchPanel extends JFrame {
	
	private JTextField Search;
	private JComboBox<String> kind;
	private JButton toSearch;
	
	public SearchPanel() {
		setLayout(new BorderLayout());
		Search = new JTextField();
		String[] kinds = {"Número de pases", "Canastas hechas", "Partidos ganados", "Partidos perdidos"};
		kind = new JComboBox<String>();
		kind.setModel(new DefaultComboBoxModel<String>(kinds));
		toSearch = new JButton("BUSCAR");
		toSearch.setIcon(new ImageIcon("Basketball/Files/Image/myAvatar (1).png"));
		
		add(kind, BorderLayout.WEST);
		add(Search, BorderLayout.CENTER);
		add(toSearch, BorderLayout.EAST);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SearchPanel h = new SearchPanel();
	}
}
