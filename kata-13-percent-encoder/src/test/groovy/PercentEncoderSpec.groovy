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

    def "Encoder should encode reserved chars in URL"() {
        expect:
        percentEncoder.encode("http://www.test.com?p1=v1&p2=v2") == "http%3A%2F%2Fwww.test.com%3Fp1%3Dv1%26p2%3Dv2"
    }
}
