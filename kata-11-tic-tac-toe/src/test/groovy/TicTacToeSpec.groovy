import spock.lang.Specification

class TicTacToeSpec extends Specification {

    TicTacToe ticTacToe = new TicTacToe()

    def "should mark fields as circle"() {
        when:
        ticTacToe.markAsCircleAt(x, y)

        then:
        ticTacToe.markedAsCircle(x, y) == true
        ticTacToe.markedAsCross(x, y) == false


        where:
        x | y
        0 | 0
        0 | 1
        0 | 2
        1 | 0
        1 | 1
        1 | 2
        2 | 0
        2 | 1
        2 | 2
    }

    def "should mark fields as cross"() {
        when:
        ticTacToe.markAsCrossAt(x, y)

        then:
        ticTacToe.markedAsCross(x, y) == true
        ticTacToe.markedAsCircle(x, y) == false


        where:
        x | y
        0 | 0
        0 | 1
        0 | 2
        1 | 0
        1 | 1
        1 | 2
        2 | 0
        2 | 1
        2 | 2
    }
}
