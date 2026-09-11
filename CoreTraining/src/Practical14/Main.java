package Practical14;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Darshan");
        student.setAge(21);

        System.out.printf("Name of the student is: %s", student.getName());
        System.out.println();
        System.out.printf("Age of student is: %d", student.getAge());
    }
}
