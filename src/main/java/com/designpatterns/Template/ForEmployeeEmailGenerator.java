package com.designpatterns.Template;

import java.util.Arrays;

public class ForEmployeeEmailGenerator extends EmailGenerator {

    @Override
    public void setToList() {
        to = Arrays.asList("employee1@interia.pl", "employee2@interia.pl");
    }

    @Override
    public void setTopic() {
        topic = "Email for employees ";
    }
}
