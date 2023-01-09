package lab4exercises;

import javax.swing.JOptionPane;


public class RockPaperScissors {

    public static void main(String[] args) {

        //double computerChoice = 3.0* Math.random()  this generates any number from 0-3 
        // long computerChoice = Math.round(3.0* Math.random()) rounds up to get a whole number Long 
        // long computerChoice= Math.round(3.0 *Math.random()-0.5) means we never go above 2.5 which when rounded up becomes 2.  
        //typecast to an int because the operation could be double
        String message = "No Selection Made";
        int count = 0;
        int computerScore = 0, playerScore = 0;
        String playerChoice = ""; //initialze the string 
        String computerChoiceW = "";
        int input = 0;
        int more = 0;

        do { //external loop starts 
            int computerChoice = (int) Math.round(3.0 * Math.random() - 0.5); //computer random choic typecasted to int
            count++;
            do { //internal loop 
                input = Integer.parseInt(JOptionPane.showInputDialog("Choose a Number. Options: 0(Rock) 1(Paper) 2 (Scissors)"));
                switch (input) {
                    case 0:
                        playerChoice = "rock"; //player chose rock
                        if (computerChoice == 1) {
                            computerScore++;
                            computerChoiceW = "paper";
                            message = "You lose";
                            break; //rock loses to paper as paper covers rock
                        } else if (computerChoice == 2) {
                            playerScore++;
                            computerChoiceW = "scissors";
                            message = "You win";
                            break; //rock crushes scissors
                        } else {
                            computerChoiceW = "rock";
                            message = "draw";
                            break;
                        }
                    case 1: //player chose paper
                        playerChoice = "paper";
                        if (computerChoice == 2) {
                            computerChoiceW = "scissors";
                            computerScore++;
                            message = "You lose";
                            break; //scissors cuts paper
                        } else if (computerChoice == 0) {
                            computerChoiceW = "rock";
                            playerScore++;
                            message = "You win"; //paper covers rock
                            break;
                        } else {
                            computerChoiceW = "paper";
                            message = "draw";
                            break;
                        }
                    case 2: //player chose scissors
                        playerChoice = "scissors";
                        if (computerChoice == 0) {
                            computerChoiceW = "rock";
                            computerScore++;
                            message = "You lose";
                            break; //rocks crushes scissors
                        } else if (computerChoice == 1) {
                            computerChoiceW = "paper";
                            playerScore++;
                            message = "You win"; //scissors cuts paper
                            break;
                        } else {
                            computerChoiceW = "scissors";
                            message = "draw";
                            break;
                        }
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Selection");
                }
            } while (input != 0 && input != 1 && input != 2); //internal loops ends
            
            //input is not equal to 1 and not equal to 2 and not equal to 3 

            more = JOptionPane.showConfirmDialog(null, message + "\n You chose " + playerChoice + "\n Computer chose " + computerChoiceW
                    + "\n After " + count + " rounds" + "\n Player score is " + playerScore
                    + "\n Computer Score is " + computerScore
                    + "\n Another round?");

        } while (more != JOptionPane.NO_OPTION); //external loop ends 

        JOptionPane.showMessageDialog(null, "Thanks for playing");
    }
}
