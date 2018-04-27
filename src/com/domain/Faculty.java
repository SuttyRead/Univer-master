package com.domain;

import java.util.Arrays;

/**
 * Created by student on 25.04.2018.
 */
public class Faculty {

    private String name;
    private Dean dean;
    private Lecturer[] lecturers;
    private Group[] groups;

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", dean=" + dean +
                ", lecturers=" + Arrays.toString(lecturers) +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
