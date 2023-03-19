import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class TugasNo2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<Integer> intArr = new ArrayList<>();
            ArrayList<Integer> outputArr = new ArrayList<>();

            System.out.print("Masukkan Data : ");
            String input = in.nextLine();
            for (int i = 0; i < input.length(); i++) {
                intArr.add(Integer.parseInt(input.substring(i, i + 1)));
            }
            HashMap<Integer, Integer> map = new HashMap<>();

            for (Integer key : intArr) {
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            }

            for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (value > 1) {
                } else {
                    outputArr.add(key);
                }
            }

            Collections.sort(outputArr, Collections.reverseOrder());
            System.out.println(outputArr);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}