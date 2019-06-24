package com.javap;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceWarrior extends JFrame {

    public SpaceWarrior() {
        
        init();
    }
    
    private void init() {
        
        add(new TwoDPlane());
        
        setResizable(false);
        pack();
        
        setTitle("Space Warrior Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            SpaceWarrior ex = new SpaceWarrior();
            ex.setVisible(true);
        });
    }
}