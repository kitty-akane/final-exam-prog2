package com.finalexam;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Student {
        private int id;
        private String firstName;
        private String lastName;
        private Date enrollmentDate;
        private Group group;
}
