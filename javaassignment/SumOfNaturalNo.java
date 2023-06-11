// Write a program to calculate the sum of first 10 natural number
class SumOfNaturalNo{
    public static void main(String args[]){
        int total = 0;
        for(int count = 1; count <= 10; count++){
            total=total+count;
        }
            System.out.println("Sum is "+ total );
    }
}