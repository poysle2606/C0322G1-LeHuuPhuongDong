package ss12_search_algorithm.practice;

public class BinarySearch {
    static int[] arr = {2,3,4,5,6,7,8,9,1};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(arr, 2));  /* 0 */
        System.out.println(binarySearch(arr, 11)); /* 4 */
        System.out.println(binarySearch(arr, 79)); /*12 */
        System.out.println(binarySearch(arr, 1));  /*-1 */
        System.out.println(binarySearch(arr, 5));  /*-1 */
        System.out.println(binarySearch(arr, 80)); /*-1 */
    }
}
