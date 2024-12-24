package javathreads;

//java virtual machine continues to execute threads until either of 1. the exit method of class runtime has been called  , 2 . all user threads have died

public class javathreadsmain {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("hey thread");
        Thread.currentThread().setName("javathreadsmain");
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        boolean alive = Thread.currentThread().isAlive();
        System.out.println(alive);
        for(int i=3;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("thread is done");

        mythread thread1= new mythread();

        thread1.setDaemon(true);   //false for undo Daemon
        System.out.println(thread1.isDaemon());

        System.out.println(thread1.currentThread().getName());
        thread1.start();

        //System.out.println(thread1.currentThread().isAlive());
        //System.out.println(thread1.activeCount());





    }
}
