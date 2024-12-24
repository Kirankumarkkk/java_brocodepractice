package javathreads;

public class mymultithreadingmain {
    public static void main(String[] args) throws InterruptedException {

    mymultithread thread1=new mymultithread();
   //thread1.run();

        //or

        myrunnable runnable1= new myrunnable();
        Thread thread2=new Thread(runnable1);
        //thread2.run();
        //thread1.setDaemon(true); //set Daemon true
        //thread2.setDaemon(true);

        thread1.start();
        thread1.join(2000);   //running thread 1 start then thread 2
        thread2.start();



    }
}
