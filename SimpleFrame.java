/* Code snippet :*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameExample{
    static JLabel label;
    static JTextField textfield;
    static JButton button;
    
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("Enter your name");
        textfield = new JTextField(20);
        button = new JButton("Click me");
        frame.add(label);
        frame.add(textfield);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
