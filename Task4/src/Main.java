import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ArrayList<String> actions = new ArrayList<>(Arrays.asList("Start game ", "Resume game ", "Pause game ", "End game "));

        Menu m = new Menu(actions);
        int input= m.showMenu();
        doAction(input);

    }

    public static void doAction(int action) {


        switch (action){
            case 1:
        System.out.println("Starting the game now");
                break;
            case 2:
        System.out.println( "Fetching previously saved game data");
                break;
            case 3:
        System.out.println( "Game paused");
                break;
            case 4:
        System.out.println( "Ending game");
        break;

        }

    }

}
