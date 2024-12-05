public class InnerClassmain {
    public static void main(String[] args) {

        //outSideclass and inSideclass both classes
        outSideclass out=new outSideclass();
        outSideclass.inSideclass in=out.new inSideclass();
        in.greetings();

        //innerclassGreeting override 1

        innerclassGreeting innerclassGreeting1=new innerclassGreeting(){
            @Override
            public void greetings() {
                System.out.println("yo bro");
            }
        };

        innerclassGreeting1.greetings();

        //innerclassGreeting override 2

        innerclassGreeting innerclassGreeting2=new innerclassGreeting(){
            @Override
            public void greetings() {
                System.out.println("yo hello");
            }
        };

        innerclassGreeting2.greetings();

    }
}
