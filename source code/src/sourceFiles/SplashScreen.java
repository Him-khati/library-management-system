package sourceFiles;


import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class SplashScreen{

    private JLabel SplashImage;
    private JWindow window;
    private JPanel panel;
    public SplashScreen(int duration) {
        window=new JWindow();               
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        window.setSize(750, 307);
        Utility.centreWindow(window);
        panel=(JPanel)window.getContentPane();
        SplashImage = new JLabel();
        SplashImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/66.png")));
        panel.add(SplashImage, BorderLayout.CENTER);
        
        window.setVisible(true);
        try{
            Thread.sleep(duration);            
        }catch(Exception ex){            
        }//try catch closed
        window.setVisible(false);
        window.dispose();
    }//constructr closed

}//class closed

