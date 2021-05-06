package com.alevel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File dir = new File("src/main/resources");
        System.out.println("isDirectory " + dir.isDirectory());
        System.out.println("isFile " + dir.isDirectory());
        System.out.println("Absolute path " +dir.getAbsolutePath());
        File testFile = new File(dir,"test");
        Boolean isCreated=false;
        try {
            isCreated = testFile.createNewFile();
        } catch (IOException e) {
            System.out.println("File can not be created!!!");
        } finally {
            System.out.println("Is file created " + isCreated);
        }
        //FileExample
    }
    public void listFiles(){
        File currentDir = new File("/");
        if (currentDir.isDirectory()){

        }
    }
}
