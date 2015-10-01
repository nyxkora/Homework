package hwW6;
import javax.swing.JOptionPane;
public class HW6_RockPaperScissor {

	public static void main(String[] args) {
		int comp;
		boolean again;
		String userMove, compMove;
		String r = "Rock";
		String p = "Paper";
		String s = "Scissors";
			
		//Start
		
		//Set CompMove
		comp = (1+(int)(Math.random()*3));
		if (comp==1)
			compMove=r;
		else if (comp==2)
			compMove=p;
		else
			compMove=s;	
		//Get UserMove
		do
		{ 	again = false;	
			
			userMove = JOptionPane.showInputDialog("Lets play Rock, Paper, Scissors. Choose your weapon! ");
			
			if(userMove.equals("r")|| userMove.equals("R") 
					|| userMove.equals("Rock") || userMove.equals("rock"))
				userMove=r;
			else if(userMove.equals("p") || userMove.equals("P") 
					|| userMove.equals("Paper") || userMove.equals("paper"))
				userMove=p;
			else if(userMove.equals("s")|| userMove.equals("S") 
					|| userMove.equals("Scissors") || userMove.equals("scissors"))
				userMove=s;
			else
			{
				JOptionPane.showMessageDialog(null, "Not a valid input, try again.");
				again=true;	
			}
			//JOptionPane.showMessageDialog(null, compMove + userMove);//Debug
		}
		while(again); //Repeat until user enters a valid input
		
		String win  =String.format("You chose %s, computer chose %s. You won!", userMove,compMove);
		String lose =String.format("You chose %s, computer chose %s. You lost!", userMove,compMove);
		
		//Compare compMove & userMove to see who won
		if(userMove.equals(compMove))
			JOptionPane.showMessageDialog(null, " Tie!");
		
		else if (userMove.equals(r) && compMove.equals(s) )
			JOptionPane.showMessageDialog(null,win);
		
		else if (userMove.equals(p) && compMove.equals(r))
			JOptionPane.showMessageDialog(null,win);
		
		else if (userMove.equals(s) && compMove.equals(p))
			JOptionPane.showMessageDialog(null,win);
		
		else //if the above moves didn't happen, user lost	
			JOptionPane.showMessageDialog(null,lose);
	}
}
