import spock.lang.Specification

class ReversePolishNotationSpec extends Specification {

    def "Should be calculated from reverse polish notation"() {
        expect:
        ReversePolishNotation.calculate(notation) == value

        where:
        notation            | value
        "1 2 +"             | 3.0
        "1 2 -"             | -1.0
        "10 2 /"            | 5.0
        "-10 2 /"           | -5.0
        "-12.9 3 /"         | -4.3
        "1 2 + 4 * 5 + 3 -" | 14.0
    }
}
