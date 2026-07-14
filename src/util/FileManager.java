package util;

import model.Student;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_NAME = "students.txt";


    // SAVE STUDENTS TO FILE
    public static void saveStudents(ArrayList<Student> students) {

        try (FileWriter writer = new FileWriter(FILE_NAME)) {

            for (Student student : students) {

                writer.write(student.toString());
                writer.write("\n");

            }

            System.out.println("Students saved successfully");

        } catch (IOException e) {

            System.out.println("Error while saving students");
            e.printStackTrace();

        }
    }



    // LOAD STUDENTS FROM FILE
    public static ArrayList<Student> loadStudents() {

        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

            }

        } catch (FileNotFoundException e) {

            System.out.println("No previous student data found");

        } catch (IOException e) {

            System.out.println("Error while loading students");
            e.printStackTrace();

        }

        return students;
    }
}
