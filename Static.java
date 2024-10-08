
class StaticDemo{
    private static int ObjCount = 0;

    StaticDemo(){
        ObjCount++;
    }

    static void CountObjects(){
        System.out.println("No Of Objects Created : "+ObjCount);
    }
}

class Static {
    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();
        StaticDemo s3 = new StaticDemo();
        StaticDemo s4 = new StaticDemo();
        StaticDemo s5 = new StaticDemo();
        StaticDemo s6 = new StaticDemo();
        StaticDemo s7 = new StaticDemo();

        StaticDemo.CountObjects();
    }
}
