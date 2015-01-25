import spock.lang.Specification

class StringCalculatorSpec extends Specification {

    StringCalculator calculator = new StringCalculator()

    def "should return 0 for add empty string"() {
        expect:
        calculator.add("") == 0
    }

    def "should return 1 for add one string of '1'"() {
        expect:
        calculator.add("1") == 1
    }

    def "should return 2 for add one string of '2'"() {
        expect:
        calculator.add("2") == 2
    }

    def "should return 3 for add two strings of '1' and '2'"() {
        expect:
        calculator.add("1,2") == 3
    }

    def "should return 5 for add two strings of '2' and '3'"() {
        expect:
        calculator.add("2,3") == 5
    }

    def "should return 6 for add three strings of '1','2' and '3'"() {
        expect:
        calculator.add("1,2,3") == 6
    }

    def "should return 26 for add four strings of '5','6','7' and '8'"() {
        expect:
        calculator.add("5,6,7,8") == 26
    }

    def "should return 6 for add three strings of '1','2' with new line and '3'"() {
        expect:
        calculator.add("1\n2,3") == 6
    }

}
