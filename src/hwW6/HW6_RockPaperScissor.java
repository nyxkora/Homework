package hwW6;
import javax.swing.JOptionPane;
public class HW6_RockPaperScissor {

	public static void main(String[] args) {
		int comp, user=0;
		boolean again;
		String userS;
		String win=" . You won!";
		String lose =" . You lose!";
		String r = " Rock";
		String p = " Paper";
		String s = " Scissors";
			
		//Start
		comp = (1+(int)(Math.random()*3));
		do
		{ 	again = false;	
			//JOptionPane.showMessageDialog(null, comp);
			userS = JOptionPane.showInputDialog("Lets play Rock, Paper, Scissors. Choose your weapon! ");
			
			if(userS.equals("r")|| userS.equals("R") || userS.equals("Rock") || userS.equals("rock"))
				user=1;
			else if(userS.equals("p") || userS.equals("P") || userS.equals("Paper") || userS.equals("paper"))
				user=2;
			else if(userS.equals("s")|| userS.equals("S") || userS.equals("Scissors") || userS.equals("scissors"))
				user=3;
			else
			{
				JOptionPane.showMessageDialog(null, "Not a valid input, try again.");
				again=true;	
			}
		}
		while(again);
		
		if(user == comp)
			JOptionPane.showMessageDialog(null, " Tie!");
		else if (user == 1)
		{
			if(comp == 2)
				JOptionPane.showMessageDialog(null, "You chose "+ r +", computer chose " + p +lose);
			else if(comp == 3)
				JOptionPane.showMessageDialog(null, "You chose "+ r +", computer chose " + s +win);
		}
		else if (user == 2)
		{	
			if(comp ==1)
				JOptionPane.showMessageDialog(null, "You chose "+ p +", computer chose " + r +win);
			else if(comp ==3)
				JOptionPane.showMessageDialog(null, "You chose "+ p +", computer chose " + s +lose);
		}
		else 
		{
			if(comp==1)
				JOptionPane.showMessageDialog(null, "You chose "+ s +", computer chose " + r +lose);
			else if(comp==2)
				JOptionPane.showMessageDialog(null, "You chose "+ s +", computer chose " + p +win);
		}
	}
}
