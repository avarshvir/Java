import java.io.*;
import java.nio.*;

import java.util.Scanner;
class FileOperations{
    public static void main(String args[]){
        int ch;
        Scanner sc = new Scanner(System.in);
        createDirectory("Hello");
        
        while(true){
            System.out.println("1> create");
            System.out.println("2> write");
            System.out.println("3> read");
            System.out.println("4> delete");
            ch = sc.nextInt();
            
            if(ch == 1){
            try{
                    File f = new File("SecondFile.txt");
                    if(f.exists()){
                        System.out.println("Already Existed");
                    }
                    else{
                        f.createNewFile();
                        System.out.println("file is created "+ f.getName());
                    }
                
            }catch(IOException io){
                System.out.println("error");
                io.printStackTrace();
            }
        }
        else if(ch == 2){
            try{
                FileWriter fw = new FileWriter("SecondFile.txt");
                fw.write("Hi, this is my second file");
                fw.close();
                System.out.println("Write Successfully");
            }catch(IOException io2){
                System.out.println("error");
                io2.printStackTrace();
            }
        }
        else if(ch == 3){
            try{
                FileReader fr = new FileReader("SecondFile.txt");
                Scanner sc2 = new Scanner(fr);
                while(sc2.hasNextLine()){
                    String data = sc2.nextLine();
                    System.out.println(data);
                }
            }catch(IOException io3){
                System.out.println("error");
                io3.printStackTrace();
            }
        }
        else if(ch == 4){
                File fd = new File("SecondFile.txt");
                 if (fd.delete()) {
                    System.out.println("File is deleted");
                } else {
                    System.out.println("Unable to delete the file");
                }
            
        }
        else{
            System.out.println("Exiting");
           // exit();
        }
        }
    }
}