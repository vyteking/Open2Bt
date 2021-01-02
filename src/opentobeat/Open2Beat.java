package opentobeat;

/*import java.awt.Graphics;
import java.awt.Image;*/
import javax.swing.*;

public class Open2Beat extends JFrame {
	/*
	private Graphics screenGraphic;
	private Image screenImage;
	
	private Image introBackground;
	private ImageIcon titleImage;
	
	private ImageIcon startButtonImg;
	private ImageIcon settingButtonImg;
	private ImageIcon buttonSelectedImg;*/

	public Open2Beat() {
		setTitle("Open2Beat a.k.a. Open to Beat");
		setSize(DisplayBasic.myScreenWidth, DisplayBasic.myScreenHeight);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		/*
		introBackground = new ImageIcon(Main.class.getResource("../img/wp2537453-dj-background-hd.jpg")).getImage();
		titleImage = new ImageIcon(Main.class.getResource("src/img/open2BeaTTitle.png"));
		startButtonImg = new ImageIcon(Main.class.getResource("src/img/MenuImg_Gamestart_KR.png"));
		settingButtonImg = new ImageIcon(Main.class.getResource("src/img/MenuImg_Preference_KR.png"));*/
		
	} 
	
	/*
	public void paintIntro(DebugGraphics g) {
		screenImage = createImage(DisplayBasic.myScreenWidth, DisplayBasic.myScreenHeight);
		screenGraphic = screenImage.getGraphics();
		paintIntroBG(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void paintIntroBG(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}*/
}
