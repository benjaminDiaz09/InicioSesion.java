import java.util.Scanner;
public class InicioSesion {
    private static final Scanner scanner = new Scanner (System.in);
    public static String obtenerCadena(String mensaje) {
        String cadenaTemporal;
        System.out.println(mensaje + ": ");
        cadenaTemporal = scanner.nextLine();
        return cadenaTemporal;
    }

    public static void main(String[] args) {

        // Declara las variables 
        String nombreUsuario = "benjamin";
        String contrasenaUsuario = "1234";

        // Ingresar los nombres a comparar 
        String usuarioIngresado = obtenerCadena("Ingresa tu usuario: ");
        String contrasenaIngresado = obtenerCadena("Ingresa tu contraseña: ");

        if (nombreUsuario.equals(usuarioIngresado)  && contrasenaUsuario.equals(contrasenaIngresado)) {
            System.out.println("Bienvenidos a Facebook");
        } else {
            System.out.println("Error usuario o contraseña incorrecta intente de nuevo");
            System.out.println("Derechos reservados");
        }
    }
}