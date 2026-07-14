package main;

import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {


        StudentService service = new StudentService();


        Student student1 = new Student(
        1,
        "Samridh",
        20,
        "Male",
        "CSE",
        2,
        "samridh@gmail.com",
        "9876543210",
        9.5
);


        service.addStudent(student1);


        service.displayStudents();


    }

}
