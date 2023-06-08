class Pattern5{
    public static void main(String args[]){
        for(int vertical_row = 1; vertical_row < 5; vertical_row++){
            for(int horizontal_column = 1; horizontal_column <= vertical_row; horizontal_column++){
                System.out.print(horizontal_column +" ");
            }
            System.out.println(" ");
        }
    }
}