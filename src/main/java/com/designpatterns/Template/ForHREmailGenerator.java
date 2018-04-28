package com.designpatterns.Template;

import java.util.Arrays;

public class ForHREmailGenerator extends EmailGenerator{

    @Override
    public void setToList() {
        to = Arrays.asList("hr@gmail.com");
    }

    @Override
    public void setTopic() {

        topic = "Email for HR";
    }

    @Override
    public void setCCList(){
        cc = Arrays.asList("ccHR@gmail.com");
    }
}
