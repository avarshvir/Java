class Employee extends Person{
    int id;
    public void getEmployeeId(int id){
        this.id = id;
        System.out.println("ID : "+id);
    }
    public static void main(String args[]){
        Employee employee = new Employee();
        employee.getFirstName("john");
        employee.getLastName("cena");
        employee.getEmployeeId(777);

    }


}