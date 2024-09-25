package com.company;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class cwh_111_FileHandling {
    public static void main(String[] args){
        // Code to create a New File
//        File myfile=new File("cwh111FileHandling.txt");
//        try {
//            myfile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }
        // Code to Write a new File
//        try {
//            FileWriter fileWriter=new FileWriter("cwh111FileHandling.txt");
//            fileWriter.write("This is the first java file on which we write\n ok now bye");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // Reading a file
//        File myfile=new File("cwh111FileHandling.txt");
//        try {
//            Scanner sc=new Scanner(myfile);
//            while(sc.hasNextLine())
//            {
//                String line=sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        // Deleting a File

        File myfile=new File("cwh111FileHandling.txt");
        if(myfile.delete())
        {
            System.out.println("I have deleted"+"  :  "+myfile.getName());

        }
        else
        {
            System.out.println("Some error occured");
        }

    }
}
