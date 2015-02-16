import spock.lang.Specification
import spock.lang.Unroll

class RomanNumeralsConverterSpecs extends Specification {

    RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter()

    @Unroll()
    def "should convert arabic number #arabicNumber to roman equivalent #romanNumber"() {

        expect:
        romanNumeralsConverter.arabicToRoman(arabicNumber) == romanNumber

        where:
        arabicNumber | romanNumber
        1            | "I"
        2            | "II"
        3            | "III"
        4            | "IV"
        5            | "V"
        6            | "VI"
        7            | "VII"
        8            | "VII"
        9            | "IX"
        10           | "X"
    }
}
