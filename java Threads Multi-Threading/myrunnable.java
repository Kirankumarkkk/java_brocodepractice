package javathreads;

public class myrunnable implements Runnable{

    @Override

    public void run(){

        for(int i=0;i<5;i++){
            System.out.println("count down "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("my Runnable thread# 2 java running ");

    }
}
