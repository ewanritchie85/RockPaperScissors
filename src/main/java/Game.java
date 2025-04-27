
public class Game {
    private final String playerMove;
    private final String computerMove;

    public Game(String playerMove){
        this.playerMove = playerMove;
        //instantiate computer object - and it's move -
        // when game is instantiated
        Computer computer = new Computer();
        this.computerMove = computer.getComputerMove();

    }
    public String match(){

        if (playerMove.equals(computerMove)){
            return "It's a draw. Try again.";
        }

        //intellij upgraded my switch to enhanced switch, and I like!
        return switch (playerMove) {
            case "rock" -> (computerMove.equals("scissors")) ? "Rock beats scissors. You win." : "Paper beats rock. Computer wins.";
            case "paper" -> (computerMove.equals("rock")) ? "Paper beats rock. You win." : "Scissors beat paper. Computer wins.";
            case "scissors" -> (computerMove.equals("paper")) ? "Scissors beat paper. You win." : "Rock beats scissors. Computer wins.";
            default -> "Not a valid move. Try again.";
        };
    }

    public boolean isDraw(){
        return match().equals("It's a draw. Try again.");
    }

    public boolean playerWins(){
        return match().contains("You win");
    }


}
