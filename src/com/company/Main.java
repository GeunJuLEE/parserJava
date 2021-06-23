package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        String dirName = "C:\\Users\\user\\Documents\\카카오톡 받은 파일\\rawdata\\bjh";

        File dir = new File(dirName);

        try {
            String[] dirNameSplit = dirName.split("\\\\");
            System.out.println("user : " + dirNameSplit[dirNameSplit.length - 1]);
        } catch (Exception e) {
            System.out.println("not found user");
        }

        for (File filePath : dir.listFiles()) {
            System.out.println("filePath : " + filePath);
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    for(String a : line.split(" ")){
                        System.out.println("a : " + a);
                    }
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }

    }




}
