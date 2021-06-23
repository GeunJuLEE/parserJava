package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        String dirName = "C:\\Users\\user\\Documents\\카카오톡 받은 파일\\rawdata\\bjh"; //directory path

        File dir = new File(dirName);
        String user = "";
        try {
            String[] dirNameSplit = dirName.split("\\\\");
            user = dirNameSplit[dirNameSplit.length - 1];       //get user name (the last directory name)
            System.out.println("user : " + user);
        } catch (Exception e) {
            System.out.println("not found user");
        }

        for (File filePath : dir.listFiles()) {         //get files in dir
            System.out.println("filePath : " + filePath);
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    MobilityData mobilityData = new MobilityData(user, line);
                    //data upload
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }

    }

}
