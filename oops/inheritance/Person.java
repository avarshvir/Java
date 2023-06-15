//Single Inheritance
class Person{
    String firstName;
    String lastName;

    public void getFirstName(String fName){
        firstName = fName;
        System.out.println("First name : "+firstName);
    }
    
    public void getLastName(String lName){
        lastName = lName;
        System.out.println("Last name : "+lastName);
    }
 

    public static void main(String args[]){
        Person person = new Person();
        person.getFirstName("arsh");
        person.getLastName("arshvir");
        
        
    }

    
}