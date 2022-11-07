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
                        checkWinConditions();
                    }
                }
                else{
                    if(buttons[i].getText().isEmpty()) {
                        buttons[i].setText("O");
                        player1Turn = true;
                        checkWinConditions();
                    }                    
                }
            }
        }
        
    }

    private void checkWinConditions() {
        if(
            (buttons[0].getText() == "X") &&
            (buttons[1].getText() == "X") &&
            (buttons[2].getText() == "X")
        ){
            winner("x", 0, 1, 2);
        }
        if(
            (buttons[3].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[5].getText() == "X")
        ){
            winner("x", 3, 4, 5);
        }
        if(
            (buttons[6].getText() == "X") &&
            (buttons[7].getText() == "X") &&
            (buttons[8].getText() == "X")
        ){
            winner("x", 6, 7, 8);
        }
        if(
            (buttons[0].getText() == "X") &&
            (buttons[3].getText() == "X") &&
            (buttons[6].getText() == "X")
        ){
            winner("x", 0, 3, 6);
        }
        if(
            (buttons[1].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[7].getText() == "X")
        ){
            winner("x", 1, 4, 7);
        }
        if(
            (buttons[2].getText() == "X") &&
            (buttons[5].getText() == "X") &&
            (buttons[8].getText() == "X")
        ){
            winner("x", 2, 5, 8);
        }
        if(
            (buttons[0].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[8].getText() == "X")
        ){
            winner("x", 0, 4, 8);
        }
        if(
            (buttons[2].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[6].getText() == "X")
        ){
            winner("x", 2, 4, 6);
        }
        if(
            (buttons[0].getText() == "O") &&
            (buttons[1].getText() == "O") &&
            (buttons[2].getText() == "O")
        ){
            winner("o", 0, 1, 2);
        }
        if(
            (buttons[3].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[5].getText() == "O")
        ){
            winner("o", 3, 4, 5);
        }
        if(
            (buttons[6].getText() == "O") &&
            (buttons[7].getText() == "O") &&
            (buttons[8].getText() == "O")
        ){
            winner("o", 6, 7, 8);
        }
        if(
            (buttons[0].getText() == "O") &&
            (buttons[3].getText() == "O") &&
            (buttons[6].getText() == "O")
        ){
            winner("o", 0, 3, 6);
        }
        if(
            (buttons[1].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[7].getText() == "O")
        ){
            winner("o", 1, 4, 7);
        }
        if(
            (buttons[2].getText() == "O") &&
            (buttons[5].getText() == "O") &&
            (buttons[8].getText() == "O")
        ){
            winner("o", 2, 5, 8);
        }
        if(
            (buttons[0].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[8].getText() == "O")
        ){
            winner("o", 0, 4, 8);
        }
        if(
            (buttons[2].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[6].getText() == "O")
        ){
            winner("o", 2, 4, 6);
        }                                      
    }

    private void winner(String winner, int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);

        for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}

    }
    
}
