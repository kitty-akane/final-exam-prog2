package com.finalexam;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Group {
        private int id;
        private String name;
        private List<Student> students;
}
