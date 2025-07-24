import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InventarioApp {
    public static void main(String[] args){
        System.out.println("Bienvenido al sistema de inventario interactivo mejorado por capas.");
        System.out.println("--------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.println("Precio: ");
        double precio = scanner.nextDouble();
        if(precio < 0){
            System.out.println("El precio debe ser mayor a 0.");
            return;
        }
        Producto producto = new Producto(nombre, precio);
        System.out.println("Producto registrado.");
        producto.mostrar();
        scanner.close();
        
        try {
            FileWriter escritor = new FileWriter("inventario.txt, true");
            escritor.write(nombre + " -$" + precio + "\n");
            escritor.close();
        } catch (IOException e) {
            System.out.println(" Error al escribir en archivo: " + e.getMessage());
        }
    }
}
