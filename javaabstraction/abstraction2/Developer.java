package abstraction2;
class Developer extends Employee{
    private float baseSalary;
    private float bonus;
    public Developer(String name, int id, float baseSalary, float bonus ){
        super(name,id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    float calculateSalary(){
        return baseSalary+bonus;
    }
}