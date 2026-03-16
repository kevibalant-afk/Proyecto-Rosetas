package rosetas;


import java.util.Scanner;

public class ROSETAS {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre[], producto[];
        double sa[], mov[], sf[];
        int n;

        System.out.print("Ingrese cantidad de clientes: ");
        n = leer.nextInt();
        leer.nextLine();

        nombre = new String[n];
        producto = new String[n];
        sa = new double[n];
        mov = new double[n];
        sf = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nCliente #" + (i + 1));
            System.out.print(   "Nombre: ");
            nombre[i] = leer.nextLine();
            System.out.print("Producto (ahorro/credito): ");
            producto[i] = leer.nextLine();
            System.out.print("Saldo anterior: ");
            sa[i] = leer.nextDouble();
            System.out.print("Movimiento: ");
            mov[i] = leer.nextDouble();
            leer.nextLine(); 

            if (producto[i].equalsIgnoreCase("ahorro")) {
                sf[i] = sa[i] + mov[i];
            } else {
                sf[i] = sa[i] - mov[i];
            }

     
        }

        System.out.println("\nResumen de Clientes:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + nombre[i] + " - " + producto[i] +
                               " | Saldo Final: " + sf[i]);
        }

        leer.close();
    }

}   
       
