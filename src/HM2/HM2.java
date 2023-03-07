package HM2;

import java.util.Arrays;

public class HM2 {
         public static void main(String[] args) {
            int[] reverseOrder = {2, 3, 1, 7, 11};
            for (int i = reverseOrder.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (reverseOrder[j + 1] > reverseOrder[j]) {
                        int num = reverseOrder[j + 1];
                        reverseOrder[j + 1] = reverseOrder[j];
                        reverseOrder[j] = num;
                        System.out.println(Arrays.toString(reverseOrder));
                    }
                }
            }
        }

    }
