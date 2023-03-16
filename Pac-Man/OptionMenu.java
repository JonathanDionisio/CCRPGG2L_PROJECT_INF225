import javax.accessibility.AccessibleAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneLayout;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.EventListener;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class OptionMenu extends JFrame{

    JTextField playername;
    JList backGroundColorList;
    JList ghostSkinList;
    JList PacManSkinList;
   
    private String[] backGroundColorSelectionArray = { "CLASSIC", "PINK CANDY", "LAVA", "FOREST", "AQUATIC"};
    private Color[] backGroundColorClassArray = {Color.BLACK, new Color(68,19,40,255), new Color(143,94,101,255), new Color(56,87,55,255), new Color(48,94,85,255)};
    private Color[] MazeColorClassArray = {new Color(57,81,226,255), new Color(204,83,154,255), new Color(235,16,5,255), new Color(139,224,152,255), new Color(36,102,201,255)};

    private String[] ghostskinselectionArray = { "AMONGUS", "AMOGUS??", "GHOST", "ZOMGHOST", "BOCCHI" };
    private String[] ghostfilepathArray = {
        "src/resources/images/amogus.gif",
        "src/resources/images/amogusyel.gif", 
        "src/resources/images/gost.gif", 
        "src/resources/images/zomghost.png", "src/resources/images/bocchii.gif" }; 
    
    private String[] PacManSkinSelectionArray ={"APPLE", "COLD", "MSPAC-MAN", "PAC-MAN", "POCHITA", "TANGERINE", "THE ROCK"};
    private String[] pacmanArray ={"src/resources/apple/apleft1.png", "src/resources/Creepypacman/cpleft1.png", "src/resources/MsPacMan/mspleft1.png", "src/resources/OGpacman/ogp.png", "src/resources/pochita/pocleft1.png", "src/resources/tangerine/tanleft1.png", "src/resources/bocchi/bocleft1.png"};
    private String[] pacmanUpArray1 ={"src/resources/apple/apup1.png", "src/resources/Creepypacman/cpup1.png", "src/resources/MsPacMan/mspup1.png", "src/resources/OGpacman/ogpup1.png", "src/resources/pochita/pocup1.png", "src/resources/tangerine/tanup1.png", "src/resources/bocchi/bocup1.png"};
    private String[] pacmanUpArray2 ={"src/resources/apple/apup2.png", "src/resources/Creepypacman/cpup2.png", "src/resources/MsPacMan/mspup2.png", "src/resources/OGpacman/ogpup2.png", "src/resources/pochita/pocup2.png", "src/resources/tangerine/tanup2.png", "src/resources/bocchi/bocup2.png"};
    private String[] pacmanUpArray3 ={"src/resources/apple/apup3.png", "src/resources/Creepypacman/cpup3.png", "src/resources/MsPacMan/mspup3.png", "src/resources/OGpacman/ogpup3.png", "src/resources/pochita/pocup3.png", "src/resources/tangerine/tanup3.png" , "src/resources/bocchi/bocup3.png"};
    private String[] pacmanDownArray1 ={"src/resources/apple/apdown1.png", "src/resources/Creepypacman/cpdown1.png", "src/resources/MsPacMan/mspdown1.png", "src/resources/OGpacman/ogpdown1.png", "src/resources/pochita/pocdown1.png", "src/resources/tangerine/tandown1.png", "src/resources/bocchi/bocdown1.png"};
    private String[] pacmanDownArray2 ={"src/resources/apple/apdown2.png", "src/resources/Creepypacman/cpdown2.png", "src/resources/MsPacMan/mspdown2.png", "src/resources/OGpacman/ogpdown2.png", "src/resources/pochita/pocdown2.png", "src/resources/tangerine/tandown2.png", "src/resources/bocchi/bocdown2.png"};
    private String[] pacmanDownArray3 ={"src/resources/apple/apdown3.png", "src/resources/Creepypacman/cpdown3.png", "src/resources/MsPacMan/mspdown3.png", "src/resources/OGpacman/ogpdown3.png", "src/resources/pochita/pocdown3.png", "src/resources/tangerine/tandown3.png", "src/resources/bocchi/bocdown3.png"};
    private String[] pacmanLeftArray1 ={"src/resources/apple/apleft1.png", "src/resources/Creepypacman/cpleft1.png", "src/resources/MsPacMan/mspleft1.png", "src/resources/OGpacman/ogpleft1.png", "src/resources/pochita/pocleft1.png", "src/resources/tangerine/tanleft1.png", "src/resources/bocchi/bocleft1.png"};
    private String[] pacmanLeftArray2 ={"src/resources/apple/apleft2.png", "src/resources/Creepypacman/cpleft2.png", "src/resources/MsPacMan/mspleft2.png", "src/resources/OGpacman/ogpleft2.png", "src/resources/pochita/pocleft2.png", "src/resources/tangerine/tanleft2.png", "src/resources/bocchi/bocleft2.png"};
    private String[] pacmanLeftArray3 ={"src/resources/apple/apleft3.png", "src/resources/Creepypacman/cpleft3.png", "src/resources/MsPacMan/mspleft3.png", "src/resources/OGpacman/ogpleft3.png", "src/resources/pochita/pocleft3.png", "src/resources/tangerine/tanleft3.png", "src/resources/bocchi/bocleft3.png"};
    private String[] pacmanRightArray1 ={"src/resources/apple/aprigh1.png", "src/resources/Creepypacman/cpright1.png", "src/resources/MsPacMan/mspright1.png", "src/resources/OGpacman/ogpright1.png", "src/resources/pochita/pocright1.png", "src/resources/tangerine/tanright1.png", "src/resources/bocchi/bocright1.png"};
    private String[] pacmanRightArray2 ={"src/resources/apple/apright2.png", "src/resources/Creepypacman/cpright2.png", "src/resources/MsPacMan/mspright2.png", "src/resources/OGpacman/ogpright2.png", "src/resources/pochita/pocright2.png", "src/resources/tangerine/tanright2.png", "src/resources/bocchi/bocright2.png"};
    private String[] pacmanRightArray3 ={"src/resources/apple/apright3.png", "src/resources/Creepypacman/cpright3.png", "src/resources/MsPacMan/mspright3.png", "src/resources/OGpacman/ogpright3.png", "src/resources/pochita/pocright3.png", "src/resources/tangerine/tanright3.png", "src/resources/bocchi/bocright3.png"};

    OptionMenu(){

       

        // BUTTONS/LABELS/TEXTS/LISTS---------------------


        JLabel namelabel = new JLabel();
        namelabel.setText("Enter Player Name here:");
        namelabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        namelabel.setForeground(new Color(255, 234, 0));

        JLabel pcmncolor = new JLabel();
        pcmncolor.setText("Select PacMan Skin");
        pcmncolor.setFont(new Font("Monospaced", Font.BOLD, 20));
        pcmncolor.setForeground(new Color(255, 234, 0));

        JLabel bgcololrlabel = new JLabel();
        bgcololrlabel.setText("Select Level Theme");
        bgcololrlabel.setFont(new Font("Monospaced", Font.BOLD,20));
        bgcololrlabel.setForeground(new Color(255, 234, 0));

        JLabel difflabel = new JLabel();
        difflabel.setText("Select Difficulty:");
        difflabel.setFont(new Font("Monospaced", Font.BOLD, 25));
        difflabel.setForeground(new Color(255, 234, 0));

        JLabel PacManSkinLabel = new JLabel();
        PacManSkinLabel.setText("Select Pac-Man Skin:");
        PacManSkinLabel.setFont(new Font("Monospaced", Font.BOLD, 25));
        PacManSkinLabel.setForeground(new Color(255, 234, 0));

    

        JLabel op = new JLabel();
        op.setText("|OPTIONS|");
        op.setFont(new Font("Monospaced", Font.BOLD, 28));
        op.setForeground(new Color(255, 234, 0 ));

        JButton pmcolor = new JButton();
        pmcolor.setText("PacMan Color");
        pmcolor.setFont(new Font("Monospaced", Font.BOLD, 25));
        back2menu b = new back2menu();
        pmcolor.addActionListener(b);

        playername = new JTextField(12);
        EnterName NM = new EnterName();
        playername.setFont(new Font("Monospaced", Font.BOLD, 18));
        playername.setBackground(new Color(255, 234, 0  ));
        playername.addKeyListener(NM);

        backGroundColorList = new JList(backGroundColorSelectionArray);
        backGroundColorList.setFont(new Font("Monospaced", Font.BOLD, 25));
        backGroundColorList.setVisibleRowCount(1);
        backGroundColorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane bgColorPane = new JScrollPane(backGroundColorList);
        BGColorEventHandler bgcolorHandler = new BGColorEventHandler();
        backGroundColorList.addListSelectionListener(bgcolorHandler);

        backGroundColorList.setForeground(Color.BLACK); 
        backGroundColorList.setBackground(new Color(253,3,2,255)); 
        backGroundColorList.setForeground(new Color(213,255,255,255));

        // GhostSkin ======================================================
        ghostSkinList = new JList(ghostskinselectionArray);
        ghostSkinList.setFont(new Font("Monospaced", Font.BOLD, 25));
        ghostSkinList.setVisibleRowCount(1);
        ghostSkinList.setBackground(new Color(237,87,255,255)); 
        ghostSkinList.setForeground(new Color(213,255,255,255));  
        ghostSkinList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane GhostskinPane = new JScrollPane(ghostSkinList);
        GhostSkinHandler skinPane = new GhostSkinHandler();
        ghostSkinList.addListSelectionListener(skinPane);

        // PacManSkin =============================================

        PacManSkinList = new JList(PacManSkinSelectionArray);
        PacManSkinList.setFont(new Font("Monospaced", Font.BOLD, 25));
        PacManSkinList.setVisibleRowCount(1);
        PacManSkinList.setBackground(new Color(58,244,241,255)); 
        PacManSkinList.setForeground(new Color(213,255,255,255));  
        PacManSkinList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane PacmanskinPane = new JScrollPane(PacManSkinList);
        PacmanSkinHandler PacManSkinPane = new PacmanSkinHandler();
        PacManSkinList.addListSelectionListener(PacManSkinPane);

    
        // DIFFICULTY BUTTONS =========================================

        JButton easyB = new JButton();
        easyB.setText("EASY");
        easyB.setFont(new Font("Monospaced", Font.BOLD, 18));
        Easy nmbg = new Easy(5);
        Medium sg = new Medium(2);
        hard pacshealth1 = new hard(3);
        easyB.addActionListener(nmbg);
        easyB.addActionListener(sg);
        easyB.addActionListener(pacshealth1); 
        startt startg = new startt();
        easyB.addActionListener(startg);  
        easyB.setBackground(new Color(58,244,241,255 ));  
        easyB.setForeground(new Color(213,255,255,255));  

        JButton mediumB = new JButton();
        mediumB.setText("MEDIUM");
        mediumB.setFont(new Font("Monospaced", Font.BOLD, 18));
        Easy nmbg1 = new Easy(7);
        Medium sg1 = new Medium(3);
        hard pacshealth2 = new hard(2);
        startt startg1 = new startt();
        mediumB.addActionListener(startg1);
        mediumB.addActionListener(nmbg1);
        mediumB.addActionListener(sg1);
        mediumB.addActionListener(pacshealth2);
        mediumB.setBackground(new Color(237,87,255,255));  
        mediumB.setForeground(new Color(249,252,248,255));  

        JButton hardB = new JButton();
        hardB.setText("HARD");
        hardB.setFont(new Font("Monospaced", Font.BOLD, 18));
        Easy nmbg2 = new Easy(10);
        Medium sg2 = new Medium(5);
        hard pacshealth3 = new hard(1);
        startt startg2 = new startt();
        hardB.addActionListener(startg2);
        hardB.addActionListener(nmbg2);
        hardB.addActionListener(sg2);
        hardB.addActionListener(pacshealth3);
        hardB.setBackground(new Color(253,3,2,255));  
        hardB.setForeground(new Color(249,252,248,255));  


        //-----------------------------------------

        this.setLayout(new FlowLayout());

        // THIS DOT ADD -------------------

        this.add(op);
        this.add(namelabel);
        this.add(playername);

        this.add(pcmncolor);
        this.add(GhostskinPane);

        this.add(PacManSkinLabel);
        this.add(PacmanskinPane);
       
        this.add(bgcololrlabel);
        this.add(bgColorPane);
       
        
        this.add(difflabel);    
        this.add(easyB);
        this.add(mediumB);
        this.add(hardB);
        
        this.setLayout(new FlowLayout());

        // Frame -------------------------
        setTitle("Pacman");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(350, 550);
        this.setLocationRelativeTo(rootPane);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(10,10,97));

    }

    // EVENTS/LISTENERS/ACTIONS---------------------------


    private class Easy implements ActionListener{

        int Ghostnumber;
       
        Easy(int numbghost){
            this.Ghostnumber = numbghost;
        }

        public void actionPerformed(ActionEvent event){

            Board numbG = new Board();
            numbG.N_GHOSTS = Ghostnumber;
           
            
        }

    }

    private class Medium implements ActionListener{

        int speedofGh;

        Medium(int speedg){
            this.speedofGh = speedg;
        }

        public void actionPerformed(ActionEvent event){

            Board G_speed = new Board();
            G_speed.currentSpeed = speedofGh;

           
            
        }

    }

    private class hard implements ActionListener{

        int pachp;

        hard(int pacshp){
            this.pachp = pacshp;
        }
        public void actionPerformed(ActionEvent event){
            
            Board pHP = new Board();
            pHP.pacsLeft = pachp;    
            dispose();
           
           
            

        }

    }

    private class startt implements ActionListener{

        public void actionPerformed(ActionEvent event){
            
           
            Pacman ssstart = new Pacman();
            ssstart.setVisible(true);
        }
    }

    

    private class back2menu implements ActionListener{

        public void actionPerformed(ActionEvent event){

            new MainMenu();
        }
    }

    private class EnterName implements KeyListener  {

        public void keyPressed(KeyEvent event){
            Board shht = new Board();


            if(event.getKeyCode() == KeyEvent.VK_ENTER){
            
           shht.PlayerName =  playername.getText();    
           
          

            }   
           
        }

        public void keyTyped(KeyEvent event){

           
        }

        public void keyReleased(KeyEvent event){

           
        }
    }

    private class BGColorEventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event) {
            Board board = new Board();
            board.backGroundColor = backGroundColorClassArray[backGroundColorList.getSelectedIndex()];
            board.mazeColor = MazeColorClassArray[backGroundColorList.getSelectedIndex()];
        }
    }

    private class GhostSkinHandler implements ListSelectionListener{
      

        public void valueChanged(ListSelectionEvent event){
            Board skin = new Board();
            skin.ghostfilename = ghostfilepathArray[ghostSkinList.getSelectedIndex()];
            
        }
    }

    private class PacmanSkinHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){

        
        Board Pacmanskinn = new Board();
        Pacmanskinn.PACMANN =pacmanArray[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmanupp1 =pacmanUpArray1[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmanupp2 =pacmanUpArray2[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmanupp3 =pacmanUpArray3[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmandownn1 =pacmanDownArray1[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmandownn2 =pacmanDownArray2[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmandownn3 =pacmanDownArray3[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmanleftt1 =pacmanLeftArray1[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmanleftt2 =pacmanLeftArray2[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmanleftt3 =pacmanLeftArray3[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmanrightt1 =pacmanRightArray1[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmanrightt2 =pacmanRightArray2[PacManSkinList.getSelectedIndex()];
        Pacmanskinn.pacmanrightt3 =pacmanRightArray3[PacManSkinList.getSelectedIndex()];

        }
    }

    
}
