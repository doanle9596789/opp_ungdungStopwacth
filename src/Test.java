import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        stopWatch.start();
        int[] arr = randomArr(100000);
        Arrays.sort(arr);
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());

    }

    public static int[] randomArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) Math.round(Math.random() * n);
        }
        return arr;
    }
}