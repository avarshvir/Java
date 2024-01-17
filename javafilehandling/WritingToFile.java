import java.io.*;
class WritingToFile{
    public static void main(String args[]){
        try{
            FileWriter fw = new FileWriter("FirstFile.txt");
            fw.write("I am Writing to a file");
            fw.close();
            System.out.println("Write Succesfully");
        }catch(IOException io){
            System.out.println("error");
            io.printStackTrace();
        }
    }
}