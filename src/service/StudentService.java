package service;
import exception.StudentNotFoundException;
import model.Student;
import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();


    // ADD STUDENT
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added successfully");
    } 


    // DISPLAY ALL STUDENTS
    public void displayStudents(){

        if(students.isEmpty()){
            System.out.println("No students found");
            return;
        }

        for(Student student : students){
            System.out.println(student);
        }
    }


    // SEARCH STUDENT BY ID
public Student searchStudentById(int id) throws StudentNotFoundException {

    for(Student student : students){

        if(student.getId() == id){
            return student;
        }
    }

    throw new StudentNotFoundException(
            "Student with ID " + id + " not found"
    );
}


// DELETE STUDENT BY ID
public boolean deleteStudentById(int id) throws StudentNotFoundException {

    Student student = searchStudentById(id);

    students.remove(student);

    System.out.println("Student deleted successfully");
    return true;
}


// UPDATE STUDENT
public boolean updateStudent(int id, String name, int age, String email) 
        throws StudentNotFoundException {

    Student student = searchStudentById(id);

    student.setName(name);
    student.setAge(age);
    student.setEmail(email);

    System.out.println("Student updated successfully");
    return true;
}
}
