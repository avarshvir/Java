import java.io.*;
import java.util.Scanner;
class ReadFromFile{
    public static void main(String args[]){
        try{
            FileReader fr = new FileReader("FirstFile.txt");
            Scanner sc = new Scanner(fr);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        }catch(IOException io){
            System.out.println("error");
            io.printStackTrace();
        }
    }
}