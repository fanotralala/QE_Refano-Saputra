public class SoalEksplorasi1 {
    
    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE")); 
        System.out.println(encrypt("ALTERRA ACADEMY")); 
        System.out.println(encrypt("INDONESIA")); 
        System.out.println(encrypt("GOLANG")); 
        System.out.println(encrypt("PROGRAMMER")); 
    }

    public static String encrypt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char charAt = text.charAt(i);
            if (Character.isAlphabetic(charAt)) {
                int asciiCode = charAt + 10;
                if (Character.isLowerCase(charAt)) {
                    if (asciiCode > 'z') {
                        asciiCode -= 26;
                    }
                } else {
                    if (asciiCode > 'Z') {
                        asciiCode -= 26;
                    }
                }
                result += (char) asciiCode;
            } else {
                result += charAt;
            }
        }
        return result;
    }
}
