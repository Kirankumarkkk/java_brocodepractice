package javathreads;

public class mymultithread extends Thread{

    @Override

    public void run(){

        for(int i=10;i>0;i--){
            System.out.println("count down "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("mymultithread #1 is done");
    }
}
