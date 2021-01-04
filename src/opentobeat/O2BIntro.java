package opentobeat;

import java.awt.Image;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

class O2BIntro extends Open2Beat {
	//private JLabel screenImg;
	private Image getBG;
	
	private ImageIcon introBackground/* = new ImageIcon(Main.class.getResource("../img/wp2537453-dj-background-hd.jpg"))*/;
	private ImageIcon titleImage;
	private ImageIcon startButtonImg;
	private ImageIcon settingButtonImg;
	private ImageIcon buttonSelectedImg;
	
	public O2BIntro(Image img) {
		introBackground = new ImageIcon("src/img/wp2537453-dj-background-hd.jpg");
		titleImage = new ImageIcon("src/img/open2BeaTTitle.png");
		startButtonImg = new ImageIcon("src/img/MenuImg_Gamestart_KR.png");
		settingButtonImg = new ImageIcon("src/img/MenuImg_Preference_KR.png");
		
		this.getBG=img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(getBG, 0, 0, null);
	}

	O2BIntro intropanel = new O2BIntro(introBackground.getImage());
	
	// case2 if based on javax.swing.ImageIcon
	/*
	public void paintIntro(DebugGraphics g) {
		screenImg = new JLabel("",introBackground,JLabel.CENTER);
		screenImg.setBounds(0, 0, DisplayBasic.myScreenWidth, DisplayBasic.myScreenHeight);
		add(screenImg);
		pack();
		
	}*/

	// case3 if based on java.awt.*
	/*
	public void paintIntro(Graphics g) {
		screenImg = createImage(DisplayBasic.myScreenWidth, DisplayBasic.myScreenHeight);
		screenGraphic = screenImage.getGraphics();
		paintIntroBG(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void paintIntroBG(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}*/
	
}

