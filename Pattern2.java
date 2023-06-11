class Pattern2{
    public static void main(String args[]){
        int vertical_row,horizontal_column;
        for(vertical_row = 5; vertical_row >= 0; vertical_row--){
            for(horizontal_column = 0; horizontal_column <= vertical_row; horizontal_column++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(vertical_row = 1; vertical_row <= 5; vertical_row++){
            for(horizontal_column = 0; horizontal_column <= vertical_row; horizontal_column++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
        
}