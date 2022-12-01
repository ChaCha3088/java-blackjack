import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<String> PLAYERNAMES;
    List<Member> MEMBERS = new ArrayList<>();

    public Game() {
        this.PLAYERNAMES = GameController.repeatInputPlayerNames();
    }

    public void start() {
        for (Integer i = 0; i < PLAYERNAMES.size(); i++) {
            MEMBERS.add(new Member(PLAYERNAMES.get(i), false));
        }
    }

    public void play() {
        GameController.executeGame(CARS, MOVECOUNTS);
    }
}