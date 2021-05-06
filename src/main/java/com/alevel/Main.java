package com.alevel;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main ioExample = new Main();
        String text = ioExample.readFromFile("src/main/resources/input.txt");
        System.out.println("Text from input.txt "+text);
        String outputText = text.toUpperCase();
        System.out.println("Tet into output.txt "+outputText);
    }
    public String readFromFile(String fileName){
        StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream inputStream = new FileInputStream(fileName)){
            int i;
            while ((i = inputStream.read()) != -1){
                String s = String.valueOf((char) i);
                //System.out.println(s);
                stringBuilder.append(s);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }

    public void  writeToFile(){

    }
}
