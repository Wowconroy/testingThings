package KZ.MVC.mvc1;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute();
    }
}
class Student {
    private String name = "Oleksii";
    private int age = 22;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

interface ModelLayer{
    Student getStudent();
}

class DBLayer implements ModelLayer{

    @Override
    public Student getStudent() {
        return new Student();
    }
}
interface View {
    void showStudent(Student student);
}
class ConsoleView implements View {

    @Override
    public void showStudent(Student student) {
        System.out.println("Student name -> " + student.getName() + ". Age -> " + student.getAge());
    }
}

class Controller{
    ModelLayer modelLayer = new DBLayer();
    View view = new ConsoleView();
    void execute(){
        Student student = modelLayer.getStudent();
        view.showStudent(student);
    }
}
