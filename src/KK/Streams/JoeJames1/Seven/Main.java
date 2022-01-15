package KK.Streams.JoeJames1.Seven;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
//        String listString = list.stream().collect(Collectors.joining("*", "[", "]"));
        list.add(new Student(1, "John", "Scott", 33));
        list.add(new Student(2, "Mary", "Li", 22));
        list.add(new Student(3, "Oleksii", "Shostak", 29));
        list.add(new Student(4, "Chris", "Lazy", 31));

        IntSummaryStatistics intSummaryStatistics = list.stream()
                .collect(Collectors.summarizingInt(Student::getAge));


    }
}

class Student{
    private int id;
    private String firstName;
    private String secondName;
    private int age;

    public Student(int id, String firstName, String secondName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
