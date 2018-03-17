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
    private JFrame frame = new JFrame();

    public DisplayEngine(){
        frame.setSize(800, 800);
        //frame.getContentPane().add(this);
        frame.setLocationRelativeTo(null);
        //frame.setBackground(BG);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
