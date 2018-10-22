package user_interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class SearchPanel extends JPanel {
	
	private JTextField search;
	private JComboBox<String> kind;
	private JButton toSearch;
	
	public SearchPanel() {
		setLayout(new BorderLayout());
		search = new JTextField();
		search.setFont(new Font(search.getFont().getFontName(), search.getFont().getStyle(), 15));
		search.setBackground(Color.BLACK);
		String[] kinds = {"Número de pases", "Canastas hechas", "Partidos ganados", "Partidos perdidos"};
		kind = new JComboBox<String>();
		kind.setModel(new DefaultComboBoxModel<String>(kinds));
		kind.setFont(new Font(kind.getFont().getFontName(), kind.getFont().getStyle(), 15));
		kind.setBackground(new Color(236, 124, 38));
		toSearch = new JButton("BUSCAR");
		toSearch.setFont(new Font(kind.getFont().getFontName(), kind.getFont().getStyle(), 15));
		toSearch.setBackground(new Color(236, 124, 38));
		
		add(kind, BorderLayout.WEST);
		add(search, BorderLayout.CENTER);
		add(toSearch, BorderLayout.EAST);
	}
}
