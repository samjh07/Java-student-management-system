package model;

public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int semester;
    private String email;
    private String phoneNumber;
    private double cgpa;

    public Student() {

}   

    public Student(int id, String name, int age, String gender, String department, int semester, String email,
            String phoneNumber, double cgpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.semester = semester;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getSemester() {
        return semester;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override //replacing the toString() method that already exists in the Object class.
    public String toString() {
    return "Student [id=" + id +
            ", name=" + name +
            ", age=" + age +
            ", gender=" + gender +
            ", department=" + department +
            ", semester=" + semester +
            ", email=" + email +
            ", phoneNumber=" + phoneNumber +
            ", cgpa=" + cgpa + "]";
        }
    

}
