package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {
    public JButton calcButton;
    public JButton aboutButton;
    public ButtonsPanel() {
        this.calcButton = new JButton("Számít");
        this.aboutButton = new JButton("Névjegy");
        this.addComponents();
    }
    public void addComponents() {
        this.add(this.calcButton);
        this.add(this.aboutButton);
    }
    
}
