package examPractise;

abstract class AbstInter {
    int a;
    AbstInter()
    {
        this.a = 100;
    }

    static void myMethod()
    {
        System.out.println("display vaye");
    }
    
    abstract void run();

    public static void main(String[] args) {
        AbstInter obj = new AbstInter() {
            void run()
            {
                System.out.println("Hello");
            }
        };
        obj.run();
        myMethod();
    }
}
