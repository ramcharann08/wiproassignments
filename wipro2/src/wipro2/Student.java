package wipro2;

public class Student {
    // Static variable to keep track of the last assigned roll number
    private static int lastRollNo = 0;

    private int rollNo;
    private String studName;
    private int marksInEng;
    private int marksInMaths;
    private int marksInScience;

    // Constructor to create a new student, rollNo is auto-generated
    public Student(String studName, int marksInEng, int marksInMaths, int marksInScience) {
        this.rollNo = ++lastRollNo;  // Auto-increment roll number
        this.studName = studName;
        this.marksInEng = marksInEng;
        this.marksInMaths = marksInMaths;
        this.marksInScience = marksInScience;
    }

    // Getter for rollNo (no setter to keep it read-only)
    public int getRollNo() {
        return rollNo;
    }

    // Getters and setters for other fields
    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getMarksInEng() {
        return marksInEng;
    }

    public void setMarksInEng(int marksInEng) {
        this.marksInEng = marksInEng;
    }

    public int getMarksInMaths() {
        return marksInMaths;
    }

    public void setMarksInMaths(int marksInMaths) {
        this.marksInMaths = marksInMaths;
    }

    public int getMarksInScience() {
        return marksInScience;
    }

    public void setMarksInScience(int marksInScience) {
        this.marksInScience = marksInScience;
    }
}