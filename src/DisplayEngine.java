import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.swing.*;


public class DisplayEngine {
    private Unit[][] board;

    private JFrame frame = new JFrame();
    private JMenuBar menubar;
    private JMenu
            mFile,
            mCountry;
    private JMenuItem
            m_newgame,
            m_loadgame,
            m_savegame,
            c_prefs,
            c_stats;
    private final Color
            GROUND = Color.decode("#bc986a"),
            WATER = Color.decode("#659dbd"),
            C_RED = Color.decode("#8ee4af"),
            C_BLUE = Color.decode("#659dbd"),
            C_GREEN = Color.decode("#5cdb95"),
            C_BLACK = Color.decode("#1f2833"),
            C_WHITE = Color.decode("#e3e2df"),
            C_ORANGE = Color.decode("#ff652f"),
            C_PURPLE = Color.decode("#a64ac9"),
            C_PINK = Color.decode("#f172a1");

    //init given nothing
    public DisplayEngine(){
        initFrame();
        //mFile
        menubar = new JMenuBar();
        mFile = new JMenu("File");
        m_newgame = new JMenuItem("New game");
        m_loadgame = new JMenuItem("Load game");
        mFile.add(m_newgame);
        mFile.add(m_loadgame);
        menubar.add(mFile);
        frame.setJMenuBar(menubar);

        JLabel noNewGame = new JLabel("<html>Welcome to Dominator!<br>Press File -> New game to make a new game</html>");
        noNewGame.setHorizontalAlignment(JLabel.CENTER);
        frame.add(noNewGame);
        frame.revalidate();


    }

    //init given name
    public DisplayEngine(String name){
        board = new Unit[500][500];
        initFrame();
        menus(name);
    }

    //init given save file
    public DisplayEngine(File input){

    }

    public void initFrame(){
        frame.setSize(800, 800);
        //frame.getContentPane().add(this);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(GROUND);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
    }
    public void menus(String name){
        //mFile
        menubar = new JMenuBar();
        mFile = new JMenu("File");
        m_newgame = new JMenuItem("New game");
        m_savegame = new JMenuItem("Save game");
        m_loadgame = new JMenuItem("Load game");
        mFile.add(m_newgame);
        mFile.add(m_savegame);
        mFile.add(m_loadgame);

        //mGame
        mCountry = new JMenu(name);
        c_prefs = new JMenuItem("Settings");
        c_stats = new JMenuItem("Stats");
        mCountry.add(c_prefs);
        mCountry.add(c_stats);

        menubar.add(mFile);
        menubar.add(mCountry);
        frame.setJMenuBar(menubar);
        frame.revalidate();
    }
    public void newgame(ActionEvent evt){
        System.out.print("worked");
    }

}
