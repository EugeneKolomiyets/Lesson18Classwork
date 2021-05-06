package com.alevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class JsonCreator {
    public static final String DELIMITER = "=";
    public static void main(String[] args) {
        JsonCreator jsonCreator = new JsonCreator();
        Map<String,String>pairs = jsonCreator.readFromConsole();
        System.out.println(pairsgf);
    }
    public Map<String,String> readFromConsole(){
        Scanner scanner = new Scanner(System.in);
        Map<String ,String > pairs = new HashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("end")){
            String[]pair = line.split("=");//abc=qwe("abc","qwe")
        }
    }
}

