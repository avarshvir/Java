class QuantumMechanics extends CSE{
    public QuantumMechanics(){
        super();
        System.out.println("This is default constructor of QM");
    }
    public QuantumMechanics(int e, int f){
        super(e,f);
        System.out.println("Parameterized Constructor of QM "+ e + " " + f);
    }
    public static void main(String ... args){
        QuantumMechanics qm = new QuantumMechanics();
        QuantumMechanics qm2 = new QuantumMechanics(2,3);
        
    }
}