class CSE extends Electronics{
    public CSE(){
        super();
        System.out.println("Default constructor of CSE");
    }
    public CSE(int c, int d){
        super(c,d);
        System.out.println("Parameterized constructor of CSE"+ c + " "+d);
    }
    public static void main(String args[]){
        CSE cse = new CSE();
        CSE cse2 = new CSE(1,2);
    }
}