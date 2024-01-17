class CreateThread extends Thread{
    public void run(){
        System.out.println("Thread is Running!!!");
    }
    public static void main(String args[]){
        Thread ct = new CreateThread();
        ct.start();
        CreateThread ct1 = new CreateThread();
        ct1.start();
    }
}