package com.example;

public enum DayOfWeaks {
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wensday(4),
    Thursday(5),
    Friday(6);
    final int dayNum;
    DayOfWeaks(int dayNum){
        this.dayNum=dayNum;
    }
}
