public class StudentController {
    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    public void setStudentName(String name) {
        student.setName(name);
    }

    public void setStudentRollNo(int rollNo) {
        student.setRollNo(rollNo);
    }

    public void setStudentGrade(String grade) {
        student.setGrade(grade);
    }

    public void updateView() {
        view.printStudentDetails(student.getName(), student.getRollNo(), student.getGrade());
    }
}