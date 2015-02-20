import spock.lang.Specification
import spock.lang.Unroll

class RomanNumeralsConverterSpecs extends Specification {

    RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter()

    @Unroll()
    def "should convert some basics numbers: arabic number #arabicNumber to roman equivalent #romanNumber"() {

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
        40           | "XL"
        50           | "L"
        90           | "XC"
        100          | "C"
        400          | "CD"
        500          | "D"
        900          | "CM"
        1000         | "M"
    }

    @Unroll()
    def "should convert numbers from eleven to forty: arabic number #arabicNumber to roman equivalent #romanNumber"() {

        expect:
        romanNumeralsConverter.arabicToRoman(arabicNumber) == romanNumber

        where:
        arabicNumber | romanNumber
        11           | "XI"
        12           | "XII"
        15           | "XV"
        18           | "XVIII"
        19           | "XIX"
        20           | "XX"
        21           | "XXI"
        22           | "XXII"
        25           | "XXV"
        27           | "XXVII"
        29           | "XXIX"
        30           | "XXX"
        32           | "XXXII"
        34           | "XXXIV"
        36           | "XXXVI"
        39           | "XXXIX"
    }

    @Unroll()
    def "should convert numbers of tens and hundreds: arabic number #arabicNumber to roman equivalent #romanNumber"() {

        expect:
        romanNumeralsConverter.arabicToRoman(arabicNumber) == romanNumber

        where:
        arabicNumber | romanNumber
        60           | "LX"
        70           | "LXX"
        80           | "LXXX"
        101          | "CI"
        150          | "CL"
        200          | "CC"
        300          | "CCC"
        600          | "DC"
        700          | "DCC"
        800          | "DCCC"
        1600         | "MDC"
        1700         | "MDCC"
        1900         | "MCM"
    }

}
