import java.util.Scanner;

public class TugasNo3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int intArr[] = { 1, 2, 3, 4, 6 };

            System.out.print("Masukkan Target : ");
            int Target = in.nextInt();

            for (int i = 0; i < intArr.length; i++) {
                for (int j = 0; j < intArr.length; j++) {
                    int sum = intArr[i] + intArr[j];
                    if (sum == Target) {
                        System.out.println("[" + i + ", " + j + "]");
                        return;
                    }
                }
            }
        }
    }
}