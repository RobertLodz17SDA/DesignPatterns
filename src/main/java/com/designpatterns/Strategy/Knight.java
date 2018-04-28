package com.designpatterns.Strategy;

public class Knight {

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    private Quest quest;

    public Knight(Quest quest){
        this.quest = quest;
    }

    public void play(){
        quest.perform();
    }
}
