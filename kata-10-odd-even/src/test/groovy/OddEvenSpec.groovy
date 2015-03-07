import spock.lang.Specification

class OddEvenSpec extends Specification {

    def "should print '#result' for numbers in range [#startRange, #endRange]"() {

        expect:
        OddEven.print(startRange, endRange) == result

        where:
        startRange | endRange | result
        1          | 10       | "Odd23Even5Even7Even9Even"
    }
}
