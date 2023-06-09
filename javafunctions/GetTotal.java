class GetTotal{
    public int getTotal(int argument1, int argument2){
        int sum = argument1 + argument2;
        return sum;
    }
    public static void main(String args[]){
        GetTotal gettotal = new GetTotal();
        int a1=5;
        int a2=7;
        int s1 = a1 + a2;
        gettotal.getTotal(a1,a2);
        System.out.println("The sum is " +s1);

    }
}