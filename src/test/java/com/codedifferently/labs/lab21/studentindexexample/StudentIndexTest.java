package com.codedifferently.labs.lab21.studentindexexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudentIndexTest {

    @Test
    public void addStudentToIndexTest(){
        StudentIndex studentIndex = new StudentIndex();
        Student student = new Student("Irlanda", "Manning");
        studentIndex.addStudentToIndex(student);
        Student[] expected = new Student[]{student};
        ArrayList<Student> output = studentIndex.getAllStudentsWithLastName("Manning");
        Student[] actual = new Student[output.size()];
        output.toArray(actual);
        Assertions.assertArrayEquals(expected, actual);

    }
}
