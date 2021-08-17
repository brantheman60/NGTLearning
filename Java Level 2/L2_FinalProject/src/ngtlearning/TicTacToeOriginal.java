package ngtlearning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TicTacToe extends JFrame 
{	
	private static final long serialVersionUID = 1;
	JFrame gameFrame = new JFrame("TicTacToe Game");                    
	JButton[][] buttons = new JButton[3][3];         
	JButton resetBtn = new JButton("Reset");
	JOptionPane popup;
	int remainingChances = 9;
	boolean gameOver = false;

	public TicTacToe()                                      
	{
		super();
		gameFrame.setSize(350, 450);
		gameFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);        
		gameFrame.setVisible(true);
		gameFrame.setResizable(false);
	}

	private void initializeScreen()            
	{
		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel butttonPanel = new JPanel(new BorderLayout());
		JPanel gamePanel = new JPanel(new GridLayout(3,3));
		
		mainPanel.setPreferredSize(new Dimension(325,425));
		butttonPanel.setPreferredSize(new Dimension(300,50));
		gamePanel.setPreferredSize(new Dimension(300,300));
		
		butttonPanel.add(resetBtn, BorderLayout.EAST);
		resetBtn.addActionListener(new myActionListener());
    
		mainPanel.add(butttonPanel, BorderLayout.NORTH);
		mainPanel.add(gamePanel, BorderLayout.SOUTH);
		
		gameFrame.add(mainPanel);     

		for(int i = 0; i < 3; i++)	//Create grid of 3 x 3 empty buttons
		{
			for(int j = 0; j < 3; j++) 
			{
				buttons[i][j] = new JButton();                
				buttons[i][j].setText("");
				buttons[i][j].setVisible(true);
				buttons[i][j].setName(i+""+j);				
				gamePanel.add(buttons[i][j]); 
				//Add ActionListener
				buttons[i][j].addActionListener(new myActionListener());
			}
		}
	}
 
	private class myActionListener implements ActionListener
	{      //Action listener for buttons
		public void actionPerformed(ActionEvent a) 
		{
			if(a.getSource().equals(resetBtn))
	        {
				resetGame();
	        }  
			else if (gameOver != true)
			{
				if (a.getSource() instanceof JButton)
				{
					JButton buttonSelected = (JButton)a.getSource();
					int i = new Integer(buttonSelected.getName().substring(0,1));
					int j = new Integer(buttonSelected.getName().substring(1,2));
					buttons[i][j].setText("X");
					buttons[i][j].setEnabled(false);
					int status = checkWinCondition(i,j);
					if (status == 2)
					{
						remainingChances--;
						//this was the old code: computerTurn(remainingChances);
						//the following implements the code that makes the computer smarter
						computerTurn(i,j,remainingChances);
					}
				}
			}
	    }
	}

	private int checkWinCondition(int row, int col)
	{
		int inputValue = 2;
		if(buttons[row][0].getText().equals(buttons[row][1].getText())
			&& buttons[row][1].getText().equals(buttons[row][2].getText()))
		{
			gameOver = true; //If all the columns in that row are same
		}
		else if(buttons[0][col].getText().equals(buttons[1][col].getText())
				&& buttons[1][col].getText().equals(buttons[2][col].getText()))
		{
			gameOver = true; //If all the rows in that column are same
		}
		else if(buttons[0][0].getText().equals(buttons[1][1].getText())
				&& buttons[1][1].getText().equals(buttons[2][2].getText())
				&& buttons[row][col].getText().equals(buttons[0][0].getText()))
		{
			gameOver = true; //Check for diagonal win condition
		}
		else if(buttons[2][0].getText().equals(buttons[1][1].getText())
				&& buttons[1][1].getText().equals(buttons[0][2].getText())
				&& buttons[row][col].getText().equals(buttons[0][2].getText()))
		{
			gameOver = true; //Check for diagonal win condition
		}
		if (gameOver)
		{
			String winner = "You win!!!";
			if (buttons[row][col].getText().toLowerCase().equals("o") )
				winner = "Computer wins!!!";
			System.out.println(winner);
			inputValue = JOptionPane.showConfirmDialog(null, winner+
					"\n Do you want to play another game?" , "Game Over!!!"
					, JOptionPane.YES_NO_OPTION);
					if (inputValue == 0) //First option selected
						resetGame();
					else if (inputValue == 1)
						System.exit(0);
		}
		return inputValue;
	}
	private void resetGame()
	{
		for(int i =0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				buttons[i][j].setText("");
				buttons[i][j].setEnabled(true);
			}
		}
	gameOver = false;
	remainingChances = 9;
}
	private void computerTurn(int count)
	{
		int randomMove;
		Random num = new Random();
		if (count > 1)
			randomMove = num.nextInt(count)+1;
		else
			randomMove = 1;
		
		if (gameOver == false)
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(buttons[i][j].isEnabled()==true)
					{
						randomMove--;
						if(randomMove==0){
							buttons[i][j].setText("O");
							buttons[i][j].setEnabled(false);
							remainingChances--;
							checkWinCondition(i,j);
							return;
						}
					}
				}
			}
		}
	}
	
	/**The 5 methods after this are necessary to make the computer "smart" and
	 * not random.
	 * 
	 *                          ...                  ...
	 *                          ...                  ...
	 *                          ...                  ...
	 *                          ...                  ...
	 *                             ..................
	 */
	
	private void computerTurn (int row, int col, int count)
	{//check position based on the position of the user (using checkPosition's logic)
		if (gameOver)
			return;
		if (checkPosition(row, col, count, "x"))
			return;
		else
			computerTurn(count);
	}
	private boolean checkPosition(int row, int col, int count, String c)
	{ //check columns, row, and diagonals; this relies on the 3 methods after this
		int [] rowCol = {-1,-1};
		if (checkCol (row, col, c)[0] != -1){
			rowCol = checkCol (row, col, c);
		}
		else if (checkRow(row, col, c)[0] != -1){
			rowCol = checkRow (row, col, c);
		}
		else if (checkCross(row, col, 0, c)[0] != -1){
			rowCol = checkRow (row, col, c);
		}
		else if (checkCross(row, col, 2, c)[0] != -1){
			rowCol = checkCross (row, col, 2, c);
		}
		if (rowCol[0] != -1 && rowCol[1] != -1){
			buttons[rowCol[0]][rowCol[1]].setText("O");
			buttons[rowCol[0]][rowCol[1]].setEnabled(false);
			remainingChances--;
			checkWinCondition(rowCol[0],rowCol[1]);
			return true;
		}
		else
			return false;
	}
	private int[] checkCol (int row, int col, String c)
	{//check the columns and the 3 squares to check what's inside each
		int[] val = new int[3];
		int cellLocation[] = {-1,-1};
		for(int i=0; i<3;i++)
		{
			if (buttons[row][i].isEnabled()==true){//nothing here yet
				val[i]=0;
				cellLocation[0] = row;
				cellLocation[1] = i;
			}
			else if(buttons[row][i].getText().equals(c))//opponent square here
				val[i] = 1;
			else//computer's square here
				val[i] = -1;
		}
		if (val[0]+val[1]+val[2] !=2){ //if there are not 2 opponent's squares...
			cellLocation[0] = -1;
			cellLocation[1] = -1;
		}
		return cellLocation;
	}
	private int[] checkRow (int row, int col, String c)

	{//same logic as checkCol
		int[] val = new int[3];
		int cellLocation[] = {-1,-1};
		for(int i=0; i<3;i++)
		{
			if (buttons[i][col].isEnabled()==true){
				val[i]=0;
				cellLocation[0] = row;
				cellLocation[1] = i;
			}
			else if(buttons[i][col].getText().equals(c))
				val[i] = 1;
			else
				val[i] = -1;
		}
		if (val[0]+val[1]+val[2] !=2){
			cellLocation[0] = -1;
			cellLocation[1] = -1;
		}
		return cellLocation;
	}
	private int[] checkCross (int row, int col, int startCol, String c)
	{//same logic, except diagonals are checked instead
		int[] val = new int[3];
		int cellLocation[] = {-1,-1};
		int j = startCol;
		int jump = 1;
		if (startCol == 2)
			jump = -1;
		for(int i=0; i<3;i++)
		{
			if (buttons[i][col].isEnabled()==true){
				val[i]=0;
				cellLocation[0] = i;
				cellLocation[1] = j;
			}
			else if(buttons[i][col].getText().equals(c))
				val[i] = 1;
			else
				val[i] = -1;
			j=j+jump;
		}
		if (val[0]+val[1]+val[2] !=2){
			cellLocation[0] = -1;
			cellLocation[1] = -1;
		}
		return cellLocation;
	}
	public static void main(String[] args)
	{
		TicTacToe myGame = new TicTacToe();         
		myGame.initializeScreen();
	}
}