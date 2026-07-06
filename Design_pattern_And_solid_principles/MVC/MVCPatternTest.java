public class MVCPatternTest {
    public static void main(String[] args) {
        Student student = new Student("Shreshti", 101, "A");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.println();

        controller.setStudentName("Shreshti Garg");
        controller.setStudentRollNo(102);
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}