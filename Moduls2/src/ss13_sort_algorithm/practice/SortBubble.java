package ss13_sort_algorithm.practice;

public class SortBubble {
  static   int[] numb = {2,4,3,6,9,8,7,1};
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            /* Array may be sorted and next pass not needed */
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
        }
    }
    public static void main(String[] args) {
        bubbleSort(numb);
        for (int j : numb) System.out.print(j + " ");
    }

}
