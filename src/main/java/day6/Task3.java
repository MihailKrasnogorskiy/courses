package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Марьиванна", "математика");
        Student student = new Student("Вовочка");
        teacher.evaluate(student);
    }
}
