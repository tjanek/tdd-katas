import spock.lang.Specification

class CodeLineCounterSpec extends Specification {

    CodeLineCounter codeLineCounter = new CodeLineCounter()

    def "should not count empty line"() {
        expect:
        codeLineCounter.count("") == 0
    }

    def "should not count blank line"() {
        expect:
        codeLineCounter.count(" ") == 0
    }

    def "should not count commented line"() {
        expect:
        codeLineCounter.count(" // int age = 0; ") == 0
    }

    def "should not count commented line with comment at the end"() {
        expect:
        codeLineCounter.count(" \t // int age = 0;") == 0
    }

    def "should not count for one commented block in one line"() {
        expect:
        codeLineCounter.count(" /* comment */ ") == 0
    }

    def "should not count for commented blocks in many lines"() {
        expect:
        codeLineCounter.count(
            " /** ",
            " * comment ",
            " */ "
        ) == 0
    }

    def "should not count of comments in one line of code"() {
        expect:
        codeLineCounter.count("/* comment *//*comment*/") == 0
    }
}
