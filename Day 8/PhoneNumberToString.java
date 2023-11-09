import java.util.*;

public class PhoneNumberToString {
    public static String phNumFunc(int y) {
        switch (y) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 0:
                return "zero";
            default:
                return ""; 
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String[] A = new String[10];
        int k = 0;

        while (num != 0) {
            int y = num % 10;
            A[k] = phNumFunc(y);
            k++;
            num = num / 10;
        }

        for (int i = k - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
    }
}
