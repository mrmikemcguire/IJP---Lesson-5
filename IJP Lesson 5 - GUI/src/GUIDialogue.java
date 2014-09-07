import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIDialogue implements ActionListener
{
    private JFrame frame;
    private JButton button;

    public static void main (String[] args) 
    {
        GUIDialogue guiButton = new GUIDialogue();
        guiButton.start();
    }

    public void start() 
    {
        frame = new JFrame("GUI Dialog");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        

        
        for (int i = 5; i >= 0; i--)
        		{
            int countdown = i;
            String stringCountdown = Integer.toString(countdown);
            button = new JButton(stringCountdown);
            
            button.addActionListener(this);
            contentPane.add(button);
        		}

        
        if(button.equals("0"))
        			{
        			}

        frame.pack();
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String textToShow;
        textToShow = JOptionPane.showInputDialog(
                frame,
                "Enter the text you want to display:",
                "Input Dialog",
                JOptionPane.QUESTION_MESSAGE);
        if (textToShow != null)
        {
            button.setForeground(Color.red);
            button.setText(textToShow);
        }
    }
}