package views;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
    TitlePanel titlePanel;
    public AedgePanel aedgePanel;
    BedgePanel bedgePanel;
    CedgePanel cedgePanel;
    public VolumePanel volumePanel;
    public ButtonsPanel buttonsPanel;
    public MainWindow() {
        this.titlePanel = new TitlePanel();
        this.aedgePanel = new AedgePanel();
        this.bedgePanel = new BedgePanel();
        this.cedgePanel = new CedgePanel();
        this.volumePanel = new VolumePanel();
        this.buttonsPanel = new ButtonsPanel();

        this.initComponent();
        this.initWindow();
    }
    public void initComponent() {

    }
    public void initWindow() {
        this.setIconImage(new ImageIcon("Névtelen.png").getImage());

        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.addComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    public void addComponents() {
        this.add(this.titlePanel);
        this.add(this.aedgePanel);
        this.add(this.bedgePanel);
        this.add(this.cedgePanel);
        this.add(this.buttonsPanel);
        this.add(this.volumePanel);
    }
    
}
