package views;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
    AedgePanel aedgePanel;
    public MainWindow() {
        this.aedgePanel = new AedgePanel();
        this.initWindow();
    }
    public void initWindow() {
        this.addComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    public void addComponents() {
        this.add(this.aedgePanel);
    }
    
}
