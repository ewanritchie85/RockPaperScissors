public class Player {
    private final String playerMove;
    private final String playerName;

    //constructor
    public Player(String playerMove, String playerName){
        this.playerMove = playerMove;
        this.playerName = playerName;
    }

    public String getPlayerMove(){
        System.out.println(playerName+" played "+playerMove);
        return playerMove;
    }

    public String getPlayerName(){
        return playerName;
    }




}
