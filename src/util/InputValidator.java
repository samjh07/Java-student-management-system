package util;

public class InputValidator {

    public static boolean isValidAge(int age){
        return age > 0 && age < 100;
    }


    public static boolean isValidCGPA(double cgpa){
        return cgpa >= 0 && cgpa <= 10;
    }


    public static boolean isValidEmail(String email){
        return email.contains("@") && email.contains(".");
    }


    public static boolean isValidPhone(String phone){
        return phone.length() == 10;
    }
}
