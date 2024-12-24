package javathreads;

public class mythread extends Thread{

    @Override
    public void run(){
        if(this.isDaemon()) {
            System.out.println("this isDaemon thread ");
        }
        else {
            System.out.println("this user thread");
        }
    }
}
