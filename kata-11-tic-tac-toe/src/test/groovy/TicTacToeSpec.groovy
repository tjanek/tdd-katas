import spock.lang.Specification

class TicTacToeSpec extends Specification {

    TicTacToe ticTacToe = new TicTacToe()

    def "should finish game after three marks in columns as circle"() {
        when:
        ticTacToe.markAsCircleAt(0, 0)
        ticTacToe.markAsCircleAt(1, 0)
        ticTacToe.markAsCircleAt(2, 0)

        then:
        ticTacToe.isFinished() == true
    }

    def "should not finish game after two marks in columns as circle"() {
        when:
        ticTacToe.markAsCircleAt(0, 0)
        ticTacToe.markAsCircleAt(1, 0)

        then:
        ticTacToe.isFinished() == false
    }

    def "should not finish game after one marks in columns as circle"() {
        when:
        ticTacToe.markAsCircleAt(0, 0)

        then:
        ticTacToe.isFinished() == false
    }

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

    def "should all fields must be not marked at the beginning"() {
        expect:
        ticTacToe.markedAsCross(x, y) == false
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
