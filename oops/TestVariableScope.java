class TestVariableScope{
    int a = 0;                   //instance variable not share every object in class instance is created when object create
    static int b = 0;            //static variable share every object in class
    public void increment(){
        a++;
        b++;
        System.out.println("a = "+ a +" b = "+b);
    }
    public static void main(String args[]){
        TestVariableScope tvs = new TestVariableScope();
        tvs.increment();
        TestVariableScope tvs2 = new TestVariableScope();
        tvs2.increment();
    }
}