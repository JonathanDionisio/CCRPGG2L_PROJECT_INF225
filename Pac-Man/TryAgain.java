import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TryAgain extends JFrame{

    Board board = new Board();
   

    TryAgain(){
          
        int finalscore = board.score;
        String PPN = board.PlayerName;
        
        this.setLayout(new FlowLayout());


        JLabel namelabel = new JLabel();
        namelabel.setText(PPN + "'s score is: " + Integer.toString(finalscore));
        namelabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        namelabel.setForeground(Color.white);
        

        JLabel imageLabel = new JLabel();
        ImageIcon pac = new ImageIcon("gameoverr.gif");
         imageLabel.setIcon(pac);
         this.add(imageLabel);
         this.add(namelabel);

        JButton tryAgainButton = new  JButton();
        tryAgainButton.setText("Play Again");
        OPtion op = new OPtion();
        tryAgainButton.addActionListener(op);
        tryAgainButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.add(tryAgainButton);

        JButton exitButton = new JButton();
        exitButton.setText("EXIT");
        ragequit rq= new ragequit();
        exitButton.addActionListener(rq);
        exitButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.add(exitButton);

        setTitle("Pacman");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(350, 490);
        this.setLocationRelativeTo(rootPane);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(50, 50, 50));
    }


    private class OPtion implements ActionListener{

        public void actionPerformed(ActionEvent event){
            new OptionMenu();
            dispose();
        }

    }

    private class ragequit implements ActionListener{

        public void actionPerformed(ActionEvent event){
            System.exit(0);
        }

    }
}   