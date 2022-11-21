package views;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel {
    JLabel label;
    JTextField field;
    public InputPanel() {
        this.label = new JLabel("InputPanel");
        this.field = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.addComponent();
    }
    public void addComponent() {
        this.add(label);
        this.add(field);
    }
    
    public InputPanel(JLabel label) {
        this.label = label;
    }

    public void setText(String text) {
        this.label.setText(text);
    }
    public String getText() {
        return this.label.getText();
    }    
    public void setValue(String value) {
        this.field.setText(value);
    }
    public String getValue() {
        return this.field.getText();
    }
}
