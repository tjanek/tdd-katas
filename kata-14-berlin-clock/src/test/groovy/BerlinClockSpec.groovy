import spock.lang.Specification

class BerlinClockSpec extends Specification {

    BerlinClock berlinClock = new BerlinClock()

    def "Seconds should have one lamp"() {
        expect:
        berlinClock.seconds(1).length == 1
    }

    def "Top hours should have 4 lamps"() {
        expect:
        berlinClock.topHours(7).length == 4
    }

    def "Bottom hours should have 4 lamps"() {
        expect:
        berlinClock.bottomHours(5).length == 4
    }

    def "Top minutes should have 11 lamps"() {
        expect:
        berlinClock.topMinutes(34).length == 11
    }

    def "Bottom minutes should have 4 lamps"() {
        expect:
        berlinClock.bottomMinutes(17).length == 4
    }

    def "Berlin time should contains result as array of 5 elements"() {
        expect:
        berlinClock.toBerlinTime("13:09:02").length == 5
    }
}
