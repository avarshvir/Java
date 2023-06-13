class StringBufferAndBuilderCompare{

    public static void main(String args[]){
        // StringBuffer     --->      Synchronize
        StringBuffer sb = new StringBuffer("testing");
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 5000; i++){
            sb.append("test");
        }
        System.out.println("String Buffer Time "+ (System.currentTimeMillis() - startTime));
        // StringBuilder     --->     Asynchronize
        StringBuilder stringBuilder = new StringBuilder("testing");
        long bufferStartTime = System.currentTimeMillis();
        for(int i = 0; i < 5000; i++){
            stringBuilder.append("test");
        }
        System.out.println("String Builder Time "+ (System.currentTimeMillis() - bufferStartTime));
                      
    }
}