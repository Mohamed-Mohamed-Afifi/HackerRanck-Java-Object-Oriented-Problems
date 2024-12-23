package com.exceptions;

import java.io.File;
public class DeleteFile {
    public static void delete(String path){
        try{
            File file=new File(path);
            if(file.delete()){
                System.out.println("File Create Success"+" "+file.getName());
            }else{
                System.out.println("file is olready exist");
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
}
