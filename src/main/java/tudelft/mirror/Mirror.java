package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;

        // Recorremos la cadena comparando los extremos
        while (begin < string.length() && string.charAt(begin) == string.charAt(end)) {
            mirror += string.charAt(begin); // Añadimos el carácter a mirror
            begin++;
            end--;
        }

        return mirror; // Retornamos la subcadena reflejada
    }
}
