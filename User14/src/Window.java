import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Window extends JFrame {
    private JPanel panel;
    private JRadioButton agreeWithLicenseRadioButton;
    private JRadioButton disagreeRadioButton;
    private JButton button1;
    private JTextPane loremIpsumDolorSitTextPane;
    private JScrollBar scrollBar1;

    public Window() {
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,1,1,1));;

        ButtonGroup group = new ButtonGroup();
        group.add(agreeWithLicenseRadioButton);
        group.add(disagreeRadioButton);
        container.add(agreeWithLicenseRadioButton);

        agreeWithLicenseRadioButton.setSelected(true);
        container.add(disagreeRadioButton);
        button1.addActionListener(new ButtonEventListener());

        container.add(button1);

    }
    int i = 0;

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            i++;
            button1.setText(String.valueOf(i));

        }
    }
}

