package abstraction2;
class Manager extends Employee{
    private float baseSalary;
    private float bonus;
    public Manager(String name, int id, float baseSalary, float bonus){
        super(name,id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override
    public float calculateSalary(){
        return baseSalary + bonus;
    }
}