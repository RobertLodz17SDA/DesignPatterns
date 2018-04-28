package com.designpatterns.Lombo;

public class ProjectApp {
    public static void main(String[] args) {
        Project project = Project.builder().company("Company").name("projectName").build();
    }
}
