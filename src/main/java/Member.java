import java.util.LinkedHashMap;
import java.util.List;

public class Member {
    private final String NAME;
    private final Boolean DEALER;
    private Integer bettingAmount;
    private List<LinkedHashMap<Integer, Integer>> cardList;
    public Member(String name, Boolean dealer, Integer bettingAmount) {
        this.NAME = name;
        this.DEALER = dealer;
        this.bettingAmount = bettingAmount;
    }
}
