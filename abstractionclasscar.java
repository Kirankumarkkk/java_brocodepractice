public class abstractionclasscar extends abstractionclassvehicle{
    @Override
    void go() {
        System.out.println("vehicle is going");
    }

    @Override
    void stop() {
        System.out.println("vehicle is not going");
    }
}
