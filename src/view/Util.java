
/**
 * 
 * @author danigil
 * @version v1.2023
 * @since 3-2023
 * 
 * <p>Esta clase Util, se encarga de metodos para facilitar el uso de leer variables o escribirlas</p>
 *
 */

package view;

import java.util.Scanner;

public class Util {
public static double leerDouble(String pregunta) {
Scanner teclado = new Scanner(System.in);
double respuesta;
System.out.println(pregunta);
respuesta = Double.parseDouble(teclado.nextLine());
return respuesta;
}

public static void escribir(int a) {
System.out.println(a);
}

public static int leerInt(String pregunta) {
Scanner teclado = new Scanner(System.in);
int respuesta;
System.out.println(pregunta);
respuesta = Integer.parseInt(teclado.nextLine());
return respuesta;
}

public static void escribir(String texto) {
System.out.println(texto);
}

public static int leerString(String pregunta) {
Scanner teclado = new Scanner(System.in);
int respuesta;
System.out.println(pregunta);
respuesta = Integer.parseInt(teclado.nextLine());
return respuesta;
}

}