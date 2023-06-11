class Pattern3{
    public static void main(String args[]){
        int row, column;
        for(row = 1; row <= 4; row++){
            
            for(column = 1; column <= 4-row; column++){
                System.out.print(" ");
                
            } 
            for(int k = 1; k <= row; k++){
        System.out.print("*");
            }
            System.out.println();
        }
         
       
        }
       
    }

