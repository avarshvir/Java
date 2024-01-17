class CreateThread implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        CreateThread r1 = new CreateThread();
        Thread t1 = new Thread(r1);
        t1.isAlive();
        t1.start();
    }
}