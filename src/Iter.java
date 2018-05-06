/**
 * С помощью массива, в итерационном виде
 */

public class Iter {

    int cache[] = new int[100];

    int fibo(int n) {
        cache[0] = 1;
        cache[1] = 1;

        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n - 1];
    }



}
