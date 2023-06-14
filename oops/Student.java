// constructor
class Student{
    String studentName;
    Student(){
        System.out.println("Unknown");
    }
    Student(String sN){
        //instance = local
        studentName = sN;
        System.out.println("Student name : "+ studentName);
    }
    public static void main(String args[]){
        System.out.println("---------------------------------------------------------");
        System.out.println("When no value passed in constructor :");
        Student student = new Student();
        
        System.out.println("---------------------------------------------------------");
        System.out.println("When String value passed in constructor :");
        Student student1 = new Student("Arshvir");

    }
}