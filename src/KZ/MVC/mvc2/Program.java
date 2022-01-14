package KZ.MVC.mvc2;

public class Program {
    public static void main(String[] args) {
        Student model = retriveStudentFromDB();
        View view = new View();
        StudentController sc = new StudentController(model, view);
        sc.updateStudentInfo();
        sc.setStudentName("Fabricio Kruasan");
        sc.updateStudentInfo();
    }
    private static Student retriveStudentFromDB(){
        Student student = new Student();
        student.setName("Antonio Balacucci");
        student.setLesson("Thirty One");
        return student;
    }
}
