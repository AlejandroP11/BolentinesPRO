package SegundaValiacion.Boletin23;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Boletin23 {
    public static void main(String[] args) {
        String uno = new String("Esto e Java!");
        int longitud = uno.length();
        System.out.println("Longitud : " + longitud);

        String dos = new String("Java");
        for (int i = 0; i < dos.length(); i++) {
            System.out.println(dos.charAt(i));
        }

        String tres = new String("Java desde 0");
        StringBuilder tresb = new StringBuilder(tres);
        tres = tresb.reverse().toString();
        System.out.println(tres);

        String cuatro = new String("James Gosling Created Xava");
        String cuatrob = cuatro.replaceAll("\\s+", "");
        System.out.println(cuatrob);

        String cinco = new String("java java java");
        int voc = 0, con = 0;
        cinco = cinco.toLowerCase(Locale.ROOT);
        for (int i = 0; i < cinco.length(); i++) {
            char ch = cinco.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                voc++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                con++;
            }

        }
        System.out.println("Vocales : " + voc);
        System.out.println("Consonantes : " + con);


        String seis = new String("www.java,desde0.com");
        String[] split = seis.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        String siete = new String("javeros");
        String sieteb = siete.toUpperCase(Locale.ROOT);
        System.out.println(sieteb);
        sieteb = sieteb.toLowerCase(Locale.ROOT);
        System.out.println(sieteb);

        String ocho = new String("Java");
        String ochob = new String("Javascript");
        System.out.println(ocho.equals(ochob));

        String nueve = new String("jeve jeve jeve");
        System.out.println(nueve.replaceAll("e", "a"));

        String diez = new String("ABCD");
        byte[] numero = diez.getBytes(StandardCharsets.US_ASCII);
        System.out.println("ASCII Numeric Value of b: " + numero[0]);
        System.out.println("ASCII Numeric Value of a: " + numero[1]);
        System.out.println("ASCII Numeric Value of l: " + numero[2]);
        System.out.println("ASCII Numeric Value of l: " + numero[3]);

        String once = new String("Hola, soy alumno de DAM1, y soy programador desde 2021");
        int letras = 0, digitos = 0, espacios = 0;
        for (int i = 0; i < once.length(); i++) {
            char ch = once.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letras++;
            } else if (ch >= '0' && ch <= '9') {
                digitos++;
            } else if (ch >= 'A' && ch <= 'Z') {
                letras++;
            } else if (ch == ' ') {
                espacios++;
            }
        }
        System.out.println("Letras :" + letras+"\nDígitos :" + digitos+"\nEspacios :" + espacios);
    }
}