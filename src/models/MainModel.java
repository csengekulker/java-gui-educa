package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    Group[] groupArray = {
        new Group(1, "11a"),
        new Group(2, "9a"),
        new Group(3, "10a"),
        new Group(4, "9b"),
        new Group(5, "10b"),
    };

    //convert array to vector
    public Vector<Group> groupList = new Vector<>(Arrays.asList(groupArray));

    Student[] studentArray = {
        new Student(1, "Pala Sándor", 1),
        new Student(2, "Alga Irén", 1),
        new Student(3, "Rota Valér", 1),
        new Student(4, "Siku Ferenc", 1),
        new Student(5, "Hari Béla", 2),
        new Student(6, "Közle Mihály", 2),
        new Student(7, "Csont Emőke", 2),
        new Student(8, "Ete Levente", 3),
        new Student(9, "Erős István", 3),
    };

    // convert array to vector
    public Vector<Student> studentList = new Vector<>(Arrays.asList(studentArray));
}
