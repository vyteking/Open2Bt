package opentobeat;

import java.awt.*;
// import java.awt.color.*;
import javax.swing.*;

public class O2BIntro extends Open2Beat {
	
	private JLabel screenGraphic;
	
	private ImageIcon introBackground;
	private ImageIcon titleImage;
	private ImageIcon startButtonImg;
	private ImageIcon settingButtonImg;
	private ImageIcon buttonSelectedImg;
	
	public O2BIntro() {
		introBackground = new ImageIcon(this.getClass().getResource("../img/wp2537453-dj-background-hd.jpg"));
		titleImage = new ImageIcon(this.getClass().getResource("src/img/open2BeaTTitle.png"));
		startButtonImg = new ImageIcon(this.getClass().getResource("src/img/MenuImg_Gamestart_KR.png"));
		settingButtonImg = new ImageIcon(this.getClass().getResource("src/img/MenuImg_Preference_KR.png"));
		
	}
	
	public void paintIntro() {
		
		screenGraphic = new JLabel(introBackground,JLabel.CENTER);
		screenGraphic.setBounds(0, 0, DisplayBasic.myScreenWidth, DisplayBasic.myScreenHeight);
		add(screenGraphic);
	}
	
}



