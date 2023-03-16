import java.io.IOException;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.Clip;

public class Bgmusic {

    public static void Runmusic (String play){


        try{

           
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("src/resources/PacMusic.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(inputStream);
        clip.loop(20);
        }
        catch(UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(LineUnavailableException e){
            e.printStackTrace();
        }
    }


       public static void RunWak (String play){

            try{

           
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("src/resources/waka.wav"));
            Clip WAKA = AudioSystem.getClip();
            WAKA.open(inputStream);
            WAKA.loop(0);
            }
            catch(UnsupportedAudioFileException e) {
                e.printStackTrace();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            catch(LineUnavailableException e){
                e.printStackTrace();
            }
        
    }



    public static void RunDed (String play){
        try{

           
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("src/resources/pmded.wav"));
        Clip ded = AudioSystem.getClip();
        ded.open(inputStream);
        ded.loop(0);
        }
        catch(UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(LineUnavailableException e){
            e.printStackTrace();
        }
    }
}

