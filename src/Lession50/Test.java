package Lession50;

public class Test {
    public static void main(String[] args) {
//        someMethod();
//        counter(3);
        System.out.println(fac(11));
    }
//    public static void someMethod(){
//        System.out.println("Hello!");
//        someMethod();
//    }
//    public static void counter(int n){
//        if (n == 0) {
//            return;
//        }
//        System.out.println(n);
//        counter(n-1);
//    }
    private static int fac(int n){
        if (n == 1) return 1;
        System.out.println(n);
        return n*fac(n-1);
    }
}
