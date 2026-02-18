import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GuardarEmpleados {
    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("Ana", 1, 2000));
        empleados.add(new Empleado("Luis", 2, 2500));
        empleados.add(new Empleado("Carlos", 3, 1800));

        String archivo = "empleados.dat";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {

            out.writeObject(empleados);

            System.out.println("Lista de empleados guardada correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar empleados: " + e.getMessage());
        }
    }
}
