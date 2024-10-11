package Array;

public class Array {
    int evenCount = 20; 
    int currentIndex = 0;  
    long[] array = new long[evenCount];  

    public Array() {																							
      
    }
  //***************************************************************************
    public long[] fibonacciSeries() {
        long a = 0, b = 1;

        
        while (currentIndex < evenCount) {
            long next = a + b;
            a = b;
            b = next;

          
            if (next % 2 == 0) {
                arrayInsert(next);
            }
        }

        return array;
    }

   //*****************************************************************************
    
    
    public void arrayInsert(long num) {
        if (currentIndex < array.length) {
        	
            array[currentIndex] = num;
            currentIndex++;
        }
    }

    //****************************************************************************
    public long sumEvenFibonacci() {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
