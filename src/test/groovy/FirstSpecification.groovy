import spock.lang.Specification

class FirstSpecification extends Specification {

    def "maximum of two numbers"() {
        expect:
        Math.max(a, b) == c

        where:
        a | b || c
        3 | 5 || 5
        7 | 0 || 7
        0 | 0 || 0
    }

    def "two plus two should equal four"() {
        given: "hej hej"
        int left = 2
        int right = 2

        when:
        int result = left + right

        then:
        result == 4
    }
}
