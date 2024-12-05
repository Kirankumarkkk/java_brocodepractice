public class InnerClassmain {
    public static void main(String[] args) {

        outSideclass out=new outSideclass();
        outSideclass.inSideclass in=out.new inSideclass();
        in.greetings();
    }
}
