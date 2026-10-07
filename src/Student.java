public class Student {

    /* Instance Variables */
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;
    private double topScore;

    /* Constructor; see Note 1 below */
    Student(String fName, String lName, int gYear){
        firstName = fName;
        lastName = lName;
        gradYear = gYear;
    }

    /* Getter Methods */
// Returns firstName
    public String getFirstName(){
        return(firstName);
    }

    // Returns lastName
    public String getLastName(){
        return(lastName);
    }

    // Returns gradYear
    public int getGradYear(){
        return(gradYear);
    }

    /* Setter Methods */
// Sets firstName to a new value
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // Sets lastName to a new value
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // Sets gradYear to a new value
    public void setGradYear(int gradYear){
        this.gradYear = gradYear;
    }

    // Sets topScore to highest addTestScore instance value
    public void setTopTestScore(int score){
        if (score > topScore){
            topScore = score;
        }
    }

    public void setTopTestScore(double score){
        if (score > topScore){
            topScore = score;
        }
    }

    /* All Other Methods */
// Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
    public void addTestScore(double score){
        accumulatedTestScores = accumulatedTestScores + score;
        testScoreCount++;
        setTopTestScore(score);
    }

    // Returns true if the student’s average test score is greater
// than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing(){
        if (averageTestScore() >= 65){
            return (true);
        }
        else{
            return(false);
        }
    }

    // Returns the Student’s average test score as the quotient
// of accumulatedTestScores and testScoreCount (see Note 3 below)
    public double averageTestScore(){
        return (accumulatedTestScores/testScoreCount);
    }

    // this method prints the students full name, grad year, number of tests,
// test average, and whether they are passing (see Note 4 below)
    public void printStudentInfo(){
        System.out.println("Student: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of Tests: " + testScoreCount);
        System.out.println("Test Average: " + averageTestScore());
        System.out.println("Highest Test Score: " + topScore);
        System.out.println("Passing: " + isPassing());
    }

}
