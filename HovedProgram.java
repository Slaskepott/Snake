import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class HovedProgram{

    private static final int ANT_RADER = 30;
    private static final int ANT_KOLONNER = 30;

    public static void main(String[] args){
        JFrame frame = new JFrame("Mitt vindu");
        Model model = new Model(ANT_RADER,ANT_KOLONNER);
        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }
        catch(Exception e){
            System.out.println(e);
        }
        SpillPanel spillPanel = new SpillPanel();
        frame.add(spillPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}