public class Primes {
    public static void main(String[] args) {
        int nValues = 50;

        start:
        for (int i = 2; i <= nValues; i++) {

            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0) {
                    continue start;
                }
            }
            System.out.println(i);
        }
    }
}