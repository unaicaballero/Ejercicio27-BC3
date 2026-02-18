import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.List;

public class LeerListaEmpleados {
    public static void main(String[] args) {

        String archivo = "empleados.dat";

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(archivo))) {

            List<Empleado> empleados = (List<Empleado>) in.readObject();

            System.out.println("Empleados leídos desde el archivo: ");

            for (Empleado e : empleados) {
                System.out.println(e);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer empleados: " + e.getMessage());
        }
    }
}
