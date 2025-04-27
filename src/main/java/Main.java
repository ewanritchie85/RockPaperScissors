import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name");
        String playerName = input.nextLine().trim();
        System.out.println("Hello, "+playerName+". Let's play rock, paper, scissors.");


        //Option to choose best of three
        int gameNum =0;
        System.out.println("Would you like to play 1 round, or best of 3?");
        while (gameNum != 1 && gameNum != 3) {
            try {
                System.out.println("Please enter 1 or 3.");
                gameNum = input.nextInt();
                input.nextLine();
            }
            catch(Exception e){
                System.out.println("You must enter a number.");
                input.next();
            }
        }

    int playerWinCount = 0;
    int computerWinCount = 0;

        while (playerWinCount < gameNum && computerWinCount < gameNum) {
            String playerMove;
            while (true)
                try {
                    System.out.println("Choose rock, paper, or scissors");
                    playerMove = input.nextLine().toLowerCase().trim();
                    if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                        throw new IllegalArgumentException("You must enter rock, paper, or scissors");
                    }
                    break;

                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
            }
            Player player = new Player(playerMove, playerName);
            Game newGame = new Game(player.getPlayerMove());

            System.out.println(newGame.match());
            if (newGame.isDraw()) {
                continue;
            }

            if (newGame.playerWins()) {
                playerWinCount++;
                System.out.println("Computer wins: " + computerWinCount);
                System.out.println("Your wins: " + playerWinCount);
                if (playerWinCount == (gameNum == 3 ? 2 : 1) ) {
                    System.out.println("Well done " + player.getPlayerName() + ", you have triumphed over my wonderful code.");
                    break;
                }
            } else {
                computerWinCount++;
                System.out.println("Computer wins: " + computerWinCount);
                System.out.println("Your wins: " + playerWinCount);
                if (computerWinCount == (gameNum == 3 ? 2 : 1)) {
                    System.out.println("Sorry " + player.getPlayerName() + ", you have been bested by an unconscious machine.");
                    break;
                }
            }
        }

        input.close();

    }

}


