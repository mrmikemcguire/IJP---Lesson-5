import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUICountdown implements ActionListener
	{
    private JFrame frame;
    private JButton button;
    private Container contentPane;
    private JLabel label;


    public static void main (String[] args) 
    	{
        GUICountdown guiCount = new GUICountdown();
        guiCount.start();
    	}

    public void start() 
    	{
        frame = new JFrame("Countdown");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        contentPane = frame.getContentPane();
               
        button = new JButton("Press to Start");
        button.addActionListener(this);
        contentPane.add(button);
    	
        frame.setSize(300, 300);
        frame.setVisible(true);
    	}
    
    public void actionPerformed(ActionEvent e)
    	{
        button.setForeground(Color.red);

	        if (button.getText().equals("Press to Start")) button.setText("Five");
	        else if (button.getText().equals("Five")) button.setText("Four");
	        else if (button.getText().equals("Four")) button.setText("Three");
	        else if (button.getText().equals("Three")) button.setText("Two");
	        else if (button.getText().equals("Two")) button.setText("One");
	        else if (button.getText().equals("One"))
	        	{
	        	button.setVisible(false);
	        	label = new JLabel ("Boom!");
	            contentPane.add(label);
	        	}

    	}
    }