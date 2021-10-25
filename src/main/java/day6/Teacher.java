package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String discipline;

    public Teacher(String name, String discipline) {
        this.name = name;
        this.discipline = discipline;
    }

    public void evaluate(Student student) {
        Random rand = new Random();
        int grade = rand.nextInt(4) + 2;
        String[] grades = {"неудовлетворительно", "удовлетворительно", "хорошо", "отлично"};
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + discipline + " на оценку " + grades[(grade - 2)] + ".");
    }
}
