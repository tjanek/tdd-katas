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

    def "Seconds lamp should blink yellow on/off every two seconds"() {
        expect:
        berlinClock.seconds(second) == lamp

        where:
        second | lamp
        0      | "Y"
        1      | "O"
        59     | "O"
    }

    def "Top hours should light a red lamp for every 5 hours"() {
        expect:
        berlinClock.topHours(hour) == lamp

        where:
        hour  | lamp
        0     | "OOOO"
        13    | "RROO"
        23    | "RRRR"
        24    | "RRRR"
    }

    def "Bottom hours should light a red lamp for every hour left from top hours"() {
        expect:
        berlinClock.bottomHours(hour) == lamp

        where:
        hour  | lamp
        0     | "OOOO"
        13    | "RRRO"
        23    | "RRRO"
        24    | "RRRR"
    }

    def "Top minutes should light a yellow lamp for every 5 minutes unless it's first quarter, half or last quarter"() {
        expect:
        berlinClock.topMinutes(minute) == lamp

        where:
        minute | lamp
        0      | "OOOOOOOOOOO"
        17     | "YYROOOOOOOO"
        59     | "YYRYYRYYRYY"
    }

    def "Top minutes should have 3rd, 6th and 9th lamps in red to indicate first quarter, half and last quarter"() {
        expect:
        berlinClock.topMinutes(32).substring(quarter, quarter + 1) == lamp

        where:
        quarter | lamp
        2       | "R"
        5       | "R"
        8       | "O"
    }

}
