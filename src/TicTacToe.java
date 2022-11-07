import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe implements ActionListener {

    JFrame mainFrame;
    JPanel buttonPanel;
    JButton[] buttons = new JButton[9];
    boolean player1Turn = true;

    public void init() {
        mainFrame = new JFrame("Tic Tac Toe");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(700, 500);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));

        for(int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Dialog", Font.BOLD, 50));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
        }
        
        mainFrame.add(buttonPanel);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i <9;i++) {
            if(e.getSource() == buttons[i]) {
                if(player1Turn) {
                    if(buttons[i].getText().isEmpty()) {
                        buttons[i].setText("X");
                        player1Turn = false;
                    }
                }
                else{
                    if(buttons[i].getText().isEmpty()) {
                        buttons[i].setText("O");
                        player1Turn = true;
                    }                    
                }
            }
        }
        
    }
    
}
