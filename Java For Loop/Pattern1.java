class Pattern1{
    public static void main(String args[]){
        for(int vertical_row = 0; vertical_row < 5; vertical_row++){
            for(int horizontal_column = 0; horizontal_column <= vertical_row; horizontal_column++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}