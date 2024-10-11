package Array;

public class ControllerFibonacci {

    public static void main(String[] args) {

        Array a = new Array();

        
        long[] result = a.fibonacciSeries();
      
        System.out.println("Even Fibonacci numbers stored in the array:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("A[" +i+ "]    =>"+result[i]);
        }

       
        long sum = a.sumEvenFibonacci();
        System.out.println("Sum of even Fibonacci numbers: " + sum);
    }
}

