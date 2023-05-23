/* Code snippet: */

import java.util.*;
import java.IoExceptions;
import java.awt.*;
import java.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyComponent implements java.io.Serializable{
    private Jlabel label;
    private JTextField textfield;
    private JButton button;
    
    private static void main(String[] args){
        JFrame frame = new JFrame("My Component");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("name");
        textfield = new JTextField(20);
        button = new JButton("Click me");
        button.setSize(20, 20);
        button.addActionListener(new ButtonListener());
        
        frame.add(label);
        frame.add(textfield);
        frame.add(button);

    }
}

public String getName(){
    return textfield.getText();
}

public String setName(String name){
    textfield.setText(name);
}

class ButtonListener implements ActionListener(){
    public void actionPerformed(ActionEvent e){
        System.out.println("Button Clicked");
        String name = getName();
        System.out.println("Name :" + name);
    }
}
