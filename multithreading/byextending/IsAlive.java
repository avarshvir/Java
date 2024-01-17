class IsAlive extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Thread "+ i + "running");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[]){
        IsAlive ia = new IsAlive();
        ia.start();
        while(ia.isAlive()){
            System.out.println("Thread is Still alive");
            try{
                Thread.sleep(500);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("finished");
    }
}