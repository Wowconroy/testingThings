package KZ.MVC.mvc2;

public class StudentController {
    private Student model;
    private View view;

    public StudentController(Student student, View view) {
        this.model = student;
        this.view = view;
    }

    public void setStudentName (String name){
        model.setName(name);
    }

    public String getStudentName (){return model.getName();}

    public void setStudentLesson (String lesson){
        model.setLesson(lesson);
    }

    public String getStudentLesson (){return model.getLesson();}

    public void updateStudentInfo(){
        view.showStudent(model.getName(), model.getLesson());
    }

}
