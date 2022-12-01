public class CardEnum {
    enum CardType {
        CLOVER(0),
        HEART(1),
        DIAMOND(2),
        SPADE(3);

        private Integer number;

        CardType(final Integer number) {
            this.number = number;
        }
    }

    enum CardNumber {
        A(1, 1),
        TWO(2, 2),
        THREE(3, 3),
        FOUR(4, 4),
        FIVE(5, 5),
        SIX(6, 6),
        SEVEN(7, 7),
        EIGHT(8, 8),
        NINE(9, 9),
        JACK(10, 10),
        QUEEN(11, 10),
        KING(12, 10);

        private Integer number;
        private Integer score;

        CardNumber(final Integer number, final Integer score) {
            this.number = number;
            this.score = score;
        }
    }
}
