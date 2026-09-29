public class Student {

    private String realName;
    private int OSIS_NUMBER;
    private int currentAge;
    private double gradePointAverage;

    public Student(String name, int osis, int age, double gpa){
        realName =  name;
        OSIS_NUMBER = osis;
        currentAge = age;
        gradePointAverage = gpa;
    }

    public void printTranscript(){
        System.out.println("Student's name is " + realName);
        System.out.println("OSIS number is " + OSIS_NUMBER);
        System.out.println("Current age is " + currentAge);
        System.out.println("GPA: " + gradePointAverage);
    }
}
