package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Горбунов Андрей Владимирович");
        student.setGroup("Программисты-акробаты");
        student.setDateOfAdmission("04.12.2019");

        System.out.println(student.getFio() + " " + student.getGroup() + " " + student.getDateOfAdmission());
    }
}
