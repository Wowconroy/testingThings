package KK.Streams.JoeJames1.Seven;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
//        String listString = list.stream().collect(Collectors.joining("*", "[", "]"));
        list.add(new Student(1, "John", "Scott", 33));
        list.add(new Student(2, "Mary", "Li", 22));
        list.add(new Student(3, "Oleksii", "Shostak", 29));
        list.add(new Student(4, "Chris", "Lazy", 31));

//        IntSummaryStatistics intSummaryStatistics = list.stream()
//                .collect(Collectors.summarizingInt(Student::getAge));
//        Map<Integer, List<Student>> listMap = list.stream()
//                .collect(Collectors.groupingBy(Student::getId, Collectors.toList()));
//        listMap.forEach((k,v) -> System.out.println(k + " -> " + v));

//        Map<Boolean, List<Student>> partitionedStudents = list
//                .stream()
//                .collect(Collectors.partitioningBy(s-> s.getFirstName().toLowerCase().startsWith("m")));
//        Stream builder = Stream.builder().add("Awesome").add("Reason").build();
//        builder.forEach(System.out::println);
        Random random = new Random();
        DoubleStream doubleStream = random.doubles(5);


    }
}

class Student {
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

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
