class TryCatchArray{
    public static void main(String args[]){
        try{
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        }catch(ArrayIndexOutOfBoundsException io){
            System.out.println(io.getMessage());
        }
    }
}