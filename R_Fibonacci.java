import java.util.stream.*;

public class R_Fibonacci {
    private static long number=0;

    public static void main(String[] args) {
        LongStream.iterate(1, n -> {n+=number;number=n-number;return n;}).
                limit(92).forEach(System.out::println); //Можно вывести 92, дальше влонг не лезет нужно использовать BigInteger[]
        }
}

