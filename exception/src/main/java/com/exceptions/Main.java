package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try{
            File myObj = new File("problems\\exception\\src\\main\\java\\com\\exceptions\\text.txt");
            ReadFile.read(myObj);
        }catch(FileNotFoundException ex){
            System.out.println("Massage of exeption is :"+" "+ex.getMessage());
            ex.printStackTrace();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}