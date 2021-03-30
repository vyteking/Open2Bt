package opentobeat;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Musicplay extends Thread {
	private AudioSystem player;
	private boolean isLoop;
	private File file;
	private String filepath;
	private FileInputStream filestream;
	private BufferedInputStream bis;
	
	public Musicplay(String musicname, boolean isLoop) {
		/*
		try {
			AudioInputStream intromusicinput = AudioSystem.getAudioInputStream(intromusic);
			Clip intromusicclip = AudioSystem.getClip();
			intromusicclip.open(intromusicinput);
			intromusicclip.start();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}*/
	}
	/*
	public int getTime() {
		if (player==null) {
			return 0;
		} return ;
	}*/
	
	public void close() {
		isLoop=false;
		this.interrupt();
	}
	
	@Override
	public void run() {
		try {
			/*
			if(filepath.toLowerCase().endsWith(".txt"))
				System.out.println("The Textfiles aren't supported. ");
			while(isLoop) {
				filestream = new FileInputStream(file);
				bis = new BufferedInputStream(filestream);
			}*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
