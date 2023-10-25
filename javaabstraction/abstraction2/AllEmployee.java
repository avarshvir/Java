package abstraction2;
class AllEmployee{
    public static void main(String args[]){
        Manager manager = new Manager("rohan",1001,10000,500);
        Developer developer = new Developer("mohan",2002,200000,1000);
        SalesPerson sp = new SalesPerson("vikas",3003,30000,2000,400);
        System.out.println("Salary of Manager is : "+ manager.calculateSalary());
        System.out.println("Name of Manager is : "+ manager.getName());
        
        System.out.println("Salary of Developer is : "+ developer.calculateSalary());
        System.out.println("Id of Developer is : "+ developer.getId());
        
        System.out.println("Salary of SalesPerson is : "+ sp.calculateSalary());

        Employee e = new Manager("joven",4004,2000,40);
        System.out.println("Salary of Employee is : "+ e.calculateSalary());
        System.out.println("Name of Employee is : "+ e.getName());
         
    }
}