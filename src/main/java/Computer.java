import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Computer extends Player {

    private final Map<Integer, String> moves = new HashMap<>();
    private final String computerMove;

    //constructor
    public Computer(){
        super(null, "Computer");
        moves.put(1,"rock");
        moves.put(2,"paper");
        moves.put(3,"scissors");
        this.computerMove = setComputerMove();

    }

    private String setComputerMove(){
        Random random = new Random();
        int randomNumber = random.nextInt(3)+1;
        return moves.get(randomNumber);
    }

    public String getComputerMove(){
        System.out.println("The computer played "+computerMove);
        return computerMove;
    }


}
