class Electronics{
    public Electronics(){
        System.out.println("This is default constructor of Electroics");
    }
    int a,b;
    public Electronics(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("This is Parameterized constructor of Electronics "+ a +" "+ b);
    }
}