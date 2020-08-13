public class FibonacciRow {

    public static void main(String[] args) {
        fibonacciIter(10); // вызов метода вычисления фибоначчи итарционно

        for(int i=0; i<10; i++){
            System.out.print(fibonacciRec(i) + ", "); // вызов метода вычисления фибоначчи рекурсионно
        }


    }

    public static void fibonacciIter(int number){
        int firstNumber = 0;
        int nextNumber = 1;
        int bufferedNumber;
        System.out.print(firstNumber + ", ");
        for (int i = 1; i<number; i++ ){
            System.out.print(nextNumber + ", ");
            bufferedNumber = nextNumber;
            nextNumber += firstNumber;
            firstNumber = bufferedNumber;

        }
    }

    public static int fibonacciRec(int n){
        if (n < 2) {
            return n;
        }
        else {
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
        }

    }
}
