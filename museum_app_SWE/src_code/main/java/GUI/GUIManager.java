/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bethoveen
 */
public class GUIManager {
    

    private static GUIManager Instance = null;
    
    // Constructor of this class
    // Here private constructor is is used to
    // restricted to this class itself
    private GUIManager()
    {
        
    }
    // Method
    // Static method to create instance of Singleton class
    public static GUIManager Instance()
    {
        // To ensure only one instance is created
        if (Instance == null) {
            Instance = new GUIManager();
        }
        return Instance;
    }
    public void SwipePanel(JPanel panel,Point A, Point B)
    {
       
       try{  
           
       if(panel.getLocation().equals(A))
       {              
        panel.setLocation(B);
        System.out.println("A");
       }else if(panel.getLocation().equals(B)){
        panel.setLocation(A);
        System.out.println("A");
       }
       
       }catch(Exception e){System.out.println(e);}
 
        System.out.println(panel.getLocation());
    }
    
    public void setDynamicSize(JFrame TargetFrame,JPanel TargetPanel)
    {
        Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
        TargetFrame.setLocation(dimen.width/2-TargetFrame.getSize().width/2 , dimen.height/2-TargetFrame.getSize().height/2);
        TargetFrame.setBackground(new Color(0,0,0,0));
        TargetPanel.setBackground(new Color(0,0,0,0));
    }
}

