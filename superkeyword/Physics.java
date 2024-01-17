class Physics extends Mathematics{
    public void phys(){
        super.maths();
    }
    public int phys(int a, int b){
        super.maths(a,b);
        
        return 1;
    }
    public static void main(String args[]){
        Physics ph = new Physics();
        ph.phys();
        ph.phys(1,2);
    }

}