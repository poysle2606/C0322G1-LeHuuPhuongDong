package ss3_Array.Practice;

public class FindMin {
    public static void main(String[] args) {
        int [] arrNumber = {3,6,2,9,10,4};
        int index = minInArray(arrNumber);
        System.out.println("Smaller element in array is: " + index);


    } public static int minInArray(int[] array){
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }

        }
        return min;
    }
}