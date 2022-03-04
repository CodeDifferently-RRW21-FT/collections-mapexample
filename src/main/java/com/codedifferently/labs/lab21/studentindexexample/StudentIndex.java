package com.codedifferently.labs.lab21.studentindexexample;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class StudentIndex {
    private Map<String, ArrayList<Student>> studentIndex;

    public StudentIndex(){
        this.studentIndex = new TreeMap<>();
    }

    public ArrayList<Student> getAllStudentsWithLastName(String lastName){
        return studentIndex.get(lastName);
    }

    public void addStudentToIndex(Student student){
        String lastNameIndex = student.getLastName();
        if(studentIndex.containsKey(lastNameIndex)){
            ArrayList<Student> currentStudents = studentIndex.get(lastNameIndex);
            currentStudents.add(student);
        }else {
            ArrayList<Student> firstEntry = new ArrayList<>();
            firstEntry.add(student);
            studentIndex.put(lastNameIndex, firstEntry);
        }
    }
}
