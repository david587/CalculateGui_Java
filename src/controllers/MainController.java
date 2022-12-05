package controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import views.MainWindow;

public class MainController {
    MainWindow mainWindow;

    public MainController() {
        this.mainWindow = new MainWindow();
        this.handleEvents();
    }

    public void handleEvents(){
        JButton calcButton = this.mainWindow.buttonsPanel.calcButton;
        JButton aboutButton = this.mainWindow.buttonsPanel.aboutButton;
        calcButton.addActionListener(e -> onClickCalcButton());
        aboutButton.addActionListener(e -> onClickABoutButton());
    }
    public void onClickCalcButton(){
        String aedgeStr = this.mainWindow.aedgePanel.getValue();
        String bedgeStr = this.mainWindow.aedgePanel.getValue();
        String cedgeStr = this.mainWindow.aedgePanel.getValue();
        double aedge = Double.parseDouble(aedgeStr);
        double bedge = Double.parseDouble(bedgeStr);
        double cedge = Double.parseDouble(cedgeStr);
        Double volume = aedge * bedge *cedge;
        this.mainWindow.volumePanel.setValue(volume.toString());
    }
    
    public void onClickABoutButton(){
        String aboutString = "Lelepi\nVerzió: 0.1\nBaráth Dávid, 2022";
        JOptionPane.showMessageDialog(mainWindow,aboutString);
    }
}
