import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Facturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File archivo = new File("Empleados.txt");

        System.out.println("Introduce el código del cliente");
        String codigoCliente = sc.nextLine();

        // Datos de la empresa
        String nombreCliente = "Beragua";
        String direccionCliente = "c/pintor segundo";
        String ciudadCliente = "Madrid";
        String codPostalCliente = "28942";
        String paisCliente = "España";
        String telefonoCliente = "654987321";

        // Pedidos del cliente
        Map<Integer, Pedido> pedidos = new HashMap<>();
        pedidos.put(14, new Pedido(14, LocalDate.of(2009, 1, 2), "rechazado", "mal pago",
                List.of(new Producto("FR-13", "Kunquat EXTRA con FRUTA", 13, 57.0),
                        new Producto("FR-100", "Nectarina", 8, 11.0))));
        pedidos.put(16, new Pedido(16, LocalDate.of(2009, 1, 6), "entregado", null,
                List.of(new Producto("30310", "Azadón", 12, 12.0),
                        new Producto("FR-36", "Granado Mollar de Elche", 10, 9.0))));
        pedidos.put(17, new Pedido(17, LocalDate.of(2009, 1, 8), "entregado", "mal estado",
                List.of(new Producto("11679", "Sierra de Poda 400MM", 5, 14.0),
                        new Producto("FR-37", "Higuera Napolitana", 5, 9.0),
                        new Producto("22225", "Rastrillo de Jardín", 5, 12.0),
                        new Producto("FR-64", "Cerezo", 5, 22.0),
                        new Producto("OR-136", "Nerium oleander ARBOL Calibre 8/10", 5, 18.0))));
        pedidos.put(15, new Pedido(15, LocalDate.of(2009, 1, 9), "entregado", null,
                List.of(new Producto("OR-156", "Acer platanoides", 6, 10.0),
                        new Producto("OR-101", "Expositor Mimosa Semilla Mix", 2, 6.0),
                        new Producto("FR-84", "Kaki", 4, 13.0),
                        new Producto("OR-203", "Pinus Canariensis", 9, 10.0))));
        pedidos.put(13, new Pedido(13, LocalDate.of(2009, 1, 12), "entregado", null,
                List.of(new Producto("11679", "Sierra de Poda 400MM", 5, 14.0),
                        new Producto("21636", "Pala", 12, 14.0),
                        new Producto("FR-11", "Limonero 30/40", 5, 100.0))));

        // generador de la factura
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Factura" + codigoCliente + ".txt"))) {
            // primera parte de la factura
            writer.write(nombreCliente + " " + direccionCliente + " " + ciudadCliente + " " + codPostalCliente + " " + paisCliente + " " + telefonoCliente + "\n");
            writer.write("\n");
            writer.write("------------------------------------------------------------------\n");
            writer.write("\n");

            // Cabecera 2 y detalle del pedido
            double subtotal = 0.0;
            for (Map.Entry<Integer, Pedido> entry : pedidos.entrySet()) {
                Pedido pedido = entry.getValue();
                writer.write(pedido.getCodigo() + " " + pedido.getFecha().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " " + pedido.getEstado() + " " + pedido.getComentarios() + "\n");
                writer.write("\n");
                writer.write("Código del Producto | Nombre | Cantidad | Precio Unidad | Importe\n");
                writer.write("-------------------------------------------------------------------\n");
                double totalPedido = 0.0;
                for (Producto producto : pedido.getProductos()) {
                    double importe = producto.getCantidad() * producto.getPrecioUnidad();
                    writer.write(producto.getCodigo() + " | " + producto.getNombre() + " | " + producto.getCantidad() + " | " + producto.getPrecioUnidad() + " | " + importe + "\n");
                    totalPedido += importe;
                }
                writer.write("-------------------------------------------------------------------\n");
                writer.write("Total Pedido: " + totalPedido + "\n");
                writer.write("\n");
                subtotal += totalPedido;
            }

            // Subtotal, total, IVA y importe a pagar
            writer.write("Subtotal: " + subtotal + "\n");
            writer.write("------------------------------------------------------------------\n");
            double iva = subtotal * 0.21;
            writer.write("IVA (21%): " + iva + "\n");
            writer.write("Importe a Pagar: " + (subtotal + iva) + "\n");
            writer.write("------------------------------------------------------------------\n");

        } catch (IOException e) {
            System.err.println("Error al generar la factura: " + e.getMessage());
        }

        String string = "Factura" + codigoCliente + ".txt";
        try{
            File file = new File(string);
            if (file.createNewFile()) {
                System.out.println("Fichero creado: " + file.getName());
            } else {
                System.out.println("El fichero ya existe");
            }
        }catch (IOException e) {
            System.out.println("Error: No puedo crear el fichero");
        }
    }
}

class Pedido {

    private int codigo;
    private LocalDate fecha;
    private String estado;
    private String comentarios;
    private List<Producto> productos;

    public Pedido(int codigo, LocalDate fecha, String estado, String comentarios, List<Producto> productos) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.estado = estado;
        this.comentarios = comentarios;
        this.productos = productos;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}

class Producto {

    private String codigo;
    private String nombre;
    private int cantidad;
    private double precioUnidad;

    public Producto(String codigo, String nombre, int cantidad, double precioUnidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }
}