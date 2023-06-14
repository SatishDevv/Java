package exceptionHandling;

// ArithmeticException



public class Ex1 {
    public static void main(String[] args) {
        System.out.println("hii");
            int a = 10/0; // we can't divide any number by zero. that why we get ArithmeticException. at the run time by JVM.
            System.out.println(a); 

        System.out.println("hello");
    }
}
