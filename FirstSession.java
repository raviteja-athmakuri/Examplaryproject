import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

public class FirstSession implements ActionListener {
    JFrame frame;
    JTextArea myarea;
    JButton button;
    FirstSession(){
        //creating frame
        frame=new JFrame("First Session");
        frame.setBounds(200,200,300,300);
        //frame.setBackground(black);
        frame.getContentPane().setBackground(Color.BLACK);
        //creating text area
        myarea=new JTextArea("Welcome to the text area");
        myarea.setBounds(50,50,200,200);
        frame.add(myarea);
        myarea.setBackground(red);

        // creating button
        button=new JButton("Click");
        button.setBounds(120,20,75,20);
        button.addActionListener(this);    // adding function to the button
        frame.add(button);                   // adding button to frame
        // rest of these are just frame stuff
        frame.setLayout(null);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        FirstSession obj=new FirstSession();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       myarea.setText("You Clicked the button");
    }
}
