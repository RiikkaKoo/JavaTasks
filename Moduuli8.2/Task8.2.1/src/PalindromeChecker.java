public class PalindromeChecker {

    public boolean isPalindrome(String string) {
        String originalLowercase = string.toLowerCase();
        String originalNoSpaces = removeSpaces(originalLowercase);
        String originalNoPunctuation = removePunctuation(originalNoSpaces);

        String flipped = flip(originalLowercase);
        String noSpaces = removeSpaces(flipped);
        String noPunctuation = removePunctuation(noSpaces);

        return noPunctuation.equals(originalNoPunctuation);
    }


    private String flip(String original) {
        String flipped = "";
        for (int i = 0; i < original.length(); i++) {
            flipped += original.charAt(original.length()-(1 + i));
        }
        return flipped;
    }

    private String removeSpaces(String string) {
        String[] strings = string.split(" ");
        String gather = "";
        for (String str : strings) {
            if (!str.equals(" ")) {
                gather += str;
            }
        }
        return gather;
    }

    private String removePunctuation(String string) {
        String[] strings = string.split(",");
        String gather = "";
        for (String str : strings) {
            if (!str.equals(",")) {
                gather += str;
            }
        }
        return gather;
    }
}
