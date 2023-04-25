public class StringManipulator {

    // Metodo trim and concat
    public String trimAndConcat(String word1, String word2) {
        String cadena;
        cadena = word1.trim() + word2.trim();
        return cadena;
    }

    // Metodo indexof
    public int getIndexOrNull(String word, char caracter) {
        int cadena = word.indexOf(caracter);
        return cadena;
    }

    // Metodo indexof string - string
    public int getIndexOrNull(String word, String subString) {
        int cadena = word.indexOf(subString);
        return cadena;
    }

    // Metodo concat substring
    public String concatSubstring(String word1, int num1, int num2, String word2) {
        String cadenaSubstring = word1.substring(num1, num2);
        String cadena = cadenaSubstring + word2;
        return cadena;
    }
}