package user_interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class SkillsPanel extends JPanel {
	private JLabel lname;
	private JTextField tname;
	private JLabel lage;
	private JTextField tage;
	private JLabel lteam;
	private JTextField tteam;
	private JLabel lpasses;
	private JTextField tpasses;
	private JLabel lbaskets;
	private JTextField tbaskets;
	private JLabel lgames;
	private JTextField tgames;
	private JLabel lwin;
	private JTextField twin;
	private JLabel llose;
	private JTextField tlose;
	private JButton save;
	private JButton add;
	private JButton image;
	private JButton delate;
	
	public SkillsPanel() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setLayout(new GridLayout(10, 2));
		setBackground(new Color(236, 124, 38));
		lname = new JLabel("NOMBRE");
		lname.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tname = new JTextField();
		tname.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tname.setBackground(Color.black);
		lage = new JLabel("EDAD");
		lage.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tage = new JTextField();
		tage.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tage.setBackground(Color.black);
		lteam = new JLabel("EQUIPO");
		lteam.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tteam = new JTextField();
		tteam.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tteam.setBackground(Color.black);
		lpasses = new JLabel("Pases");
		lpasses.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tpasses = new JTextField();
		tpasses.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tpasses.setBackground(Color.black);
		lbaskets = new JLabel("Cestas");
		lbaskets.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tbaskets = new JTextField();
		tbaskets.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tbaskets.setBackground(Color.black);
		lgames = new JLabel("Juegos");
		lgames.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tgames = new JTextField();
		tgames.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tgames.setBackground(Color.black);
		lwin = new JLabel("Ganados");
		lwin.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		twin = new JTextField();
		twin.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		twin.setBackground(Color.black);
		llose = new JLabel("Perdidos");
		llose.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tlose = new JTextField();
		tlose.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		tlose.setBackground(Color.black);
		add = new JButton("NUEVO");
		add.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		add.setBackground(new Color(236, 124, 38));
		save = new JButton("GUARDAR");
		save.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		save.setBackground(Color.black);
		image = new JButton("IMAGEN");
		image.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		image.setBackground(new Color(236, 124, 38));
		delate = new JButton("ELIMINAR");
		delate.setFont(new Font(lname.getFont().getFontName(), lname.getFont().getStyle(), 15));
		delate.setBackground(Color.black);
		add(lname);
		add(tname);
		add(lage);
		add(tage);
		add(lteam);
		add(tteam);
		add(lpasses);
		add(tpasses);
		add(lbaskets);
		add(tbaskets);
		add(lgames);
		add(tgames);
		add(lwin);
		add(twin);
		add(llose);
		add(tlose);
		add(add);
		add(save);
		add(image);
		add(delate);
	}
}
