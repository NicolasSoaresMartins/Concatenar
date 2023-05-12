public class Concatenar {
    public static String concatenarStrings(String[] strings) {
        String resultado = "";
        for (int i = 0; i < strings.length; i++) {
            resultado += strings[i];
            if (i < strings.length - 1) {
                resultado += " ";
            }
        }
        return resultado;
    }
}
