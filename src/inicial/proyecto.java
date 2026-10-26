package inicial;

import java.util.Scanner;

public class proyecto {

	
	 
	 
	    // --- VARIABLES DE INSTANCIA ---

	    String nombre;

	    String apellido;

	    String cedula;

	    String servicio;

	    int turnoAsignado;
	 
	    // --- VARIABLE DE CLASE (static) ---

	    static int turnoSecuencial = 0;
	 
	    // --- MÉTODOS ---
	 
	    // 1. IngresarDatosU: Guarda los datos personales recibidos por parámetro

	    public void ingresarDatosU(String nombre1, String apellido1, String cedula1) {

	        this.nombre = nombre1;

	        this.apellido = apellido1;

	        this.cedula = cedula1;

	    }
	 
	    // 2. GenerarServicio: Guarda el servicio, incrementa la secuencia de clase y asigna el turno a la instancia

	    public void generarServicio(String servicio1) {

	        this.servicio = servicio1;

	        turnoSecuencial++; // Incrementa el contador general de la clase

	        this.turnoAsignado = turnoSecuencial; // Asigna el turno único a este usuario

	    }
	 
	    // 3. ImprimirInfo: Muestra los datos guardados incluyendo el # de turno asignado

	    public void imprimirInfo() {

	        System.out.println("\n--- INFORMACIÓN DEL TURNO ---");

	        System.out.println("Cliente: " + this.nombre + " " + this.apellido);

	        System.out.println("Cédula: " + this.cedula);

	        System.out.println("Servicio: " + this.servicio);

	        System.out.println("Turno Asignado: #" + this.turnoAsignado);

	    }
	 
	    // 4. AsignaCubiculo: Llama a imprimirInfo() y muestra el cubículo asignado

	    public void asignaCubiculo(int cubiculosOcupado) {

	        imprimirInfo();

	        System.out.println("Cubículo Asignado: #" + cubiculosOcupado);

	        System.out.println("-----------------------------\n");

	    }
	 
	    // --- MÉTODO PRINCIPAL (MAIN) PARA EJECUTAR EN ECLIPSE ---

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	 
	        // Creamos el primer objeto (Usuario 1)

	        SistemaTurnos usuario1 = new SistemaTurnos();
	 
	        System.out.println("=== REGISTRO DE USUARIO ===");

	        // Pedir datos para el método 1

	        System.out.print("Ingrese su nombre: ");

	        String nom = sc.nextLine();

	        System.out.print("Ingrese su apellido: ");

	        String ape = sc.nextLine();

	        System.out.print("Ingrese su cédula: ");

	        String ced = sc.nextLine();
	 
	        // Llamada al método 1 (guardar datos)

	        usuario1.ingresarDatosU(nom, ape, ced);
	 
	        // Pedir datos para el método 2

	        System.out.print("Ingrese el servicio requerido (ej. Caja, Balcón de servicios): ");

	        String serv = sc.nextLine();
	 
	        // Llamada al método 2 (guardar servicio y asignar turno)

	        usuario1.generarServicio(serv);
	 
	        // Pedir el número de cubículo para el método 4

	        System.out.print("Ingrese el número de cubículo a asignar: ");

	        int cubiculo = sc.nextInt();
	 
	        // Llamada al método 4 (que internamente llama al método 3 imprimirInfo + muestra el cubículo)

	        usuario1.asignaCubiculo(cubiculo);
	 
	        sc.close();

	    }

	
	 


