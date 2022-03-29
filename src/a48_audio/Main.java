/*
 * Classe para aula 48. Audio - Main
 * 29/03/2022
 * Direitos reservados a Davi Souto Neri & BroCode
 */

package a48_audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {
	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("Neffex.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip =  AudioSystem.getClip();
		clip.open(audioStream);
		
		String response = "";
		
		while(!response.equals("Q")) {
			System.out.println("P = play, S = stop, R = Reset, Q = quit");
			System.out.println("Enter your choice");
			
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
			case ("P"): 
				clip.start();
				break;
			case ("S"):
				clip.stop();
				break;
			case ("R"):
				clip.setMicrosecondPosition(0);
				break;
			case ("Q"):
				clip.close();
				break;
			default: 
				System.out.println("Not a valid response");
			}
			
		}
		
		System.out.println("Bye bye falow valhew");
		
	}
}
