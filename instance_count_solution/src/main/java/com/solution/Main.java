package com.solution;
import java.util.*;
class Student{}
class Rockstar{}
class Hacker{}
public class Main {
    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<Object>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
           String s=sc.next();
           if(s.equals("Student"))mylist.add(new Student());
           if(s.equals("Rockstar"))mylist.add(new Rockstar());
           if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(InstanceOFTutorial.count(mylist));
        sc.close();
    }
}