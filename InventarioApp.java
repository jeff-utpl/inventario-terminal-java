import java.util.Scanner;

public class InventarioApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.println("Precio: ");
        double precio = scanner.nextDouble();
        Producto producto = new Producto(nombre, precio);
        System.out.println("Producto registrado.");
        producto.mostrar();
        scanner.close();

    }
}
