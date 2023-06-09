import java.util.Scanner;
public class Function1{
    // No Argument and No Return 
    public void noArgumentWithNoReturn(){
        System.out.println("1. Function with no Argument and no return type");
    }
    // With Argument and No Return 
    public void withArgumentAndNoReturn(int argument1){
        System.out.println("2. withArgumentAndNoReturn"+ argument1);
    }
    
    // No Argument and With Return 
    public int noArgumentWithReturn(){
        System.out.println("3. No Argument and With Return");
        return 0;
    }
    
    // With Argument and With Return Type
    public int withArgumentWithReturnType(int firstArgument, int secondArgument){
       System.out.println("4. Function with Argument and Return Type : " + firstArgument +" " + secondArgument);
        return 1;
    }

    
    public static void main(String args[]){
        int day;

        do{
             System.out.println("Enter Choice : ");
             System.out.println("1> No Argument and No Return"); 
             System.out.println("2> With Argument and No Return");
             System.out.println("3> No Argument and With Return");
             System.out.println("4> With Argument and With Return Type ");
            Scanner scanner = new Scanner(System.in);    
                day = scanner.nextInt();
                     Function1 function1 = new Function1();
            switch(day){
                case 1 : 
                    function1.noArgumentWithNoReturn();
                    break;
                    case 2 :
                        function1.withArgumentAndNoReturn(1);
                        break;
                        case 3 :
                            function1.noArgumentWithReturn();
                            break;
                            case 4 :
                                function1.withArgumentWithReturnType(2,3);
                                break;
                                default:
                                    System.out.println("Invalid"); 

        }
        }while(day != 5);
       
    }
}