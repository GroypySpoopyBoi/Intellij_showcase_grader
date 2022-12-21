import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void determineGrade1 ( ) {
        var grade = new Grader ( );
        assertEquals ( "F", grade.determineGrade ( 59 ) );
    }

    @Test
    void determineGrade2 ( ) {
        var grade = new Grader ( );
        assertEquals ( "D", grade.determineGrade ( 69 ) );
    }

    @Test
    void determineGrade3 ( ) {
        var grade = new Grader ( );
        assertEquals ( "C", grade.determineGrade ( 79 ) );
    }

    @Test
    void determineGrade4 ( ) {
        var grade = new Grader ( );
        assertEquals ( "B", grade.determineGrade ( 89 ) );
    }

    @Test
    void determineGrade5 ( ) {
        var grade = new Grader ( );
        assertEquals ( "A", grade.determineGrade ( 99 ) );
    }

    @Test
    void determineGrade6 ( ) {
        var grade = new Grader ( );
        assertEquals ( "D", grade.determineGrade ( 60 ) );
    }

    @Test
    void determineGrade7 ( ) {
        var grade = new Grader ( );
        assertEquals ( "C", grade.determineGrade ( 70 ) );
    }

    @Test
    void determineGrade8 ( ) {
        var grade = new Grader ( );
        assertEquals ( "B", grade.determineGrade ( 80 ) );
    }

    @Test
    void determineGrade9 ( ) {
        var grade = new Grader ( );
        assertEquals ( "A", grade.determineGrade ( 90 ) );
    }

    @Test
    void determineGrade10 ( ) {
        var grade = new Grader ( );
        assertEquals ( "CHEATER", grade.determineGrade ( 148 ) );
    }

    @Test
    void determineGrade11 ( ) {
        var grade = new Grader ( );
        assertThrows ( IllegalArgumentException.class, ( ) -> grade.determineGrade ( - 1007 ) );
    }
    @Test
    void determineGrade12 ( ) {
        var grade = new Grader ( );
        assertEquals ( "F", grade.determineGrade ( 0 ) );
    }

}