import javax.sound.sampled.AudioInputStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.InputStream;
import javax.sound.sampled.spi.AudioFileReader;
import java.io.IOException;



import java.applet.*;


import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.awt.event.ActionEvent;
import java.awt.*;



public class MainMenu extends JFrame{

    MainMenu(){

        Bgmusic.Runmusic("src/resources/PacMusic.wav");
        
        
        

        // BUTTONS ====================================================

        JLabel imageLabel = new JLabel();
        ImageIcon pac = new ImageIcon("Pacmenu.gif");
        imageLabel.setIcon(pac);
        
        JButton StartButton = new JButton();
        StartButton.setText("Start Game");
        StartButton.setFont(new Font("Monospaced", Font.BOLD, 25));
        EventHandler handler = new EventHandler();
        StartButton.addActionListener(handler);
        

        JButton EXIT = new JButton();
        EXIT.setText("EXIT");
        EXIT.setFont(new Font("Monospaced", Font.BOLD, 25));
        EXITT quit = new EXITT();
        EXIT.addActionListener(quit);

        JLabel jonathan = new JLabel();
        jonathan.setText("Jonathan cute Dionisio");
        jonathan.setFont(new Font("Monospaced", Font.BOLD, 11));
        jonathan.setForeground(Color.BLACK);
       
        
        //=======================================================================

        // THIS DOT ADDS ==============================================================
        
        this.add(imageLabel);
        this.add(StartButton);
        // this.add(Option);
        this.add(EXIT);
        this.add(jonathan);

        this.setLayout(new FlowLayout());

        setTitle("Pacman");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(325, 450);
        this.setLocationRelativeTo(rootPane);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(233,233,233,255));

        
        //========================================================================================
    }

    // HANDLERS =============================================================================


    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            new OptionMenu();
            
            dispose();
        }

    }


    private class EXITT implements ActionListener{

        public void actionPerformed(ActionEvent event){
            System.exit(0); 
        }
    }
//========================================================================= 

    // public static void playMusic(String filepath){
    //         InputStream music;
    //         try{
    //             music = new FileInputStream(new File());
    //             Audiofi audiolog = new AudioStream(music);
    //             AudioPlayer.player.start(audiolog);
    //         }
    //         catch(Exception e){
    //             JOptionPane.showMessageDialog("hotdog");
    //         }

    //     }
    


}