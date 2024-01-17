class Add{
    int a,b;
    public Add(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void showAdd(){
        System.out.println(a+b); 
    }
    public static void main(String args[]){
        Add add = new Add(5,6);
        add.showAdd();
    }
}