package user_interface;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class PlayerPanel extends JPanel {
	
	private JLabel image;
	private SkillsPanel skills;
	private JLabel fiba;
	
	
	public PlayerPanel() {
		setLayout(new GridLayout(0, 3));
		image = new JLabel();
		skills = new SkillsPanel();
		fiba = new JLabel();
		fiba.setIcon(new ImageIcon("Files/Image/FIBA.jpg"));
		add(image);
		add(skills);
		add(fiba);
	}
	
	public JLabel getImage() {
		return image;
	}

	public void setImage(JLabel image) {
		this.image = image;
	}

	public SkillsPanel getSkills() {
		return skills;
	}

	public void setSkills(SkillsPanel skills) {
		this.skills = skills;
	}

	public JLabel getFiba() {
		return fiba;
	}

	public void setFiba(JLabel fiba) {
		this.fiba = fiba;
	}

	public static void main(String[] args) {
		PlayerPanel p = new PlayerPanel();
	}
}
