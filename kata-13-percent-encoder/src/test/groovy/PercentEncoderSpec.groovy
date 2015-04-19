import spock.lang.Specification
import spock.lang.Unroll

class PercentEncoderSpec extends Specification {

    PercentEncoder percentEncoder = new PercentEncoder()

    @Unroll
    def "Encoder should encode reserved char '#reservedChar' to '#encoded'"() {
        expect:
        percentEncoder.encode(reservedChar) == encoded

        where:
        reservedChar | encoded
        "!"          | "%21"
        "#"          | "%23"
        "\$"         | "%24"
        "%"          | "%25"
        "&"          | "%26"
        "'"          | "%27"
    }
}
