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
        codeLineCounter.count(" // int age; ") == 0
    }

    def "should not count commented line with comment at the end"() {
        expect:
        codeLineCounter.count(" \t // int age;") == 0
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

    def "should count one line of code"() {
        expect:
        codeLineCounter.count(" class ") == 1
    }

    def "should count two lines of code"() {
        expect:
        codeLineCounter.count(
            "int age;",
            "String name;"
        ) == 2
    }

    def "should count code lines before and after commented block "() {
        expect:
        codeLineCounter.count(
            "public class Person {",
            "/**",
            " * age",
            "*/",
            "int age;",
            "// comment",
            "}"
        ) == 3
    }

    def "should count code lines with multiple comments block in one line"() {
        expect:
        codeLineCounter.count(
            "public class Person { // comment ",
            "    // another comment",
            "  int/*comment*/age/*comment*/;/*",
            "  comment",
            "  comment*/",
            "}"
        ) == 3
    }

    def "should count code lines with comments block starts after another"() {
        expect:
        codeLineCounter.count(
                "public class Person { // comment ",
                "    // another comment",
                "  /*comment*//*",
                "  comment",
                "  comment*/",
                "}"
        ) == 2
    }

}
