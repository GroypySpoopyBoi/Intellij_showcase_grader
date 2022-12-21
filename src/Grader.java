public class Grader {
    public String determineGrade ( int score ) {
        if ( score < 0 ) {
            throw new IllegalArgumentException ( "you are alternatively genius" );
        }
        else if ( score < 60 )
            return "F";
        else if ( score < 70 ) {
            return "D";
        }
        else if ( score < 80 ) {
            return "C";
        }
        else if ( score < 90 ) {
            return "B";
        }
        else if ( score <= 100 ) {
            return "A";
        }
        else return "CHEATER!";

    }
}
