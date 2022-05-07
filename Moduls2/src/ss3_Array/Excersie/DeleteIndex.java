package ss3_Array.Excersie;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        do {
            int[] newArray = {1, 22, 12, 14, 50};
            Scanner input = new Scanner(System.in);
            int index = newArray.length - 1;
            System.out.println("Enter number to delete: ");
            int numberToCheck = input.nextInt();
            boolean flag = true;
            //duyệt vòng for đầu để kiếm số cần check;
            for (int i = 0; i < newArray.length; i++) {
                if (numberToCheck == newArray[i]) {

                    //khi tìm thấy số cần check lặp tiếp vòng for tù vị trí i đến cuối mảng;
                    for (int j = i; j < newArray.length - 1; j++) {

                        //gán vị trí cần xóa cho phần tử sau + lên 1;
                        newArray[j] = newArray[j + 1];
                        flag = false;
                    }
                    newArray[index] = 0;
                    // gán vị trí phần tử có độ dài là length-1 = 0;
                    i--;
                }

            }
            if (flag) {
                System.out.println("Not found X to delete");
            }
            System.out.println(Arrays.toString(newArray));
        } while (true);
    }
}
