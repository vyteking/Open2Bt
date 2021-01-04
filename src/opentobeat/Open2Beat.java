package opentobeat;

import java.io.File;
import javax.swing.*;

class Open2Beat extends JFrame {
	public Open2Beat() {
		setTitle("Open2Beat a.k.a. Open to Beat");
		setSize(DisplayBasic.myScreenWidth, DisplayBasic.myScreenHeight);
		setLayout(null);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// Check whether the Backgroundimagefile's location is right
		File BGImagefilecheck = new File("src/img/wp2537453-dj-background-hd.jpg");
		System.out.print("Backgroundimagefile: ");
		System.out.println(BGImagefilecheck.exists()?"Exists":"Not exists");
	} 
	
}
