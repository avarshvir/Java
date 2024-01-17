import java.io.*;
class DeletingFile{
    public static void main(String args[]){
        File fd = new File("FirstFile.txt");
        fd.delete();
    }
}