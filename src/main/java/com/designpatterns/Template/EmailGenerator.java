package com.designpatterns.Template;

import java.util.Collections;
import java.util.List;

public abstract class EmailGenerator {

    List<String> to;

    List<String> cc;

    String topic;

    public abstract void setToList();

    public abstract void setTopic();

    public final void sendEmail(){
        setToList();
        setCCList();
        setTopic();
        printEmail();
    }

    private void printEmail(){ // template to wysłania
        System.out.println("Email Topic : "+topic);
        System.out.print("Email To : ");
        to.forEach(System.out::print);
        System.out.println();
        System.out.print("Email CC :");
        cc.forEach(System.out::print);
        System.out.println();
        System.out.println("This is Email content :");
        System.out.println(topic);
    }

    public void setCCList(){
        cc = Collections.emptyList();
    }
}
