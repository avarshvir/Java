package abstraction2;
class SalesPerson extends Employee{
    private float baseSalary;
    private float bonus;
    private long noOfSales;
    public SalesPerson(String name, int id, float baseSalary, float bonus, long noOfSales){
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.noOfSales = noOfSales;
    }
    float calculateSalary(){
        return baseSalary+bonus;
    }
    
}