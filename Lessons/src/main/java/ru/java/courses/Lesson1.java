package ru.java.courses;

public class Lesson1 {

    public static void main(String[] args) {
        System.out.println("Hello, Zurab!");
        int a = Lesson2.formula(100);
        System.out.println("Формула от 100 = " + a);
        String b = Lesson2.initials("иванов петр александрович");
        System.out.println(b);
        String c1 = Lesson3_Operators.task1(5, "положит");
        System.out.println (c1);
        String c2 = Lesson3_Operators.task1(0, "ноль");
        System.out.println (c2);
        String c3 = Lesson3_Operators.task1(-5, "отрицательное");
        System.out.println (c3);
        boolean d1 = Lesson3_Operators.task2(101);
        System.out.println("Число больше 100 " + d1);
        boolean d2 = Lesson3_Operators.task2(99);
        System.out.println("Число меньше 100 " + d2);
        boolean d3 = Lesson3_Operators.task2(31);
        System.out.println("Число больше 30 " + d3);
        boolean d4 = Lesson3_Operators.task2(29);
        System.out.println("Число меньше 30 " + d4);
    }
}
