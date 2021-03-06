package com.company.repositories.interfaces;

import com.company.entities.Groups;
import com.company.entities.Students;

import java.util.ArrayList;

public interface IRepository {

    boolean addStudent(Students student);
    Students getStudentByHighestScore();
    boolean changeEmailById(int id, String email, String table);
    ArrayList<Groups> showAllGroup();
}
