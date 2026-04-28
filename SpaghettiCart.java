import java.util.*;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class SpaghettiCart { 

    static List<Product> cart = new ArrayList<>();
    static int currentId = 1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            menu();
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> add();
                case 2 -> list();
                case 3 -> update();
                case 4 -> delete();
                case 5 -> total();
                case 6 -> checkout();
                case 7 -> clear();
                case 8 -> System.exit(0);
                default -> System.out.println("Opción inválida");
            }
        }
    }

    static void menu() {
        System.out.println("\n--- CARRITO SPAGHETTI ---");
        System.out.println("1. Agregar");
        System.out.println("2. Listar");
        System.out.println("3. Editar");
        System.out.println("4. Eliminar");
        System.out.println("5. Total");
        System.out.println("6. Pagar");
        System.out.println("7. Vaciar carrito");
        System.out.println("8. Salir");
    }

    static void add() {
        System.out.print("Nombre: ");
        String name = sc.nextLine();

        System.out.print("Precio: ");
        double price = sc.nextDouble();

        if (name.isBlank() || price <= 0) {
            System.out.println("Datos inválidos");
            return;
        }

        cart.add(new Product(currentId++, name, price));
        System.out.println("Producto agregado");
    }

    static void list() {
        if (cart.isEmpty()) {
            System.out.println("Carrito vacío");
            return;
        }

        for (Product p : cart) {
            System.out.println(p.id + " - " + p.name + " - $" + p.price);
        }
    }

    static void update() {
        System.out.print("ID a editar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Product p : cart) {
            if (p.id == id) {
                System.out.print("Nuevo nombre: ");
                p.name = sc.nextLine();

                System.out.print("Nuevo precio: ");
                p.price = sc.nextDouble();

                System.out.println("Actualizado");
                return;
            }
        }

        System.out.println("No encontrado");
    }

    static void delete() {
        System.out.print("ID a eliminar: ");
        int id = sc.nextInt();

        cart.removeIf(p -> p.id == id);
        System.out.println("Eliminado");
    }

    static void total() {
        double total = 0;

        for (Product p : cart) {
            total += p.price;
        }

        if (total > 50) total *= 0.9;

        System.out.println("Total: $" + total);
    }

    static void checkout() {
        sc.nextLine();
        System.out.print("Nombre cliente: ");
        String name = sc.nextLine();

        System.out.print("Correo: ");
        String email = sc.nextLine();

        if (name.isBlank() || email.isBlank()) {
            System.out.println("Datos inválidos");
            return;
        }

        double total = 0;
        for (Product p : cart) {
            total += p.price;
        }

        if (total > 50) total *= 0.9;

        System.out.println("\n--- FACTURA ---");
        System.out.println("Cliente: " + name);
        System.out.println("Correo: " + email);
        System.out.println("Total pagado: $" + total);

        cart.clear();
    }

    static void clear() {
        cart.clear();
        System.out.println("Carrito vacío");
    }
}