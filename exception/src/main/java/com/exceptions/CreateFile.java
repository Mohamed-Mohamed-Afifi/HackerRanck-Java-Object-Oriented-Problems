package com.exceptions;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void create(String path){
        try{
            File file=new File(path);
            if(file.createNewFile()){
                System.out.println("File Create Success"+" "+file.getName());
            }else{
                System.out.println("file is olready exist");
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }
}
