package ss4_OOP.Excersie.StopWatch;

public class MainOfStopWatch {

    public static void selectionSort(long... arr) {
        int num = arr.length;
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[j] < arr[i]) {
                    long tempt = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempt;
                }
            }
        }
    }

    public static void main(String[] args) {
        long[] maxNumber = new long[100000];
        StopWatch time = new StopWatch();
        for (int i = 0; i < 100000; i++) {
            maxNumber[i] = (long) (Math.random() * 10000);
        }

        time.start();
        selectionSort(maxNumber);
        time.stop();
        System.out.println("Time to soft 100.000 number is :" + time.getElapsedTime() + " milisecond");

    }
}