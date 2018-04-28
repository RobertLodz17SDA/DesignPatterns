package com.designpatterns.Template;

import java.util.ArrayList;
import java.util.Arrays;

public class FormanagersEmailGenerator extends EmailGenerator {

    @Override
    public void setToList() {
        to = Arrays.asList("managers@interia.pl", "adam.ceo@onet.eu");
    }

    @Override
    public void setTopic() {

        topic = "Email for managers";
    }
}
