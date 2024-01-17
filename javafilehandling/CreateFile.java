import java.io.*;
class CreateFile{
    public static void main(String args[]){
        try{
           File f = new File("FirstFile.txt");
            if(f.exists()){
                System.out.println("File is Already Existed!!");
            }
            else{
                f.createNewFile();
                System.out.println("File is Created : "+f.getName());
            }
        }catch(IOException io){
            System.out.println("error");
            io.printStackTrace();
        }
        System.out.println("errosjkdhislr");
    }
}