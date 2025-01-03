import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
public class timerTaskmain {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int counter = 10;
            @Override
            public void run() {
                if(counter>0) {
                    System.out.println(counter+" seconds");
                    counter--;
                }
                else {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };

        //timer.schedule(task, 0); run instantly
        //timer.schedule(task, 3000); run in 3000 milli seconds

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2020);
        date.set(Calendar.MONTH,Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,31);
        date.set(Calendar.HOUR_OF_DAY,23);
        date.set(Calendar.MINUTE,59);
        date.set(Calendar.SECOND,50);
        date.set(Calendar.MILLISECOND,0);

        //timer.schedule(task, 0);
        //timer.schedule(task, date.getTime());
        //timer.scheduleAtFixedRate(task, 0, 1000);
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);
    }

}
