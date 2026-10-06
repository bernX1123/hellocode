public class Student {

    /* Instance Variables */
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

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

    /* All Other Methods */
// Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
    public double addTestScore(double score){
        accumulatedTestScores = accumulatedTestScores + score;
        testScoreCount++;
    }

    // Returns true if the student’s average test score is greater
// than or equal to 65; returns false otherwise (see Note 2 below)
    isPassing()

    // Returns the Student’s average test score as the quotient
// of accumulatedTestScores and testScoreCount (see Note 3 below)
    averageTestScore()

    // this method prints the students full name, grad year, number of tests,
// test average, and whether they are passing (see Note 4 below)
    printStudentInfo()

}
