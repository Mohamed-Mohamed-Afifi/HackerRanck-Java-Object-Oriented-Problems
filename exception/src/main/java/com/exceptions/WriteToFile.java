package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void write(String path) throws IOException{
        try(FileWriter writer=new FileWriter(path)){
            writer.append("Files in Java might be tricky, but it is fun enough!");
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
