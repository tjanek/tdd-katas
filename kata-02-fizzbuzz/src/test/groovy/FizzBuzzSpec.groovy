import spock.lang.Specification

class FizzBuzzSpec extends Specification {

    FizzBuzz fizzBuzz = new FizzBuzz()

    def "should return fizz for number dividable by 3"() {

        expect:
        fizzBuzz.print(number) == "fizz"

        where: number << [3,6,9,12,18,21,24,27,33,36,39,42,48,51,54,57,63,66,69,72,78,81,84,87,93,96,99]
    }

    def "should return buzz for number dividable by 5"() {

        expect:
        fizzBuzz.print(number) == "buzz"

        where: number << [5,10,20,25,35,40,50,55,65,70,80,85,95,100]
    }

    def "should return buzz for number dividable by 3 and 5"() {

        expect:
        fizzBuzz.print(number) == "fizzbuzz"

        where: number << [15,30,45,60,75,90]
    }

    def "should return number that isn't dividable by 3 or 5"() {

        expect:
        fizzBuzz.print(number) == number.toString()

        where: number << [1,2,4,7,8,11,13,14,16]
    }
}