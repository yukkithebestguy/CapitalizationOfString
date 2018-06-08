
public class Main {

    public static void main(String[] args) {
        String str = "He     hit His hAnd agaInst      hIs leg Several times until     he felt a sharp pain. " +
                "then he QuiCkly pUt his glove on his hand. g";
        System.out.println(str);
        System.out.println(capitalize(str));
    }

    private static String capitalize(String str) {
        if (str != null && str.length() != 0) {
            return getCapitalizeString(str);

        } else {
            return str;
        }
    }

    private static String getCapitalizeString(String str) {
        char[] chars =
                str.trim()
                        .replaceAll("\\s+", " ")
                        .toLowerCase()
                        .toCharArray();
        return new String(handleCharsArray(chars));
    }

    private static char[] handleCharsArray(char[] chars){
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length; i++) {

            if ((chars[i] == '!') || (chars[i] == '?') || (chars[i] == '.')) {
                if ((i < chars.length - 2) && (chars[i + 1] == ' ')) {
                    i += 2;
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
        }
        return chars;
    }
}
