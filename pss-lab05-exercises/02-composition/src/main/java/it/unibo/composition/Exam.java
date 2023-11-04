package it.unibo.composition;

public class Exam {
    
    private final int id;
    private final int maxStudents;
    private final int registeredStudents;
    private final String courseName;
    private final Professor professor;
    private final ExamRoom room;
    private final Student[] students;

    public Exam (final int id, final int maxStudents, final int registeredStudents, final String courseName, final Professor professor, final ExamRoom room, final Student[] students) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.registeredStudents = registeredStudents;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = students;
    }

    public int getID() {

        return this.id;
    }

    public int getMaxStudents() {
        
        return this.maxStudents;
    }

    public int getRegisteredStudents() {
        
        return this.registeredStudents;
    }

    public String getCourseName() {

        return this.courseName;
    }

    public Professor getProfessor() {
        
        return this.professor;
    }

    public ExamRoom getRoom() {
        
        return this.room;
    }

    public Student[] getAllStudent() {
        
        return this.students;
    }

    public String toString() {
        
        return "Exam ["
        + "Course Name=" + this.courseName
        + ", Number Registered Students" + this.registeredStudents
        + ", Professor" + this.professor
        + ", Room" + this.room
        + ", Students" + this.students
        + "]";
    }

    public String getDescription() {
        
        return this.toString();
    }

    public void registeredStudent(Student student){

        this.students  + student;
    }
}
