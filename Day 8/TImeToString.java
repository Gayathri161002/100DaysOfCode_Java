import java.util.*;

public class TImeToString {
    public static void timeNumFunc(int h, int m) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};

        String timeStr = "";

        if (h >= 1 && h <= 10) {
            timeStr += ones[h] + " ";
        } else if (h >= 11 && h <= 19) {
            timeStr += teens[h - 10] + " ";
        } else if (h >= 20 && h <= 23) {
            timeStr += tens[h / 10] + " ";
        } else if (h == 0 || h == 24) {
            timeStr += "twelve ";
        }

        if (m >= 1 && m <= 10) {
            timeStr += ones[m] + " ";
        } else if (m >= 11 && m <= 19) {
            timeStr += teens[m - 10] + " ";
        } else if (m >= 20 && m < 60) {
            timeStr += tens[m / 10] + " ";
            if (m % 10 != 0) {
                timeStr += ones[m % 10] + " ";
            }
        }

        timeStr += "o' clock";

        System.out.print(timeStr);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();

        timeNumFunc(h, m);
    }
}
