import spock.lang.Specification
import spock.lang.Unroll

class PrimeFactorsSpec extends Specification {

    @Unroll()
    def "should generate prime factors of #factors for given number #number"() {

        expect:
        PrimeFactors.generate(number) == factors

        where:
        number | factors
        1      | []
        2      | [2]
        3      | [3]
        4      | [2,2]
        6      | [2,3]
        8      | [2,2,2]
        9      | [3,3]
        10     | [2,5]

    }
}
