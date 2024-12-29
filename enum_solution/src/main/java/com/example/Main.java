package com.example;

public class Main {
    public static void main(String[] args) {
        DayOfWeaks day=DayOfWeaks.Friday;
        switch (day) {
            case Sunday -> System.out.println("Sunday");
            case Monday -> System.out.println("Monday");
            case Friday -> System.out.println("Friday");
        }
    }
}