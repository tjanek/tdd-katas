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
        "("          | "%28"
        ")"          | "%29"
        "*"          | "%%2A"
        "+"          | "%2B"
        ","          | "%2C"
        "/"          | "%2F"
        ":"          | "%3A"
        ";"          | "%3B"
        "="          | "%3D"
        "?"          | "%3F"
        "@"          | "%40"
        "["          | "%5B"
        "]"          | "%5D"
        " "          | "%20"
    }
}
