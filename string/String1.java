
class String1 {
    public static void main(String args[]) {
        String first = "o7services";
        String second = "O7SERVICES";
        
        //equal
        boolean result = first.equalsIgnoreCase(second);
        System.out.println(result);
        
        //boolean result2 = first.equal(second);
        //System.out.println(result2);
        
        
        // convert first string into upper case
        System.out.println(first +" : "+ first.toUpperCase());

        //convert second string into lower case
        System.out.println(second +" : "+ second.toLowerCase());

        //charAt()
        System.out.println(first +" : "+first.charAt(2));
        System.out.println(second +" : "+second.charAt(4));

        //Concatenation
        String third = first + second;
        System.out.println(third);
    }
}
