package opentobeat;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.DebugGraphics;
import javax.swing.JFrame;

class O2BIntro extends Open2Beat {
	private Image introbackground;
	/*
	public O2BIntro() {
		
		
	}*/
	
	public void paint(DebugGraphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		introbackground = t.getImage("../src/img/wp2537453-dj-background-hd.jpg");
		g.drawImage(introbackground, DisplayBasic.myScreenHeight, DisplayBasic.myScreenWidth, this);
	}
	
	public static void main(String[] args) {
		O2BIntro canvashere = new O2BIntro();
		JFrame introframe = new JFrame();
		introframe.add(canvashere);
		introframe.setSize(DisplayBasic.myScreenHeight, DisplayBasic.myScreenWidth);
		introframe.setVisible(true);
	}
}

