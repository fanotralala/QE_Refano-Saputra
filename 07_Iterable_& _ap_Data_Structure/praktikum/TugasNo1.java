import java.util.Arrays;
import java.util.LinkedHashSet;

public class TugasNo1 {
    public static void main(String[] args) throws Exception {
        String[] kel1 = { "Budi", "Puguh", "Slamet" };
        String[] kel2 = { "Budi", "Sudarso" };

        String[] hasilGabung = gabunginSemua(kel1, kel2);
        System.out.println(Arrays.toString(hasilGabung));

    }

    public static String[] gabunginSemua(String[] kel1, String[] kel2) {
        LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(kel1));

        set.addAll(Arrays.asList(kel2));

        String[] gabunginKel = set.toArray(new String[set.size()]);

        return gabunginKel;
    }
}
