package initialize;

import modules.Student;

public class Initialize {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
