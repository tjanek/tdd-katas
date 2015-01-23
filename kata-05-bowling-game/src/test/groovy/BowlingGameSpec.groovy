
class BowlingGameSpec extends spock.lang.Specification {

    Game game = new Game()

    def "should score zero on gutter game"() {

        when:
        rollMany 20, 0

        then:
        game.score() == 0
    }

    def "should score twenty all ones"() {

        when:
        rollMany 20, 1

        then:
        game.score() == 20
    }

    def "should score one spare"() {

        when:
        spare()
        game.roll 3
        rollMany 17, 0

        then:
        game.score() == 16
    }

    def "should score one strike"() {

        when:
        strike()
        game.roll 3
        game.roll 4
        rollMany 16, 0

        then:
        game.score() == 24
    }

    def "should score one perfect game"() {

        when:
        rollMany 12, 10

        then:
        game.score() == 300
    }

    private def rollMany(Integer n, Integer pins) {
        (1..n).each { game.roll pins }
    }

    private def spare() {
        game.roll 5
        game.roll 5
    }

    private def strike() {
        game.roll 10
    }
}
